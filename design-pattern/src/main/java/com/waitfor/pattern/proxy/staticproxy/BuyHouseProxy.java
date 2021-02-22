package com.waitfor.pattern.proxy.staticproxy;

/**
 * 静态代理(https://www.cnblogs.com/daniels/p/8242592.html)
 *
 * @author zhouliang
 * @since 2021-2-22下午 12:48
 */
public class BuyHouseProxy implements BuyHouse{

    private BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHosue() {
        System.out.println("买房前准备");
        buyHouse.buyHosue();
        System.out.println("买房后装修");
    }
}
