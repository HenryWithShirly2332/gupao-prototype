package com.ch.gupao.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

public class QiTanDaSheng extends Monkey implements Cloneable,Serializable {

    public JinGuBang jinGuBang;

    public QiTanDaSheng(){
        //只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    //克隆方法，采用的是深克隆
    //可能会出现单例被破坏的问题
    //
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone(){
        try {

            //在内存中完成操作，对象读写，是通过字节码直接操作
            //与序列化操作类似
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            //完整的 新的对象 new出来一个对象
            QiTanDaSheng copy = (QiTanDaSheng) ois.readObject();
            copy.birthday = new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public QiTanDaSheng shallowClone(QiTanDaSheng target){
        QiTanDaSheng qiTanDaSheng = new QiTanDaSheng();
        qiTanDaSheng.height = target.height;
        qiTanDaSheng.weight = target.weight;

        qiTanDaSheng.jinGuBang = target.jinGuBang;
        qiTanDaSheng.birthday = target.birthday;
        return qiTanDaSheng;
    }
}
