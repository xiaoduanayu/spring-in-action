package cn.cjc.springlearn.service.impl;

import cn.cjc.springlearn.service.EchoService;

/**
 * @author debo
 * @date 2020-04-28
 */
public class EchoServiceImpl implements EchoService {
    private EchoExecutor echoExecutor;

    public EchoServiceImpl() {
    }

    public EchoServiceImpl(EchoExecutor echoExecutor) {
        this.echoExecutor = echoExecutor;
    }

    @Override
    public String echo(String msg) {
        return msg;
    }

    @Override
    public String echoAgain(String msg) {
        return echoExecutor.echo(msg);
    }
}
