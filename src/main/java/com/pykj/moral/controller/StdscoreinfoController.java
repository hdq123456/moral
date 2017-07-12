package com.pykj.moral.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pykj.moral.entity.Stdscoreinfo;
import com.pykj.moral.service.StdscoreinfoService;
import com.pykj.moral.utils.ResultOut;

@Controller
@RequestMapping("/stdscoreinfo")
public class StdscoreinfoController implements BaseController<Stdscoreinfo> {

	@Resource
	StdscoreinfoService<Stdscoreinfo> stdscoreinfoService;
	
	@Override
	@RequestMapping("/delete")
	@ResponseBody
	public ResultOut deleteByPrimaryKey(Integer uid) {
		stdscoreinfoService.deleteByPrimaryKey(uid);
		return ResultOut.ok();
	}

	@Override
	@RequestMapping("/insert")
	@ResponseBody
	public ResultOut insertSelective(Stdscoreinfo t) {
		//设置操作时间和操作人;
		t.setOperator("wgf");
		t.setOperattime(new Date());
		stdscoreinfoService.insertSelective(t);
		return ResultOut.ok();
	}

	@Override
	@RequestMapping("/select")
	@ResponseBody
	public ResultOut selectByPrimaryKey(Integer uid) {
		Stdscoreinfo std = stdscoreinfoService.selectByPrimaryKey(uid);
		return ResultOut.ok(std);
	}

	@Override
	@RequestMapping("/update")
	@ResponseBody
	public ResultOut updateByPrimaryKeySelective(Stdscoreinfo t) {
		stdscoreinfoService.updateByPrimaryKeySelective(t);
		return ResultOut.ok();
	}

	@Override
	@RequestMapping("/selectall")
	@ResponseBody
	public ResultOut selectAll() {
		ResultOut ok = null;
		List<Stdscoreinfo> liststdscoreinfo = stdscoreinfoService.selectAll();
		if(liststdscoreinfo !=null && !liststdscoreinfo.isEmpty()){
			ok = ResultOut.ok(liststdscoreinfo);
		}else{
			ok = ResultOut.nullError();
		}
		return ok;
	}

}
