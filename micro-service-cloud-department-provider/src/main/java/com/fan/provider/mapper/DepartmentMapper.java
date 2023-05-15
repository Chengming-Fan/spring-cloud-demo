package com.fan.provider.mapper;

import com.fan.api.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Chengming Fan on 2023/5/15 14:48
 */
@Mapper
public interface DepartmentMapper {
    Department findByDeptNo(Integer deptNo);

    List<Department> findAll();
}
