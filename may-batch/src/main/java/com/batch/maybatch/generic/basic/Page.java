package com.batch.maybatch.generic.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.util.List;

@Getter
@Setter
@ToString
public class Page<T> {

    private int pageNumber ;

    private int pageSize = 20;

    private List<T> pageData;


    public void printPageData(){
        for ( T  pageItem: pageData ) {
            System.out.println(pageItem);
        }
    }


    public Page( List<T> pageData, int pageNumber) {
        this.pageNumber = pageNumber;
        this.pageData = pageData;
    }

}
