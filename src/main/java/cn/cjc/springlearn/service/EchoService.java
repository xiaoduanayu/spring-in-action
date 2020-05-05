package cn.cjc.springlearn.service;

/**
 * @author debo
 * @date 2020-04-28
 */
public interface EchoService {
    /**
     * echo
     *
     * @param msg
     * @return
     */
    String echo(String msg);

    /**
     * echoAgain
     *
     * @param msg
     * @return
     */
    String echoAgain(String msg);
}
