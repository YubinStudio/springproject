package com.yubin.springbootmybatis.service.impl;

import com.yubin.springbootmybatis.mapper.BridgeInfoMapper;
import com.yubin.springbootmybatis.pojo.BridgeInfo;
import com.yubin.springbootmybatis.pojo.BridgeInfoExample;
import com.yubin.springbootmybatis.service.BridgeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-19 16:41
 **/
@Service
public class BridgeInfoServiceImpl implements BridgeInfoService {

    @Autowired
    private BridgeInfoMapper bridgeInfoMapper;

    public List<BridgeInfo> getAllBridgeInfo() {
        BridgeInfoExample example = new BridgeInfoExample();
        BridgeInfoExample.Criteria criteria = example.createCriteria();

        List<BridgeInfo> bridgeInfos = bridgeInfoMapper.selectByExample(example);

        return bridgeInfos;
    }

    @Override
    public List<BridgeInfo> getOneBridgeInfo(String ip) {
        BridgeInfoExample example = new BridgeInfoExample();
        BridgeInfoExample.Criteria criteria = example.createCriteria();
        criteria.andNodeipEqualTo(ip);

        List<BridgeInfo> bridgeInfos = bridgeInfoMapper.selectByExample(example);
        return bridgeInfos;
    }

    @Override
    public String getMaxTemperature(String datatime) {
        String temperature = bridgeInfoMapper.getMaxTemperature(datatime);
        return temperature;
    }

   /* @Override
    public String updateBridgeInfoByIp(String ip, String gravity) {
        return String.valueOf(bridgeInfoMapper.updateByIpAndGravity(ip, gravity));
    }*/

    public String countBridgeInfo(){
        return bridgeInfoMapper.countBridgeInfo();
    }

}
