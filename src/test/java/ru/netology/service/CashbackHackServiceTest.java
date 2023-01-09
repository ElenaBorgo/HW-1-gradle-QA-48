package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void ifRemainMoreAmount() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(200);
        int expected = 800;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ifRemainLessAmount() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }
}