package com.batch.maybatch.multiThreading.join;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class ThreadJoinRunner {

    public static void main(String[] args) throws InterruptedException {


        CompletableFuture.runAsync( () -> System.out.println("abc"));


        // RANBIR WED ALIA  - Arrange Marriage

        Runnable ranbirAliaMeetUpTask = () -> {
            System.out.println("Ranbir Alia met & decided to marry"); // running
        }; //dead

        Runnable astrologerApprovedTask  = () -> {
            System.out.println("Astrologer approved and decided date "); //running
        }; //dead



        Runnable printCardTask = () -> {
            System.out.println(" take order to print cards "); //running
        };//dead

        Runnable bookVenueTask = () -> {
            System.out.println(" Book venue on given date ."); //running
        };//dead

        Runnable aliaRanbirGotMarriedTask = () -> {
            System.out.println("Ranbir Alia married "); //running
        };//dead


        Thread meetUpThread = new Thread(ranbirAliaMeetUpTask);  //new
        Thread astrologerBlessingThread = new Thread(astrologerApprovedTask); //new
        Thread venueBookThread = new Thread(bookVenueTask); //new
        Thread printCardThread = new Thread(printCardTask); //new
        Thread marriedThread = new Thread(aliaRanbirGotMarriedTask); //new


        meetUpThread.start();  // ready
        meetUpThread.join( );   //waiting

        astrologerBlessingThread.start(); //ready
        astrologerBlessingThread.join();  //waiting


        printCardThread.start();
        venueBookThread.start();


        printCardThread.join();
        venueBookThread.join();


        marriedThread.start();
        
    }
}
