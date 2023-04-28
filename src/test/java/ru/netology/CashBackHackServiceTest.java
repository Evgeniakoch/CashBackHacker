package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        int amount = 800;
        int expected = 200;
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void should() {
        int amount = 1200;
        int expected = 0;
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}