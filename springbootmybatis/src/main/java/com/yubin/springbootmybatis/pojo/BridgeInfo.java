package com.yubin.springbootmybatis.pojo;

import java.io.Serializable;

public class BridgeInfo implements Serializable {

    private String nodeip;

    private Integer status;

    private String weather;

    private Integer winddirection;

    private String windspeed;

    private String temperature;

    private String waterlevel;

    private String gravity;

    private String frequency;

    private String subsidencedegree;

    private String displacementdegree;

    private String tiltdegree;

    private Integer affectresult;

    private String datatime;

    public String getNodeip() {
        return nodeip;
    }

    public void setNodeip(String nodeip) {
        this.nodeip = nodeip == null ? null : nodeip.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public Integer getWinddirection() {
        return winddirection;
    }

    public void setWinddirection(Integer winddirection) {
        this.winddirection = winddirection;
    }

    public String getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed == null ? null : windspeed.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getWaterlevel() {
        return waterlevel;
    }

    public void setWaterlevel(String waterlevel) {
        this.waterlevel = waterlevel == null ? null : waterlevel.trim();
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity == null ? null : gravity.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public String getSubsidencedegree() {
        return subsidencedegree;
    }

    public void setSubsidencedegree(String subsidencedegree) {
        this.subsidencedegree = subsidencedegree == null ? null : subsidencedegree.trim();
    }

    public String getDisplacementdegree() {
        return displacementdegree;
    }

    public void setDisplacementdegree(String displacementdegree) {
        this.displacementdegree = displacementdegree == null ? null : displacementdegree.trim();
    }

    public String getTiltdegree() {
        return tiltdegree;
    }

    public void setTiltdegree(String tiltdegree) {
        this.tiltdegree = tiltdegree == null ? null : tiltdegree.trim();
    }

    public Integer getAffectresult() {
        return affectresult;
    }

    public void setAffectresult(Integer affectresult) {
        this.affectresult = affectresult;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime == null ? null : datatime.trim();
    }

    @Override
    public String toString() {
        return "BridgeInfo{" +
                "nodeip='" + nodeip + '\'' +
                ", status=" + status +
                ", weather='" + weather + '\'' +
                ", winddirection=" + winddirection +
                ", windspeed='" + windspeed + '\'' +
                ", temperature='" + temperature + '\'' +
                ", waterlevel='" + waterlevel + '\'' +
                ", gravity='" + gravity + '\'' +
                ", frequency='" + frequency + '\'' +
                ", subsidencedegree='" + subsidencedegree + '\'' +
                ", displacementdegree='" + displacementdegree + '\'' +
                ", tiltdegree='" + tiltdegree + '\'' +
                ", affectresult=" + affectresult +
                ", datatime='" + datatime + '\'' +
                '}';
    }
}