package com.xbt.dao;

import com.xbt.entity.PlanDocType;
import java.util.List;

/**
 * 专业类别Mapper接口
 */
public interface PlanDocTypeMapper {
    /**
     * 查询所有专业类别
     */
    List<PlanDocType> selectAll();
} 