package com.zs.controller;

import com.zs.entity.PlanDocType;
import com.zs.service.PlanDocTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/planDocType")
public class PlanDocTypeController {
    
    @Autowired
    private PlanDocTypeService planDocTypeService;

    @GetMapping("/all")
    @ResponseBody
    public List<PlanDocType> getAllTypes() {
        return planDocTypeService.getAllTypes();
    }
} 