package com.uec.createobject.a��̬�����������湹�췽��;

public class Test2 {
	 public static void main(String[] args)
	    {
	        MyMap<String, String> map1 = new MyMap<String, String>();

	        //���Ӽ�࣬����Ҫ�ظ�ָ�����Ͳ��������������Ƶ�����
	        MyMap<String, String> map2 = MyMap.newInstance();
	        MyMap<String, String> map3 = MyMap.newInstance();
	        System.out.println(map1);
	        System.out.println(map2);
	        System.out.println(map3);
	        
	    }
}
class MyMap<K,V> {
    /**
     *
     */
    public MyMap()
    {

    }

    public static <K,V> MyMap<K,V> newInstance(){
        return new MyMap<K, V>();

    }
}