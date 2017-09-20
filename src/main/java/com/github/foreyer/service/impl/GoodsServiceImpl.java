package com.github.foreyer.service.impl;

import com.github.foreyer.entity.Goods;
import com.github.foreyer.mapper.GoodsMapper;
import com.github.foreyer.service.IGoodsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author GaoJun.Zhou
 * @since 2017-09-20
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {
	
}
