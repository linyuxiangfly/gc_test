package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++){
            new Thread(){
                public void run(){
                    List<Byte[]> list=new ArrayList<>();
                    for(;;){
                        list.add(new Byte[1024]);
                        new TT().a();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }.start();
        }
    }


}