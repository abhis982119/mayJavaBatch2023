package com.batch.maybatch.generic.basic;

import com.batch.maybatch.generic.basic.Page;

import java.util.List;

public class PageUtil<T> {


    public Page<T> getPage(List<T> list, int pageNumber){
        return new Page<T>(list, pageNumber);
    }

    
}
