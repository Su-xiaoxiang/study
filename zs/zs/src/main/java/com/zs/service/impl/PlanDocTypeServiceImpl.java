package com.zs.service.impl;

import com.zs.dao.PlanDocTypeMapper;
import com.zs.entity.PlanDocType;
import com.zs.service.PlanDocTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlanDocTypeServiceImpl implements PlanDocTypeService {
    
    @Autowired
    private PlanDocTypeMapper planDocTypeMapper;

    @Override
    public List<PlanDocType> getAllTypes() {
        return planDocTypeMapper.selectAll();
    }
} 