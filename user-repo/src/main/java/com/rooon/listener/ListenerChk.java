package com.rooon.listener;

import com.rooon.di.listener.Listener;

public class ListenerChk {

    @Listener
    public void listen(int data) {
        System.out.println("Listen: "+ data);
    }
}
