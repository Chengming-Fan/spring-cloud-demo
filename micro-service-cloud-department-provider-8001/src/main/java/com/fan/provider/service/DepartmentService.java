package com.fan.provider.service;

import com.fan.api.entity.Department;

import java.util.List;

/**
 * Created by Chengming Fan on 2023/5/15 14:53
 */
public interface DepartmentService {
    Department findById(Integer id);

    List<Department> findAll();
}
