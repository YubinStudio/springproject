package com.yubin.springbootmybatis.service;

import com.yubin.springbootmybatis.pojo.BridgeInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BridgeInfoService {
    List<BridgeInfo> getAllBridgeInfo();

    List<BridgeInfo> getOneBridgeInfo(String id);

//    String updateBridgeInfoByIp(String ip,String gravity);

    String getMaxTemperature(String datatime);

    String countBridgeInfo();

}
