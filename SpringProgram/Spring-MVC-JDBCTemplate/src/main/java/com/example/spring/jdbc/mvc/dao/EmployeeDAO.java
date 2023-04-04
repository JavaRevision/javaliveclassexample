package com.example.spring.jdbc.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.spring.jdbc.mvc.bean.EmployeeBean;

public class EmployeeDAO implements DBOperation {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public List<EmployeeBean> retriveAllEmployee(){
		
		List<EmployeeBean> employeeBeansList = (List<EmployeeBean>)jdbcTemplate.query(GET_ALL_EMPLOYEE_DETAILS,new EmployeeRowMapper());
		
		return employeeBeansList;
	}
	
	private class EmployeeRowMapper implements RowMapper<EmployeeBean>{

		@Override
		public EmployeeBean mapRow(ResultSet resultSet, int position) throws SQLException {
			
			EmployeeBean employeeBean = new EmployeeBean(resultSet.getInt(1),
														 resultSet.getString(2),
														 resultSet.getString(3),
														 resultSet.getFloat(4));
			
			return employeeBean;
		}
	}
	
	public List<EmployeeBean> retriveEmpIDName(){
		
		List<EmployeeBean> empBeansList1 = (List<EmployeeBean>)jdbcTemplate.query(GET_ID_NAME_EMPLOYEE_DETAILS, new EmployeeRowMapper1());
		return empBeansList1;	
	}
	
	
	private class EmployeeRowMapper1 implements RowMapper<EmployeeBean>{

		@Override
		public EmployeeBean mapRow(ResultSet resultSet, int position) throws SQLException {
			
			EmployeeBean employeeBean = new EmployeeBean(resultSet.getInt(1),
														 resultSet.getString(2));
			
			return employeeBean;
		}
	}
	
}
