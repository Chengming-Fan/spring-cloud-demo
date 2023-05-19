package com.fan.provider.controller;

import com.fan.api.entity.Department;
import com.fan.provider.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Chengming Fan on 2023/5/15 14:56
 */
@RestController
@Slf4j
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping(value = "/departments/{id}")
    public Department get(@PathVariable("id") int id) {
        return departmentService.findById(id);
    }
    @GetMapping(value = "/departments")
    public List<Department> list() {
        return departmentService.findAll();
    }
}
