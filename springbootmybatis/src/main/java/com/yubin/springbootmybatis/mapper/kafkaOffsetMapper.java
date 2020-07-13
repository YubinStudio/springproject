package com.yubin.springbootmybatis.mapper;

import com.yubin.springbootmybatis.pojo.kafkaOffset;
import com.yubin.springbootmybatis.pojo.kafkaOffsetExample;
import com.yubin.springbootmybatis.pojo.kafkaOffsetKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface kafkaOffsetMapper {
    long countByExample(kafkaOffsetExample example);

    int deleteByExample(kafkaOffsetExample example);

    int deleteByPrimaryKey(kafkaOffsetKey key);

    int insert(kafkaOffset record);

    int insertSelective(kafkaOffset record);

    List<kafkaOffset> selectByExample(kafkaOffsetExample example);

    kafkaOffset selectByPrimaryKey(kafkaOffsetKey key);

    int updateByExampleSelective(@Param("record") kafkaOffset record, @Param("example") kafkaOffsetExample example);

    int updateByExample(@Param("record") kafkaOffset record, @Param("example") kafkaOffsetExample example);

    int updateByPrimaryKeySelective(kafkaOffset record);

    int updateByPrimaryKey(kafkaOffset record);
}