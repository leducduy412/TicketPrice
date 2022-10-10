import org.junit.Test;
import org.junit.Assert;

public class TicketPriceTestDT {
    @Test
    public void Test_01 () {
        final int expected = 0;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                1,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_02 () {
        final int expected = 50000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                2,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_03 () {
        final int expected = 60000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                2,false, true, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_04 () {
        final int expected = 70000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                2,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_05 () {
        final int expected = 55000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                3,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_06 () {
        final int expected = 65000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                3,false, true, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_07 () {
        final int expected = 75000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                3,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_08 () {
        final int expected = 65000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                7,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_09 () {
        final int expected = 75000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                7,false, true, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_10 () {
        final int expected = 85000;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                7,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_11 () {
        final int expected = 0;
        final int actual = TicketPrice.ticketPrice(true, false, false,
                9,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_12 () {
        final int expected = 0;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                1,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_13 () {
        final int expected = 50000;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                2,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_14 () {
        final int expected = 60000;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                2,false, true, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_15 () {
        final int expected = 70000;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                2,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_16 () {
        final int expected = 55000;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                3,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_17 () {
        final int expected = 65000;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                3,false, true, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_18 () {
        final int expected = 75000;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                3,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_19 () {
        final int expected = 70000;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                7,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_20 () {
        final int expected = 80000;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                7,false, true, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_21 () {
        final int expected = 90000;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                7,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_22 () {
        final int expected = 0;
        final int actual = TicketPrice.ticketPrice(false, true, false,
                9,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_23 () {
        final int expected = 0;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                1,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_24 () {
        final int expected = 50000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                2,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_25 () {
        final int expected = 60000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                2,false, true, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_26 () {
        final int expected = 70000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                2,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_27 () {
        final int expected = 70000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                3,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_28 () {
        final int expected = 80000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                3,false, true, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_29 () {
        final int expected = 90000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                3,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_30 () {
        final int expected = 85000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                7,true, false, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_31 () {
        final int expected = 95000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                7,false, true, false);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_32 () {
        final int expected = 105000;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                7,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_33 () {
        final int expected = 0;
        final int actual = TicketPrice.ticketPrice(false, false, true,
                9,false, false, true);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}
