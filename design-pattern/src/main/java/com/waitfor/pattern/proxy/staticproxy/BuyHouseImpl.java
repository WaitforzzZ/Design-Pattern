package com.waitfor.pattern.proxy.staticproxy;

/**
 *
 * @author zhouliang
 * @since 2021-2-22下午 12:46
 */
public class BuyHouseImpl implements BuyHouse{
    @Override
    public void buyHosue() {
        System.out.println("我要买房");
    }
}
