package cn.fan.gulimall.product.dao;

import cn.fan.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ffanan
 * @email 997792054@qq.com
 * @date 2020-05-31 10:03:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
