package com.fan.feign.service;

import com.fan.api.entity.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by Chengming Fan on 2023/5/19 14:09
 */
@Component
@FeignClient(value = "DEPARTMENTPROVIDER")
public interface DepartmentFeignService {
    @GetMapping("/departments/{id}")
    Department getDepartmentById(@PathVariable("id") int id);

    @GetMapping("/departments")
    List<Department> getDepartments();
}
