package com.ch.gupao.pattern.prototype.deep;

public class DeepCloneTest {
    public static void main(String[] args) {

        QiTanDaSheng qiTanDaSheng = new QiTanDaSheng();
        try {
            QiTanDaSheng clone = (QiTanDaSheng) qiTanDaSheng.clone();
            System.out.println("深克隆" + (qiTanDaSheng.jinGuBang == clone.jinGuBang));
        }catch (Exception e){
            e.printStackTrace();
        }

        QiTanDaSheng q = new QiTanDaSheng();
        QiTanDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆" + (q.jinGuBang == n.jinGuBang));
    }

    //把内部的元素一个一个的迭代，再进行赋值
}
