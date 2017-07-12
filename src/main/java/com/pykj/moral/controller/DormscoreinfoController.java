package com.pykj.moral.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pykj.moral.entity.Dormscoreinfo;
import com.pykj.moral.service.DormscoreinfoService;
import com.pykj.moral.utils.ResultOut;

@Controller
@RequestMapping("/Dormscoreinfo")
public class DormscoreinfoController implements BaseController<Dormscoreinfo> {


	@Resource
	DormscoreinfoService<Dormscoreinfo> DormscoreinfoService;
	
	@Override
	@RequestMapping("/delete")
	@ResponseBody
	public ResultOut deleteByPrimaryKey(Integer id) {
		DormscoreinfoService.deleteByPrimaryKey(id);
		return ResultOut.ok();
	}

	@Override
	@RequestMapping("/insert")
	@ResponseBody
	public ResultOut insertSelective(Dormscoreinfo t) {
		
		DormscoreinfoService.insertSelective(t);
		return ResultOut.ok();
	}

	@Override
	@RequestMapping("/select")
	@ResponseBody
	public ResultOut selectByPrimaryKey(Integer id) {
		Dormscoreinfo dc = DormscoreinfoService.selectByPrimaryKey(id);
		return ResultOut.ok(dc);
	}

	@Override
	@RequestMapping("/update")
	@ResponseBody
	public ResultOut updateByPrimaryKeySelective(Dormscoreinfo t) {
		DormscoreinfoService.updateByPrimaryKeySelective(t);
		return ResultOut.ok();
	}

	@Override
	@RequestMapping("/selectall")
	@ResponseBody
	public ResultOut selectAll() {
		ResultOut ok = null;
		List<Dormscoreinfo> listDormscoreinfo = DormscoreinfoService.selectAll();
		if(listDormscoreinfo !=null && !listDormscoreinfo.isEmpty()){
			ok = ResultOut.ok(listDormscoreinfo);
		}else{
			ok = ResultOut.nullError();
		}
		return ok;
	}
	
	@RequestMapping("/revoke")
	@ResponseBody
	public ResultOut revokeRecord(){
		
		return ResultOut.ok();
	}
	
	

}
