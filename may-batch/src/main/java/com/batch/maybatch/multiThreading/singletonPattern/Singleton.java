package com.batch.maybatch.multiThreading.singletonPattern;

import com.sun.xml.internal.ws.wsdl.writer.UsingAddressing;
import lombok.SneakyThrows;
import lombok.ToString;

import java.util.List;
import java.util.UUID;


public class Singleton  {

    private static  Singleton singleton ;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null)
                    singleton = new Singleton();
            }
        }
        return  singleton;
    }





}
