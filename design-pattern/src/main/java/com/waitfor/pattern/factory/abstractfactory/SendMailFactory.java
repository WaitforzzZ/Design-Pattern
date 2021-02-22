package com.waitfor.pattern.factory.abstractfactory;

/**
 * 发送mail工厂
 *
 * @author zhouliang
 * @since 2021-2-20下午 2:34
 */
public class SendMailFactory implements AbstractSendFactory{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
