package com.pykj.moral.service.impls;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pykj.moral.dao.StdscoreinfoMapper;
import com.pykj.moral.entity.Stdscoreinfo;
import com.pykj.moral.service.StdscoreinfoService;

@Service("stdscoreinfoService")
public class StdscoreinfoServiceImpl<T> implements StdscoreinfoService<T> {
	
	@Resource
	StdscoreinfoMapper<T> stdscoreinfoDao;
	
	@Override
	public void deleteByPrimaryKey(Integer uid) {
		stdscoreinfoDao.deleteByPrimaryKey(uid);
		
	}

	@Override
	public void insert(T t) {
		stdscoreinfoDao.insert(t);
		
	}

	@Override
	public void insertSelective(Stdscoreinfo t) {
		stdscoreinfoDao.insertSelective(t);
		
	}

	@Override
	public T selectByPrimaryKey(Integer uid) {
		T t = stdscoreinfoDao.selectByPrimaryKey(uid);
		return t;
	}

	@Override
	public void updateByPrimaryKeySelective(T t) {
		stdscoreinfoDao.updateByPrimaryKeySelective(t);
		
	}

	@Override
	public void updateByPrimaryKey(T t) {
		stdscoreinfoDao.updateByPrimaryKey(t);
		
	}

	@Override
	public List<Stdscoreinfo> selectAll() {
		List<Stdscoreinfo> liststdscoreinfo = stdscoreinfoDao.selectAll();
		return liststdscoreinfo;
	}

}
