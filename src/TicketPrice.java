public class TicketPrice {
    public static int ticketPrice(boolean children, boolean u22, boolean adult, int day,
                                  boolean normSeat, boolean vipSeat, boolean coupleSeat) {
        int price = 0;

        if (normSeat) price += 0;
        else if (vipSeat) price += 10000;
        else price += 20000;

        switch (day) {
            case 3, 4, 5 -> {
                if (children || u22) price += 55000;
                else price += 70000;
            }
            case 6, 7, 8 -> {
                if (children) price += 65000;
                else if (u22) price += 70000;
                else price += 85000;
            }
            case 2 -> {
                price += 50000;
            }
            default -> {
                System.out.println("Invalid day!");
                return 0;
            }
        }

        return price;
    }
}
