package com.uec.createobject.a��̬�����������湹�췽��;

public class Test6 {
public static void main(String[] args) {
	
}
}
class Players {
    public static final int TYPE_RUNNER = 1;
    public static final int TYPE_SWIMMER = 2;
    public static final int TYPE_RACER = 3;
    int type;

    /**
     * 
	���Լ��ٶ��Ⱪ¶������
	�����������һ������Ҫ�ľ��飺���Ⱪ¶������Խ�࣬�����߾�Խ���׳���
	���Զ�������ṩ�ߣ�һ����˵��Ӧ��Ŭ�����ٶ��Ⱪ¶���ԣ��Ӷ����͵����߳���Ļ��ᡣ
     */
    //˽�И�����ֻ��������ڲ����ʣ��ⲿû��Ȩ�޷���
    private Players(int type) {
        this.type = type;
    }

    public static Players newRunner() {
        return new Players(TYPE_RUNNER);
    }
    public static Players newSwimmer() {
        return new Players(TYPE_SWIMMER);
    }
    public static Players newRacer() {
        return new Players(TYPE_RACER);
    }
}


