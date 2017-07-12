package com.pykj.moral.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.pykj.moral.entity.Uploadfile;


/**
 * springmvc图片上传
 * @author wgf
 *
 */

public class UploadUtils {

	public static String  upload(HttpServletRequest request , MultipartFile[] file) throws IllegalStateException, IOException{
		
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
					
					List<Uploadfile> listimg = new ArrayList<Uploadfile>();
					
					
					for(int i = 0 ; i < file.length ; i++){
						
						//file[i].transferTo(new File("d:\\im" + i +".png"));
			
						//保存到本地文件夹;
						String realpath = request.getRealPath("/images");
						System.out.println("realpath:" + realpath);
						//文件名;
						file[i].transferTo(new File(realpath + file[i].getName()));
						
					}
					
				}else{
					return "500error";
				}

				return "success";
			}
	
}
