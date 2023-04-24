package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.entity.Category;
import com.jsp.repository.CategoryRepository;

@Controller
public class CategoryController {

	@Autowired
	private CategoryRepository crep;
	
	@PostMapping("/add_category")
	public ModelAndView add_category(@RequestBody Category cat) {
		crep.save(cat);
		ModelAndView mv=new ModelAndView("view_category","view",cat);
		return mv;
	}
	
	@GetMapping("/view_category")
	public ModelAndView view_category() {
		List<Category> li=crep.findAll();
		ModelAndView mv=new ModelAndView("view_category","categoryList",li);
		return mv;
	}
}
