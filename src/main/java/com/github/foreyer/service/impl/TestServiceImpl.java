package com.github.foreyer.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.foreyer.entity.Test;
import com.github.foreyer.mapper.TestMapper;
import com.github.foreyer.service.ITestService;

/**
 *
 * test 表数据服务层接口实现类
 *
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {


}