package com.shikha.mythread;

public class IRCTC implements Runnable {

    private String passengerName;

  public IRCTC(String passengerName){
        this.passengerName=passengerName;
  }


    @Override
    public void run() {


      IRCTC_BOOKT.bookTicket(passengerName);
    }
}
