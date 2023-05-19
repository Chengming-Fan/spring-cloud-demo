package com.fan.provider.service.impl;

import com.fan.api.entity.Department;
import com.fan.provider.mapper.DepartmentMapper;
import com.fan.provider.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chengming Fan on 2023/5/15 14:54
 */
@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentMapper departmentMapper;

    @Override
    public Department findById(Integer id) {
        return departmentMapper.findByDeptNo(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentMapper.findAll();
    }
}
