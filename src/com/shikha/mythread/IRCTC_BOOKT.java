package com.shikha.mythread;

public class IRCTC_BOOKT {

   private static Integer initialTicketCount=100;


    public static void bookTicket(String passengerName){

        System.out.println(" Booking initiated for ..... "+passengerName);

        synchronized(IRCTC_BOOKT.class) {
            if(initialTicketCount > 0){
                System.out.println("Ticket No : T-"+initialTicketCount+" Allocated to "+passengerName);
                initialTicketCount--;
            }else {
                System.out.println("Sorry ..."+passengerName+". Booking Full ... ");
            }
        }




    }

}
