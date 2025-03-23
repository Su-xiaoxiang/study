package com.xbt.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xbt.dao.PlanDocMapper;
import com.xbt.entity.PlanDoc;
import com.xbt.service.PlanDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class PlanDocServiceImpl implements PlanDocService {
    
    @Autowired
    private PlanDocMapper planDocMapper;

    @Override
    public PageInfo<PlanDoc> getPageList(String majorName, Integer typeId, 
                                       Date startTime, Date endTime, 
                                       Integer page, Integer limit) {
        try {
            // 使用PageHelper进行分页
            PageHelper.startPage(page, limit);
            
            // 执行查询
            List<PlanDoc> list = planDocMapper.selectByPage(majorName, typeId, startTime, endTime);
            
            // 获取分页信息
            return new PageInfo<>(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new PageInfo<>();
        }
    }

    @Override
    public boolean updatePlanDoc(PlanDoc planDoc) {
        try {
            return planDocMapper.updatePlanDoc(planDoc) > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
} 