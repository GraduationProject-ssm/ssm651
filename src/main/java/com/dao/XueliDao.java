package com.dao;

import com.entity.XueliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XueliView;

/**
 * 学历 Dao 接口
 *
 * @author 
 */
public interface XueliDao extends BaseMapper<XueliEntity> {

   List<XueliView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
