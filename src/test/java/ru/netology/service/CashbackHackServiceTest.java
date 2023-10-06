package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
    public void couldRemainIfAmountNegative() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(-1000);

        Assert.assertEquals(result, 0);

    }
    @Test
    public void IfAmountEquallyBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(1000);

        Assert.assertEquals(result, 0);

    }

    @Test
    public void couldRemainIfExistsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(2000);

        Assert.assertEquals(result, 1000);

    }
}