package com.example.geo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ("DemoService")

public class DemoService {

	@Inject
	private SqlSession sqlSession;
	
	private static String namespace="com.example.geo.DemoMapper";
	
	public List<Map<String, Object>> getSelectList(Map<String, Object> param) throws Exception {
		
		List<Map<String, Object>> result = sqlSession.selectList(namespace + ".getSelectList", param);

		System.out.println( "result : " + result.toString());
		System.out.println( "param : " + param.toString());
		
		return result;
		
	}
}