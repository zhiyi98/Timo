package com.linln.admin.system.controller;

import com.linln.admin.core.log.action.UserAction;
import com.linln.admin.core.log.annotation.ActionLog;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 小懒虫
 * @date 2018/8/14
 */
@Controller
public class IndexController {
    /**
     * 主页
     */
    @GetMapping("/index")
    @RequiresPermissions("/index")
    public String index(Model model, String qq){
        model.addAttribute("qq", "<option value ='volvo'><script>alert(111)</script>Volvo</option>");
        model.addAttribute("one", 1);
        int[] list = {111,222,333};
        list[3] = 111;
        model.addAttribute("list", list);
        return "/system/main/index";
    }
}
