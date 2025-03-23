package com.zs.dao;

import com.zs.entity.PlanDoc;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Date;

public interface PlanDocMapper {
    /**
     * 分页查询人培方案
     */
    List<PlanDoc> selectByPage(@Param("majorName") String majorName,
                              @Param("typeId") Integer typeId,
                              @Param("startTime") Date startTime,
                              @Param("endTime") Date endTime);
    
    /**
     * 获取总记录数
     */
    int selectCount(@Param("majorName") String majorName,
                   @Param("typeId") Integer typeId,
                   @Param("startTime") Date startTime,
                   @Param("endTime") Date endTime);
    
    /**
     * 更新人培方案
     */
    int updatePlanDoc(PlanDoc planDoc);
} 