package com.yubin.springbootmybatis.controller;

import com.yubin.springbootmybatis.pojo.BridgeInfo;
import com.yubin.springbootmybatis.pojo.JsonData;
import com.yubin.springbootmybatis.service.BridgeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springproject
 * @description: 桥梁controll层信息
 * @author: jyb
 * @create: 2019-11-19 16:32
 **/
@RestController
@RequestMapping("bridge")
public class BridgeInfoController {

    @Autowired
    private BridgeInfoService bridgeInfoService;

    /**
     * 查询所有信息
     *
     * @return
     */
    @RequestMapping(path = "/v1/getAllBridgeInfo")
    public JsonData getAllBridgeInfo() {
        List<BridgeInfo> allBridgeInfo = bridgeInfoService.getAllBridgeInfo();
        for (BridgeInfo bridgeInfo : allBridgeInfo) {
            System.out.println(bridgeInfo);
        }
        JsonData jsonData = new JsonData();
        jsonData.setStatus("200");
        jsonData.setData(allBridgeInfo);
        return jsonData;
    }

    /**
     * 根据IP查询信息
     *
     * @param id
     * @return
     */
    @RequestMapping(path = "/v1/getOneBridgeInfo")
    public JsonData getOneBridgeInfo(@RequestParam("user_id") String id) {
        List<BridgeInfo> oneBridgeInfo = bridgeInfoService.getOneBridgeInfo(id);
        for (BridgeInfo bridgeInfo : oneBridgeInfo) {
            System.out.println(bridgeInfo);
        }
        JsonData jsonData = new JsonData();
        jsonData.setStatus("200");
        jsonData.setData(oneBridgeInfo);
        return jsonData;
    }

    /**
     * 查询某一天的最高温度
     * @param dataTime
     * @return
     */
    @RequestMapping(path = "/v1/getMaxTemperature")
    public JsonData getMaxTemperature(@RequestParam("datatime") String dataTime) {
        String temperature = bridgeInfoService.getMaxTemperature(dataTime);
        JsonData jsonData = new JsonData();
        jsonData.setStatus("2001");
        jsonData.setData(temperature);
        System.out.println(jsonData);
        return jsonData;
    }

    /**
     * 自定义获取所有表记录
     * @param
     * @return
     */
    @RequestMapping(path = "/v1/countBridgeInfo")
    public JsonData countBridgeInfo() {
        String result = bridgeInfoService.countBridgeInfo();
        JsonData jsonData = new JsonData("007",result);
        System.out.println(jsonData);
        return jsonData;
    }
}
