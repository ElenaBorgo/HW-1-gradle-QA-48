package ru.netology.junit.jupiter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

public class CahsbackHackJupiterTest {
    @Test
    public void ifRemainMoreThenAmount() {
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifRemainLessThenAmount() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(800);

        Assertions.assertEquals(expected, actual);
    }
}
