package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void ifRemainMoreThenAmount() {
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifRemainZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }
}