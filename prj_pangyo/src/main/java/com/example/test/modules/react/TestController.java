package com.example.test.modules.react;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


//@RequiredConstructor
@Controller

public class TestController{

		@Autowired
		TestService service;
	
		@RequestMapping(value ="/index")
		public String selectList(Model model) throws Exception {

			System.out.println("#### index.jsp 시작 합니다 ####");

			List<HashMap<String, Object>> list = service.getSelectList();
			
			System.out.println("result : " + list.toString());
//			List<String> keyList = new ArrayList<>(Arrays.asList(["gid", "geom"]));
			
			
//			for(HashMap<String,Object> map : list) {
//				System.out.println(map.get("gid"));
				
				
//			}
			model.addAttribute("list", list);
			
			return "index";
		}
}