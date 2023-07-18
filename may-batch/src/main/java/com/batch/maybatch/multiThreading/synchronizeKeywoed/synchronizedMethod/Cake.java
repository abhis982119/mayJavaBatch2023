package com.batch.maybatch.multiThreading.synchronizeKeywoed.synchronizedMethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Cake {

    private int pieces ;

    public void setPieces(int pieces) {
        this.pieces = pieces;

    }

    public synchronized  void consumeCake(){  //lock

        if(pieces <= 0 ){
            System.out.println("Cake is completely consumed : " + Thread.currentThread().getName());
            return ;
        }

        System.out.println("pieces remained set by : " + Thread.currentThread().getName()  +
                " is : " + (pieces-1));

        pieces = pieces - 1;
    }
}
