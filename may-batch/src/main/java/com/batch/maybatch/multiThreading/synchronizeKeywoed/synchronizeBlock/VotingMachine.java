package com.batch.maybatch.multiThreading.synchronizeKeywoed.synchronizeBlock;


import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class VotingMachine {

    private int voteCount;


    public void castVote(){
         voteCount += 1;
    }

}
