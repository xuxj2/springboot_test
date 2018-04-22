package com.tuxin.xuxj.dao;

import com.tuxin.xuxj.bean.ConsultContent;
import com.tuxin.xuxj.bean.ConsultContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsultContentMapper {
    long countByExample(ConsultContentExample example);

    int deleteByExample(ConsultContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConsultContent record);

    int insertSelective(ConsultContent record);

    List<ConsultContent> selectByExample(ConsultContentExample example);

    ConsultContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConsultContent record, @Param("example") ConsultContentExample example);

    int updateByExample(@Param("record") ConsultContent record, @Param("example") ConsultContentExample example);

    int updateByPrimaryKeySelective(ConsultContent record);

    int updateByPrimaryKey(ConsultContent record);
}