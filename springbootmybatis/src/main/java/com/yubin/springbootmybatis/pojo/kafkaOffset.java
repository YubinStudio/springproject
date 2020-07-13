package com.yubin.springbootmybatis.pojo;

public class kafkaOffset extends kafkaOffsetKey {
    private Long offset;

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }
}