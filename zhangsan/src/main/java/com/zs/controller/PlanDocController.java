package com.zs.controller;

import com.github.pagehelper.PageInfo;
import com.zs.entity.PlanDoc;
import com.zs.entity.PlanDocType;
import com.zs.service.PlanDocService;
import com.zs.service.PlanDocTypeService;
import com.zs.util.DateUtils;
import com.zs.util.Result;
import com.zs.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/planDoc")
@Slf4j
public class PlanDocController {
    
    @Autowired
    private PlanDocService planDocService;
    
    @Autowired
    private PlanDocTypeService planDocTypeService;

    @GetMapping("/list")
    public String list(Model model) {
        // 获取所有专业类别并传递到页面
        List<PlanDocType> typeList = planDocTypeService.getAllTypes();
        model.addAttribute("typeList", typeList);
        return "planDoc/list";
    }

    @GetMapping("/data")
    @ResponseBody
    public Result getData(String majorName, Integer typeId,
                          String startTime, String endTime,
                          @RequestParam(defaultValue = "1") Integer page,
                          @RequestParam(defaultValue = "10") Integer limit) {
        try {
            // 处理查询参数
            if (StringUtil.isNotEmpty(majorName)) {
                majorName = StringUtil.trim(majorName);
            }
            Date start = DateUtils.parseDate(startTime);
            Date end = DateUtils.parseDate(endTime);
            
            // 获取分页数据
            PageInfo<PlanDoc> pageInfo = planDocService.getPageList(majorName, typeId, start, end, page, limit);
            
            // 返回LayUI需要的格式
            return Result.ok()
                    .put("count", pageInfo.getTotal())
                    .put("data", pageInfo.getList());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("查询失败：" + e.getMessage());
        }
    }

    @PostMapping("/update")
    @ResponseBody
    public Result update(@RequestBody PlanDoc planDoc)    {
        log.info("更新计划文档：{}", planDoc);
        try {
            boolean success = planDocService.updatePlanDoc(planDoc);
            return success ? Result.ok() : Result.error("更新失败");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("更新失败：" + e.getMessage());
        }
    }

} 