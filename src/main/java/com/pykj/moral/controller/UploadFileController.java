package com.pykj.moral.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.pykj.moral.entity.Files;
import com.pykj.moral.entity.Uploadfile;
import com.pykj.moral.entity.User;
import com.pykj.moral.service.FilesService;
import com.pykj.moral.utils.ResultOut;

@Controller
@RequestMapping("/upload")
public class UploadFileController {

	@Resource
	FilesService filesService;
	
	//日志输出;
	Logger logger = Logger.getLogger(Uploadfile.class.getName());
	
	@RequestMapping("/fileupload" )
	public String fileupload(){
		
		logger.info("nihao");
		return "fileupload";
	}
	
	@RequestMapping(value ="/spUpload" , method=RequestMethod.POST )
	public String springUpload(HttpServletRequest request , User user , @RequestParam("file") MultipartFile[] file ) throws IllegalStateException, IOException {

		System.out.println(user);
		
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）chongqiyixia
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());

		// 检查form中是否有enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			Iterator iter = multiRequest.getFileNames();

			/*
			while (iter.hasNext()) {
				// 一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				
				
				if (file != null) {
					//String path = "C:\\Users\\wgf\\Desktop\\moral\\src\\main\\webapp\\images\\" +file.getOriginalFilename();
					// 上传
					file.transferTo(new File(path));
				}
			}
			*/
			for(int i = 0 ; i < file.length ; i++){
				
				//file[i].transferTo(new File("d:\\im" + i +".png"));
				String realpath = request.getRealPath("/images");
				System.out.println(realpath + file[i].getOriginalFilename());
				//文件名;
				file[i].transferTo(new File(realpath + "\\" + file[i].getOriginalFilename()));
			}
			
		}else{
			return "500error";
		}

		return "success";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/savefiles" , method=RequestMethod.POST)
	@ResponseBody
	public ResultOut savefiles(HttpServletRequest request , @RequestParam("file") MultipartFile file ){
		String path = request.getRealPath("/images");
		String realpath = path.substring(path.lastIndexOf("\\")+1);
		int filesize = (int)file.getSize();
		String filename = file.getOriginalFilename();
		Files f = new Files();
		f.setFilename(filename);
		f.setCreatetion(new Date());
		f.setSize(filesize);
		f.setUrl("/" + realpath +  "/" +file.getOriginalFilename());
		filesService.insert(f);
		return ResultOut.ok();
	}
	
}

