package com.batch.maybatch.multiThreading.synchronizeKeywoed.interviewQuestion;

import lombok.SneakyThrows;

public class VotingMachine {

    private int votingCount;

    public synchronized  int getVotingCount() {
        return votingCount;
    }

    @SneakyThrows
    public synchronized  void castVote(){
       votingCount++;
       System.out.println( Thread.currentThread().getName() + " total votes casted : " + votingCount);
       Thread.sleep(2000);
   }


}
