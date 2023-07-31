package com.batch.maybatch.multiThreading.producerConsumerProblem;

public class Consumer implements  Runnable{

    private PC pc;

    public Consumer(PC pc) {
        this.pc = pc;
    }
    @Override
    public void run() {
        try {
            pc.consume();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
