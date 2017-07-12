package com.pykj.moral.service.impls;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pykj.moral.dao.ClassscoreinfoMapper;
import com.pykj.moral.entity.Classscoreinfo;
import com.pykj.moral.entity.Stdscoreinfo;
import com.pykj.moral.service.ClassscoreinfoService;

@Service("classscoreinfoService")
public class ClassscoreinfoServiceImpl<T> implements ClassscoreinfoService<T> {

	@Resource
	ClassscoreinfoMapper<T> classscoreinDao;
	
	@Override
	public void deleteByPrimaryKey(Integer uid) {
		classscoreinDao.deleteByPrimaryKey(uid);

	}

	@Override
	public void insert(T t) {
		classscoreinDao.insert(t);

	}

	@Override
	public void insertSelective(Classscoreinfo t) {
		classscoreinDao.insertSelective(t);

	}

	@SuppressWarnings("unchecked")
	@Override
	public T selectByPrimaryKey(Integer uid) {
		Classscoreinfo cc = classscoreinDao.selectByPrimaryKey(uid);
		return (T) cc;
	}

	@Override
	public void updateByPrimaryKeySelective(T t) {
		classscoreinDao.updateByPrimaryKeySelective(t);

	}

	@Override
	public void updateByPrimaryKey(T t) {
		classscoreinDao.updateByPrimaryKey(t);

	}

	@Override
	public List<Classscoreinfo> selectAll() {
		List<Classscoreinfo> listclassscoreinfo = classscoreinDao.selectAll();
		return listclassscoreinfo;
	}

}
