package com.pykj.moral.service.impls;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pykj.moral.dao.FilesMapper;
import com.pykj.moral.entity.Files;
import com.pykj.moral.service.FilesService;

@Service("filesServiceImp")
public class FilesServiceImpl implements FilesService {

	@Resource
	FilesMapper filesDao;
	
	@Override
	public void deleteByPrimaryKey(Integer id) {
		filesDao.deleteByPrimaryKey(id);

	}

	@Override
	public void insert(Files record) {
		filesDao.insert(record);

	}

	@Override
	public void insertSelective(Files record) {
		filesDao.insertSelective(record);

	}

	@Override
	public Files selectByPrimaryKey(Integer id) {
		return filesDao.selectByPrimaryKey(id);
	}

	@Override
	public void updateByPrimaryKeySelective(Files record) {
		filesDao.updateByPrimaryKeySelective(record);

	}

	@Override
	public void updateByPrimaryKey(Files record) {
		filesDao.updateByPrimaryKey(record);

	}

	@Override
	public List<Files> selectAll() {
		return filesDao.getALLRecord();
	}

}
