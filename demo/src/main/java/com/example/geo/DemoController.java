package com.example.geo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.ToString;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@RestController
public class DemoController {
	

	@Resource (name = "DemoService" )
	private DemoService demoService;
	
	@RequestMapping (value="/index")
	public Map<String, Object> getSelectList(@RequestParam Map<String, Object> param) throws Exception {
	
		System.out.println("##### index.jsp를 시작합니다 #####");
			
		Map<String, Object> result = new HashMap<String, Object>(); //  result 객체를 선언하고 여기에 데이터를 담겠다는 의미
		
			try {
				List<Map<String, Object>> list = demoService.getSelectList(param);
				
				result.put("SUCCESS", true);
				result.put("LIST", list);
				System.out.println(" list : " + list.toString());
			} catch (Exception e) {
				System.out.println("두근 두근 에러 발생");
				result.put("SUCCESS", false);
				result.put("MSG", e.getMessage());
			}
			
//			System.out.println(demoService.getSelectList(param));
//			System.out.println("데이터 반환 : " + param);
//			System.out.println("리절트 반환: " + result.toString());

			
			return param;
	}
}		

