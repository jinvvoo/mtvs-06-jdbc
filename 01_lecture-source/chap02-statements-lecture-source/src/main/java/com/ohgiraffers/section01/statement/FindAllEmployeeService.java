package com.ohgiraffers.section01.statement;

import com.ohgiraffers.domain.entity.Employee;

import java.sql.Connection;
import java.util.List;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class FindAllEmployeeService {

//    public List<Employee> findAllEmployees(Pagable pagable, int offset, int limit, String order, String findValue){
//    건너뛰는게 offset limimt은 한번에 보여주는갯수
//    정렬 order
//    Pagable pagable, // 몰라

//    SELECT * FROM EMPLOYEE
//    LIMIT limit

    public List<Employee> findAllEmployees() {

        // 만들때 옆방향이면 구현힘듬
        // 메세지 전달받는걸 메소드
        Connection con = getConnection();


        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAllEmployees(con);

        close(con);


        return employees;

    }

    public List<Employee> findAllEmployees(String order) {

        Connection con = getConnection();


        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAllEmployees(con, order);

        close(con);


        return employees;


    }
}