package com.example.geo;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class GeoDao{  
	
	
	@Inject
//	@Resource(name = "sqlSession")
	private SqlSession sqlSession; // sqlSession의 사용을 정의 SQL에서 db를 받기위한 논리적연결상태를 말함.
	
	private static String namespace="com.example.geo.GeoMapper";
	
	public List<HashMap<String, Object>> getSelectList(){ 
		
		System.out.println("HashMap : " + sqlSession.selectList(namespace + ".getSelectList").toString()); 
		
		return sqlSession.selectList(namespace + ".getSelectList" ); }
}