package com.xja.dao;

import com.xja.domain.Emp;

import java.util.List;

public interface EmpDAO {
    /**
     * 按员工编号查询员工对象
     * @param empNo 员工编号
     * @return 员工对象，如果没找到返回null
     * @throws Exception
     */
    public Emp selectById(Integer empNo) throws Exception;

    /**
     * 查询所有员工
     * @return 所有员工的集合
     * @throws Exception
     */
    public List<Emp> selectAll() throws Exception;

}
