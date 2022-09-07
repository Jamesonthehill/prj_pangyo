package com.example.test.modules.react;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service ("TestService")
//@RequiredArgsConstructor
public class TestService {

	@Autowired
	TestDao dao;
	
//	
//	public List<Test> getSelectList() throws Exception {
//		
//		return dao.getSelectList();
//	}
	
	public List<HashMap<String, Object>> getSelectList() {
		return dao.getSelectList();
	}
}