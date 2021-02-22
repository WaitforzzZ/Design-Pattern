package com.waitfor.pattern.proxy.staticproxy;

/**
 *
 * @author zhouliang
 * @since 2021-2-22下午 12:50
 */
public class Test {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHosue();
    }
}
