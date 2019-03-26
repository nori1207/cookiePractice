package com.example.demo.web;

import javax.servlet.http.Cookie;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("Item")
	public String Item() {
		return "Item";
	}
	@RequestMapping("1")
	public String Item1() {
		Cookie cookie = new Cookie("Item1","Item1" );
		cookie.setMaxAge(60*30);
		cookie.setPath("/Item1");
		cookie.setSecure(false);
		
		return "Item1";
	}
	@RequestMapping("2")
	public String Item2() {
		return "Item2";
	}
	@RequestMapping("3")
	public String Item3() {
		return "Item3";
	}
	@RequestMapping("4")
	public String Item4() {
		return "Item4";
	}@RequestMapping("5")
	public String Item5() {
		return "Item5";
	}
}
