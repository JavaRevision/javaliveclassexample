package com.example.spring.jdbc.mvc.dao;

 import java.util.List;
 import com.example.spring.jdbc.mvc.bean.EmployeeBean;

public interface DBOperation {

	public static final String GET_ALL_EMPLOYEE_DETAILS = "SELECT EMP_ID,EMP_NAME,EMP_JOB,EMP_SALARY FROM EMPLOYEE_JDBC";
	public static final String GET_ID_NAME_EMPLOYEE_DETAILS="SELECT EMP_ID,EMP_NAME FROM EMPLOYEE_JDBC ";
	/*
	 * public static final String
	 * GET_EMPLOYEE_JOB_EMPLOYEE_SALARY_Details="SELECT  EMP_JOB,EMP_SALARY FROM EMPLOYEE_JDBC"
	 * ; public static final String GET_EMPLOYEE_ID_SALARY_DETAILS
	 * ="SELECT EMP_ID,EMP_SALARY FROM EMPLOYEE_JDBC"; public static final String
	 * GET_EMPLOYEE_ID_JOB_SALARY_DETAILS
	 * ="SELECT EMP_ID,EMP_JOB,EMP_SALARY FROM EMPLOYEE_JDBC";
	 */
	
	public List<EmployeeBean> retriveAllEmployee();
	public List<EmployeeBean> retriveEmpIDName();
	//public List<EmployeeBean> retriveJobSalaryEmployee();
	//public List<EmployeeBean> retriveIDSalaryEmpoyee();
	//public List<EmployeeBean> retriveIDJobSalaryEmpoyee();
	
	
}
