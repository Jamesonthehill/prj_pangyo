package com.example.geo;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@RequiredArgsConstructor
@Service ("GeoService")
public class GeoService {

	@Autowired
	GeoDao dao;
	
//	
//	public List<Test> getSelectList() throws Exception {
//		
//		return dao.getSelectList();
//	}
	
	public List<HashMap<String, Object>> getSelectList() {
		return dao.getSelectList();
	}
}