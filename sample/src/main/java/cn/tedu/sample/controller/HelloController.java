package cn.tedu.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //控制器类 并且所有处理请求的方法都可以响应正文
public class HelloController {
	
	@GetMapping("hello")//相当于是RequestMapping并且限制了请求方式只能是get
	public String showHello() {
		return "你好, SpringBoot!";
	}
  //@ResponseBody  返回的内容直接给出服务端
  //RequestMapping  配置请求路径	
}
