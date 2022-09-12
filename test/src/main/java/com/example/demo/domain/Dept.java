package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name ="DEPT")

public class Dept {
	
	@Id
	private Long DEPTNO;
	
	private String DNAME;
	
	private String LOC;

	
	public Long getDEPTNO() {
		return DEPTNO;
	}

	public void setDEPTNO(Long dEPTNO) {
		DEPTNO = dEPTNO;
	}

	public String getDNAME() {
		return DNAME;
	}

	public void setDNAME(String dNAME) {
		DNAME = dNAME;
	}

	public String getLOC() {
		return LOC;
	}

	public void setLOC(String lOC) {
		LOC = lOC;
	}


	
}