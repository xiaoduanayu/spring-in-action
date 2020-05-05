package cn.cjc.springlearn.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author debo
 * @date 2020-04-30
 */
@Component
public class RedisService1 {
    @Value("${redis.address}")
    private String address;
    @Value("${redis.port}")
    private Integer port;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
