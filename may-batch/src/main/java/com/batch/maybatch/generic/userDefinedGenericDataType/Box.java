package com.batch.maybatch.generic.userDefinedGenericDataType;
//<>
public class Box<T> {

    private T content ;


    public Box(){
        content = null;
    }
    public Box(T content) {
        this.content = content;
    }

    public void print(){
        System.out.println(content);
    }

    @Override
    public String toString() {
        return "["
                  + content +
                ']';
    }

    public T getContent() {
        return content;
    }

    public T add(T content){
        if(content != null) {
            this.content = content;
        }
        return content;
    }
}
