public class TicketPrice {
    public static int ticketPrice(boolean children, boolean u22, boolean adult,
                                  int day, boolean normSeat, boolean vipSeat, boolean coupleSeat) { //0
        int price = 0;                                          //1
        if (normSeat) {                                         //2
            price += 0;                                         //3
        } else if (vipSeat) {                                   //4
            price += 10000;                                     //5
        } else price += 20000;                                  //6
        switch (day) {                                          //7
            case 3, 4, 5 -> {
                if (children || u22) {                          //8
                    price += 55000;                             //9
                } else price += 70000;                          //10
            }
            case 6, 7, 8 -> {
                if (children) {                                 //11
                    price += 65000;                             //12
                } else if (u22) {                               //13
                    price += 70000;                             //14
                } else price += 85000;                          //15
            }
            case 2 -> {
                price += 50000;                                 //16
            }
            default -> {
                System.out.println("Invalid day!");             //17
                price = 0;                                      //17
            }
        }
        return price;                                           //18
    }
}
