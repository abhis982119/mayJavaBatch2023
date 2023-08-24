package com.batch.maybatch.generic;

import java.util.List;

public class PageUtil<T> {


    public Page<T> getPage(List<T> list, int pageNumber){
        return new Page<T>(list, pageNumber);
    }

    
}
