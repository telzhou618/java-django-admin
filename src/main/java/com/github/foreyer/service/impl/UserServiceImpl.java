package com.github.foreyer.service.impl;

import com.github.foreyer.entity.User;
import com.github.foreyer.mapper.UserMapper;
import com.github.foreyer.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author GaoJun.Zhou
 * @since 2017-09-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
