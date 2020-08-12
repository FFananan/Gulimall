package cn.fan.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.fan.common.utils.PageUtils;
import cn.fan.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author ffanan
 * @email 997792054@qq.com
 * @date 2020-05-31 10:03:46
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

