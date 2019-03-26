package com.ch.gupao.pattern.prototype.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.h *= 2;
        this.d *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
