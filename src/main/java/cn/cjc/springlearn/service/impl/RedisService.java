package cn.cjc.springlearn.service.impl;

/**
 * @author debo
 * @date 2020-04-30
 */
public class RedisService {
    private String address;
    private Integer port;

    public RedisService(String address, Integer port) {
        this.address = address;
        this.port = port;
    }

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
