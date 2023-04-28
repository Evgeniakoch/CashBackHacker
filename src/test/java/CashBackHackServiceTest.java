import ru.netology.CashBackHackService;

import static org.junit.Assert.*;
public class CashBackHackServiceTest {

    @org.junit.Test
    public void remain() {
        int amount = 800;
        int expected = 200;
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void amountAboveBoundary() {
        int amount = 1200;
        int expected = 0;
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}