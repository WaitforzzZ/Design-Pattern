package com.waitfor.pattern.factory.abstractfactory;

/**
 * 发送sms工厂
 *
 * @author zhouliang
 * @since 2021-2-20下午 2:36
 */
public class SendSmsFactory implements AbstractSendFactory{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
