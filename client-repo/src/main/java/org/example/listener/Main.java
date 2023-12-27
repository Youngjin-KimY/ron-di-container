package org.example.listener;

import com.rooon.di.listener.ListenerInvoker;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ListenerChk lc = new ListenerChk();
        ListenerInvoker li = new ListenerInvoker(ListenerChk.class);
        li.invokeMethodWithInjectingParam(lc);

        Thread.sleep(10000);
        li.stop();


    }
}
