package com.waitfor.pattern.factory.simplefactory;

/**
 * 发送mail
 *
 * @author zhouliang
 * @since 2021-2-20上午 10:26
 */
public class MailSender implements Sender{

    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
