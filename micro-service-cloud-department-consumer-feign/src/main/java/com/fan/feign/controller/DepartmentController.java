package com.fan.feign.controller;

import com.fan.api.entity.Department;
import com.fan.feign.service.DepartmentFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Chengming Fan on 2023/5/17 12:07
 */
@RestController
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentFeignService departmentFeignService;

    @GetMapping("/departments/{id}")
    public Department findDepartmentById(@PathVariable int id) {
        return departmentFeignService.getDepartmentById(id);
    }

    @GetMapping("/departments")
    public List<Department> findAllDepartments() {
        return departmentFeignService.getDepartments();
    }
}
