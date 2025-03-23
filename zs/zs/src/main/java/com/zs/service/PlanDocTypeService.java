package com.zs.service;

import com.zs.entity.PlanDocType;
import java.util.List;

public interface PlanDocTypeService {
    /**
     * 获取所有专业类别
     */
    List<PlanDocType> getAllTypes();
} 