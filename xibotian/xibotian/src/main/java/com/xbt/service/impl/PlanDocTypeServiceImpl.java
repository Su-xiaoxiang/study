package com.xbt.service.impl;

import com.xbt.dao.PlanDocTypeMapper;
import com.xbt.entity.PlanDocType;
import com.xbt.service.PlanDocTypeService;
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