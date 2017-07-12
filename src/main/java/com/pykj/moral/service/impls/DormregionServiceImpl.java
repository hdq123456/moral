package com.pykj.moral.service.impls;


import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.pykj.moral.dao.DormregionMapper;
import com.pykj.moral.entity.Dormregion;
import com.pykj.moral.service.DormregionService;

@Service("dormregionService")
public class DormregionServiceImpl<T> implements DormregionService<T> {

	@Resource
	private DormregionMapper<T> dormregionDao;

	@Override
	public void deleteByPrimaryKey(Integer regionid) {
		dormregionDao.deleteByPrimaryKey(regionid);
	}
	
	@Override
	public void insert(T t) {
		dormregionDao.insert(t);
	}

	@Override
	public void insertSelective(T t) {
		dormregionDao.insertSelective(t);
	}

	@Override
	public T selectByPrimaryKey(Integer regionid) {
		Dormregion dr = dormregionDao.selectByPrimaryKey(regionid);
		return (T) dr;
	}

	@Override
	public void updateByPrimaryKeySelective(T t) {
		dormregionDao.updateByPrimaryKeySelective(t);
	}

	@Override
	public void updateByPrimaryKey(T t) {
		dormregionDao.updateByPrimaryKey(t);
	}

	@Override
	public List<Dormregion> selectAll() {
		List<Dormregion> listdormregion = dormregionDao._list();
		return listdormregion;
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.REQUIRED) 
	@Override
	public void insertMul(List<Dormregion> listdormregion) {
		
		List<Integer> listNum = new ArrayList<Integer>();
		
		for(Dormregion dr:listdormregion){
			dormregionDao.insertSelective((T) dr);
			int regionid = dr.getRegionid();
			listNum.add(regionid);
			System.out.println(listNum);
		}
		
	}

	@Override
	public void batchDeleteRegion(List<Integer> regionid) {
		dormregionDao.batchDeleteRegion(regionid);
		
	}

	@Override
	public List<Dormregion> selectRegionByMultCondition(Dormregion dormregion) {
		return dormregionDao.selectRegionByMultCondition(dormregion);
	}

}
