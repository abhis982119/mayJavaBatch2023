package com.batch.maybatch.multiThreading.synchronizeKeywoed.synchronizeBlock;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class VotingBooth {

    private final  VotingMachine votingMachine;

    public void castVote(){
        System.out.println(Thread.currentThread().getName() + " came to cast vote");

        synchronized (votingMachine) {
            votingMachine.castVote();
        }
    }
}
