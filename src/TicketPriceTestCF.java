import org.junit.Test;
import org.junit.Assert;

//Kiểm thử dòng điều khiển (control flow)
public class TicketPriceTestCF {
    @Test
    public void Test_01 () {
        final int expected = 55000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                3,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_02 () {
        final int expected = 80000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                3,false, true, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_03 () {
        final int expected = 85000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                6,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_04 () {
        final int expected = 70000;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                6,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_05 () {
        final int expected = 85000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                6,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_06 () {
        final int expected = 50000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                2,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_07 () {
        final int expected = 0;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                1,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}
