package com.fan.consumer.controller;

import com.fan.api.entity.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Chengming Fan on 2023/5/17 12:07
 */
@RestController
@RequiredArgsConstructor
public class DepartmentController {
    public static final String REST_URL_PROVIDER_PREFIX = "http://DEPARTMENTPROVIDER";

    public final RestTemplate restTemplate;

    @GetMapping("/departments/{id}")
    public Department findDepartmentById(@PathVariable String id) {
        return restTemplate.getForObject(REST_URL_PROVIDER_PREFIX + "/departments/" + id, Department.class);
    }

    @GetMapping("/departments")
    public List<Department> findAllDepartments() {
        return restTemplate.getForObject(REST_URL_PROVIDER_PREFIX + "/departments", List.class);
    }
}
