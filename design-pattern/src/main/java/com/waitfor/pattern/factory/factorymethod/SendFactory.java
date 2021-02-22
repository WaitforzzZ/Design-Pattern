package com.waitfor.pattern.factory.factorymethod;

/**
 * 静态工厂方法
 *
 * @author zhouliang
 * @since 2021-2-20上午 10:28
 */
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
