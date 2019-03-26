package com.ch.gupao.pattern.prototype.simple;

public class CLient {
//    private Prototype prototype;
//
//    public CLient(Prototype prototype){
//        this.prototype = prototype;
//    }

    public Prototype StartClone(Prototype prototype){

        return prototype.clone();
    }
}
