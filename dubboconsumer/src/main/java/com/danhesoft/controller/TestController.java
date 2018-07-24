package com.danhesoft.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.danhesoft.service.SchoolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: caowei
 * @Description:
 * @Date: Created in 10:20 2018/7/24
 */
@RestController
public class TestController {

    /**
     *
     */
    @Reference(version = "1.0.0", check = false)
    private SchoolService schoolService;

    /**
     *
     * @return
     */
    @RequestMapping("/getSchoolName")
    public String getSchool() {
        return schoolService.getSchoolName();
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @RequestMapping("/add")
    public String doAdd(int a, int b) {
        return String.valueOf(schoolService.doAdd(a, b));
    }
}
