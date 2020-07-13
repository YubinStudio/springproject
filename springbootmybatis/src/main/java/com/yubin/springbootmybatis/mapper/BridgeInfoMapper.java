package com.yubin.springbootmybatis.mapper;

import com.yubin.springbootmybatis.pojo.BridgeInfo;
import com.yubin.springbootmybatis.pojo.BridgeInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BridgeInfoMapper {
    long countByExample(BridgeInfoExample example);

    int deleteByExample(BridgeInfoExample example);

    int insert(BridgeInfo record);

    int insertSelective(BridgeInfo record);

    List<BridgeInfo> selectByExample(BridgeInfoExample example);

    int updateByExampleSelective(@Param("record") BridgeInfo record, @Param("example") BridgeInfoExample example);

    int updateByExample(@Param("record") BridgeInfo record, @Param("example") BridgeInfoExample example);

//    int updateByIpAndGravity(@Param("ip") String ip, @Param("gravity") String gravity);

    //获取温度的接口
    String getMaxTemperature(@Param("datatime") String datatime);

    String countBridgeInfo();
}