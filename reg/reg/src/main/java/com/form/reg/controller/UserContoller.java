package com.form.reg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.reg.entity.UserDtls;
import com.form.reg.repo.UserRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserContoller {
	
	@Autowired
	private UserRepo repo;
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDtls u, HttpSession session) {
	    System.out.println(u);
	    
	    repo.save(u);
	    session.setAttribute("message", "User Register Successfully...");
	    
	    return "redirect:/"; 
	}
}
