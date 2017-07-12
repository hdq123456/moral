package demo;

import java.util.HashMap;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pykj.moral.utils.ResultOut;

/**
 * 后端回显方式4种：(1)使用modelandview对象; (2)使用HttpServletRequest对象，如同selevlet; (3)使用ModelMap对象; (4) @ModelAttribute注解 ; (5)springmvc重定向; (6)String回显;
 * 前端传参方式:(1)基本数据类型/包装类型; (2)@RequestParam int id; (3)对象; (4)(@RequestParam(value = "userid") int id);  
* @author wgf
 *
 */

@Controller
@RequestMapping("/test")
public class ControllerTest {

	@RequestMapping("/test1")
	@ResponseBody
	public ModelAndView toview(){
		Map<String , Object> rolemap = new HashMap<String, Object>();
		Role r = new Role(1, "wgf", "系统管理员工", "fafa");
		rolemap.put("role1", r);
		return new ModelAndView("test", rolemap);
	}
	
	@RequestMapping("/test2")
	@ResponseBody
	public String instring(){
	
		return "test";
	}
	
	//基本数据类型
	@RequestMapping("/test3")
	public void getrolebyid(Integer roleid){
		System.out.println(roleid);
	}
	
	//@RequestParam int id , id作为参数传入;
	@RequestMapping("/test4")
	public void getparam(@RequestParam int id){
		System.out.println(id);
	}
	
	//对象
	@RequestMapping("/test5") 
	public void getlistrole(Role role){
		System.out.println(role.getRoleid() + role.getName() + role.getDesc() + role.getRemark());
	}
	
	@RequestMapping("/test6")
	public ModelAndView toredirect(ModelAndView model){
		
		return new ModelAndView("redirect:/views/success.html");
		
	}
	
	//在entity里面写入一个类，在url里面如何传参 
	//http://localhost:8081/test/test7?user.userid=100&user.username=wgf
	@RequestMapping("/test7")
	@ResponseBody
	public ResultOut insertRoleUser(Role role){
		
		System.out.println(role.getUser());
		return ResultOut.ok();
	}
	
	
	

	
	
}
