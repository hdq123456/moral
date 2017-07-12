package com.pykj.moral.service.impls;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pykj.moral.dao.DormscoreinfoMapper;
import com.pykj.moral.entity.Classscoreinfo;
import com.pykj.moral.entity.Dormscoreinfo;
import com.pykj.moral.entity.Stdscoreinfo;
import com.pykj.moral.service.ClassscoreinfoService;
import com.pykj.moral.service.DormscoreinfoService;
import com.pykj.moral.service.StdscoreinfoService;

@Service("dormscoreinfoService")
public class DormscoreinfoServiceImpl<T> implements DormscoreinfoService<T> {

	@Resource
	DormscoreinfoMapper<T> dormscoreinfoDao;
	
	@Resource
	StdscoreinfoService<T> stdsocreinfoService;
	
	@Resource
	ClassscoreinfoService<T> classscoreinfoService;
	
	@Override
	public void deleteByPrimaryKey(Integer uid) {
		dormscoreinfoDao.deleteByPrimaryKey(uid);
		
	}
	
	@Override
	public void insert(T t) {
		dormscoreinfoDao.insert(t);
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED) 
	public void insertSelective(Dormscoreinfo t) {
		
		int dormsize = dormscoreinfoDao.insertSelective(t);
		
		String stdinfo=t.getStudentinfo();
		JSONArray jarr = JSON.parseArray(stdinfo);
		for(int i=0,len=jarr.size();i<len;i++){
			JSONObject temp = jarr.getJSONObject(i);
			int tempstdid = temp.getInteger("studentid");
			System.out.println(tempstdid);
			
			//新增学生操行扣分
			Stdscoreinfo si = new Stdscoreinfo();
			si.setScorename(t.getScorename());
			si.setScorevalue(t.getScorevalue());
			si.setTypename("宿舍考核扣分");
			si.setEffective((byte)1);
			si.setOperator("wgf");
			si.setOperattime(new Date());
			stdsocreinfoService.insertSelective(si);
			
			//新增班级扣分
			Classscoreinfo ci = new Classscoreinfo();
			ci.setClassid(412);
			ci.setTypeid(7); //宿舍考核扣分类型;
			ci.setScorename(t.getScorename());
			ci.setScorevalue(t.getScorevalue());
			ci.setOperator("wgf");
			ci.setOperatdate(new Date());
			classscoreinfoService.insertSelective(ci);
			
		}

	}

	@Override
	public T selectByPrimaryKey(Integer uid) {
		T t = dormscoreinfoDao.selectByPrimaryKey(uid);
		return t;
	}

	@Override
	public void updateByPrimaryKeySelective(Dormscoreinfo t) {
		dormscoreinfoDao.updateByPrimaryKeySelective(t);
		
	}

	@Override
	public void updateByPrimaryKey(T t) {
		dormscoreinfoDao.updateByPrimaryKey(t);
		
	}

	@Override
	public List<Dormscoreinfo> selectAll() {
		List<Dormscoreinfo> listdormscoreinfo = dormscoreinfoDao.selectAll();
		return listdormscoreinfo;
	}

	@Override
	public void insertMul(List<Dormscoreinfo> listdormregion) {
		// TODO Auto-generated method stub
		
	}
	

}
