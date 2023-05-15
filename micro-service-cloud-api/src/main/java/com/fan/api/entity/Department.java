package com.fan.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by Chengming Fan on 2023/5/15 14:13
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Department {
    private Integer deptNo;
    private String deptName;
    private String dbSource;
}
