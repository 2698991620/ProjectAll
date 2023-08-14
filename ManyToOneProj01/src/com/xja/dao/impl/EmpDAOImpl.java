package com.xja.dao.impl;

import com.xja.dao.EmpDAO;
import com.xja.domain.Dept;
import com.xja.domain.Emp;
import com.xja.util.ConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAOImpl implements EmpDAO {
    @Override
    public Emp selectById(Integer empNo) throws SQLException {
        String sql = "SELECT * FROM emp " +
                " LEFT JOIN dept ON emp.DEPTNO = dept.DEPTNO " +
                " WHERE empno = ? ";
        Connection conn = ConnUtil.getConn();
        PreparedStatement pstat = conn.prepareStatement(sql);
        pstat.setInt(1,empNo);
        ResultSet rs = pstat.executeQuery();
        if(rs.next()){
            Emp emp = new Emp();
            emp.setEmpno(rs.getInt("empno"));
            emp.setEname(rs.getString("ename"));
            emp.setJob(rs.getString("job"));
            emp.setMgr(rs.getInt("mgr"));
            emp.setHiredate(rs.getString("hiredate"));
            emp.setSal(rs.getDouble("sal"));
            emp.setComm(rs.getDouble("comm"));
            emp.setDeptno(rs.getInt("deptno"));
            Dept dept = new Dept();
            dept.setDeptNo(rs.getInt("deptno"));
            dept.setDname(rs.getString("dname"));
            dept.setLoc(rs.getString("loc"));
            emp.setDept(dept);//为员工设置关联属性
            return emp;
        }else{
            return null;
        }
    }

    @Override
    public List<Emp> selectAll() throws Exception {
        List<Emp> empList = new ArrayList<>();
        String sql = "SELECT * FROM emp " +
                " LEFT JOIN dept ON emp.DEPTNO = dept.DEPTNO ";
        Connection conn = ConnUtil.getConn();
        PreparedStatement pstat = conn.prepareStatement(sql);
        ResultSet rs = pstat.executeQuery();
        while(rs.next()){
            Emp emp = new Emp();
            emp.setEmpno(rs.getInt("empno"));
            emp.setEname(rs.getString("ename"));
            emp.setJob(rs.getString("job"));
            emp.setMgr(rs.getInt("mgr"));
            emp.setHiredate(rs.getString("hiredate"));
            emp.setSal(rs.getDouble("sal"));
            emp.setComm(rs.getDouble("comm"));
            emp.setDeptno(rs.getInt("deptno"));
            Dept dept = new Dept();
            dept.setDeptNo(rs.getInt("deptno"));
            dept.setDname(rs.getString("dname"));
            dept.setLoc(rs.getString("loc"));
            emp.setDept(dept);//为员工设置关联属性
            empList.add(emp);
        }
        return empList;
    }
}
