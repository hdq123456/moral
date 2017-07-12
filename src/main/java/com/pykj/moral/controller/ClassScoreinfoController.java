package com.pykj.moral.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pykj.moral.entity.Classscoreinfo;
import com.pykj.moral.service.ClassscoreinfoService;
import com.pykj.moral.utils.ResultOut;

@Controller
@RequestMapping("/classscoreinfo")
public class ClassScoreinfoController implements BaseController<Classscoreinfo> {

	//所有方法都缺数据校验;
	
	@Resource
	ClassscoreinfoService<Classscoreinfo> classscoreinfoService;
	
	@Override
	@RequestMapping("/delete")
	@ResponseBody
	public ResultOut deleteByPrimaryKey(Integer uid) {
		
		classscoreinfoService.deleteByPrimaryKey(uid);
		return ResultOut.ok();
	}

	@Override
	@RequestMapping("/insert")
	@ResponseBody
	public ResultOut insertSelective(Classscoreinfo t) {
		//设置操作时间和操作人;
		t.setOperatdate(new Date());
		t.setOperator("wgf");
		classscoreinfoService.insertSelective(t);
		return ResultOut.ok();
	}

	@Override
	@RequestMapping("/select")
	@ResponseBody
	public ResultOut selectByPrimaryKey(Integer uid) {
		Classscoreinfo cc = classscoreinfoService.selectByPrimaryKey(uid);
		return ResultOut.ok(cc);
	}

	@Override
	@RequestMapping("/update")
	@ResponseBody
	public ResultOut updateByPrimaryKeySelective(Classscoreinfo t) {
		classscoreinfoService.updateByPrimaryKeySelective(t);
		return ResultOut.ok();
	}

	@Override
	@RequestMapping("/selectall")
	@ResponseBody
	public ResultOut selectAll() {
		List<Classscoreinfo> listclassscoreinfo = classscoreinfoService.selectAll();
		return ResultOut.ok(listclassscoreinfo);
	}

}
