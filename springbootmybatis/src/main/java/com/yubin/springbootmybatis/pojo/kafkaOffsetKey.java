package com.yubin.springbootmybatis.pojo;

public class kafkaOffsetKey {
    private String topicname;

    private Integer partitionid;

    private String groupid;

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname == null ? null : topicname.trim();
    }

    public Integer getPartitionid() {
        return partitionid;
    }

    public void setPartitionid(Integer partitionid) {
        this.partitionid = partitionid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }
}