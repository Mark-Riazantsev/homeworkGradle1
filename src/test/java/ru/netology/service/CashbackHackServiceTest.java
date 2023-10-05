package ru.netology.service;

import  org.junit.Assert;
import org.junit.Test;



public class CashbackHackServiceTest {

    @Test
    public void couldRemainIfAmountZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(0);

        Assert.assertEquals(result, 1000);

    }
    @Test
    public void couldRemainIfAmountPositive() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(500);

        Assert.assertEquals(result, 500);

    }
    @Test
    public void couldRemainIfExistsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(2000);

        Assert.assertEquals(result, 1000);

    }
}