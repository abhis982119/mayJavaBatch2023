package com.batch.maybatch.multiThreading.synchronizeKeywoed.interviewQuestion;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        VotingMachine votingMachine = new VotingMachine();

        CompletableFuture.runAsync(votingMachine::castVote);
        CompletableFuture.runAsync(votingMachine::castVote);
        CompletableFuture.runAsync(votingMachine::castVote);
        CompletableFuture.runAsync(votingMachine::castVote);

        System.out.println( "total vote count till now " + votingMachine.getVotingCount());

        Thread.sleep(10000);
    }
}
