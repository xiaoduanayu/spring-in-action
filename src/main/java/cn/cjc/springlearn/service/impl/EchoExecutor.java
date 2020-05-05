package cn.cjc.springlearn.service.impl;

/**
 * @author debo
 * @date 2020-04-28
 */
public class EchoExecutor {

    public String echo(String msg) {
        return String.format("echo: %s", msg);
    }
}
