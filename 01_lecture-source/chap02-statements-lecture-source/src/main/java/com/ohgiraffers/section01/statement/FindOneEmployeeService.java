package com.ohgiraffers.section01.statement;

import com.ohgiraffers.domain.entity.Employee;

import java.sql.Connection;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class FindOneEmployeeService {

    public Employee findEmployeeByEmpId(String empId) {

        // DB접속관련은 레포에 작성
        // 레포를 추가하자

        Connection con = getConnection();


        EmployeeRepository repository = new EmployeeRepository();
        Employee foundEmployee =
                repository.findEmployeeByEmpId(con, empId);

        close(con);


        return foundEmployee;

    }
}
