package com.example.geo;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class GeoController {
	
	@Autowired
	GeoService service;
	
	@RequestMapping (value="index")
	public String getSelectList(Model model) throws Exception {
	
			System.out.println("##### index.jsp를 시작합니다 #####");
		
		List<HashMap<String, Object>> list = service.getSelectList();
		
				System.out.println("result : " + list.toString());
		
		
	
		return "index";
		}
}		

