package com.tuxin.xuxj.dao;

import com.tuxin.xuxj.bean.ConsultConfigarea;

public interface ConsultConfigareaMapper {
    int deleteByPrimaryKey(String areacode);

    int insert(ConsultConfigarea record);

    int insertSelective(ConsultConfigarea record);

    ConsultConfigarea selectByPrimaryKey(String areacode);

    int updateByPrimaryKeySelective(ConsultConfigarea record);

    int updateByPrimaryKey(ConsultConfigarea record);
}