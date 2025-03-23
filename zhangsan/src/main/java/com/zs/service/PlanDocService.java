package com.zs.service;

import com.github.pagehelper.PageInfo;
import com.zs.entity.PlanDoc;
import java.util.Date;

public interface PlanDocService {
    /**
     * 分页查询人培方案
     */
    PageInfo<PlanDoc> getPageList(String majorName, Integer typeId, 
                                 Date startTime, Date endTime, 
                                 Integer page, Integer limit);

    /**
     * 更新人培方案
     */
    boolean updatePlanDoc(PlanDoc planDoc);
} 