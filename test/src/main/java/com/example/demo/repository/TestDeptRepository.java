package com.example.demo.repository;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.domain.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@Slf4j
@Commit
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDeptRepository {
	
	@Autowired
	private DeptRepository deptRepository;
	
	@Test
	public void insertData() {
		Dept dept = new Dept();
		dept.setDEPTNO(10L);
		dept.setDNAME("부서명");
		dept.setLOC("10 부서 위치");
		deptRepository.save(dept);
	
	}

	@Test
	public void selectData() {
		boolean isResult = deptRepository.findById(10L).isPresent();
	
			if (isResult) {
				deptRepository.findById(10L).get().toString();
			} else {
				System.out.print("실패 하였습니다.");
			}
	}
	
	@Test
	public void deleteData() {
		Dept dept = new Dept();
		dept.setDEPTNO(10L);
		deptRepository.delete(dept);
	}

}


