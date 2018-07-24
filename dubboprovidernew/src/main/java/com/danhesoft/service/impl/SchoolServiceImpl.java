package com.danhesoft.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.danhesoft.service.SchoolService;

/**
 * @Author: caowei
 * @Description:
 * @Date: Created in 10:52 2018/7/24
 */
@Service(version = "2.0.0")
public class SchoolServiceImpl implements SchoolService {

    @Override
    public String getSchoolName() {
        return "常州轻工职业技术学院|南京大学";
    }

    @Override
    public int doAdd(int a, int b) {
        return a + b;
    }
}
