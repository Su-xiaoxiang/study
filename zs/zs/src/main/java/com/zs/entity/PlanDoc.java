package com.zs.entity;

import lombok.Data;
import java.util.Date;

/**
 * 人培方案信息实体类
 */
@Data
public class PlanDoc {
    // 主键
    private Integer id;
    // 专业名称
    private String majorName;
    // 专业代码
    private String majorCode;
    // 专业类别ID
    private Integer typeId;
    // 专业类别名称
    private String typeName; // 关联字段
    // 主要职业类别
    private String occupationCategory;
    // 主要岗位类别
    private String postCategory;
    // 作者
    private String author;
    // 时间戳
    private Date writeTime;
} 