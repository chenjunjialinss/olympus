package com.ruoyi.web.controller.tool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/font")
public class IndexController {

    private String prefix = "font/index";


    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        return prefix + "/index";
    }
}
