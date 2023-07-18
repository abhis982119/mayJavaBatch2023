package com.batch.maybatch.multiThreading.synchronizeKeywoed.synchronizeBlock;

import lombok.SneakyThrows;

public class Runner {

    @SneakyThrows
    public static void main(String[] args){
        VotingMachine votingMachine = new VotingMachine();

        VotingBooth votingBooth = new VotingBooth(votingMachine);

        Runnable castVoteTask = () -> votingBooth.castVote();

        Thread ramesh = new Thread(castVoteTask );
        ramesh.setName("ramesh");
        Thread suresh = new Thread(castVoteTask);
        suresh.setName("suresh");
        Thread rajesh = new Thread(castVoteTask );
        rajesh.setName("rajesh");
        Thread mahesh = new Thread(castVoteTask);
        mahesh.setName("mahesh");


        ramesh.start();
        suresh.start();
        rajesh.start();
        mahesh.start();


        Thread.sleep(1000);

        System.out.println("Total votes casted : " + votingMachine.getVoteCount());
    }
}
