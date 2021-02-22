package com.waitfor.pattern.factory.simplefactory;

/**
 * 简单工厂
 *
 * @author zhouliang
 * @since 2021-2-20上午 10:28
 */
public class SendFactory {

    public static Sender produce(String type){
        Sender sender = null;
        switch (type) {
            case "mail":
                sender = new MailSender();
                break;
            case "sms":
                sender = new SmsSender();
                break;
        }
        return sender;
    }
}
