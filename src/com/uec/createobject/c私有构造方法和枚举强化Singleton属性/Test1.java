package com.uec.createobject.c˽�й��췽����ö��ǿ��Singleton����;

import java.lang.reflect.Constructor;

public class Test1 {
/*
 * ��������д����
 * ͨ��������ƣ����Ե���˽�й���������������
 * ���Ե�������д������bug	
 */
public static void main(String[] args) {
//	Elvis1 e = new Elvis1();
	System.out.println(Elvis1.INSTANCE);
	System.out.println(Elvis1.INSTANCE);
	System.out.println(Elvis1.INSTANCE);
	
	 try
     {
         Class<Elvis1> classType = Elvis1.class;

         Constructor<Elvis1> c = classType.getDeclaredConstructor();
//         Constructor<Elvis1> c = classType.getConstructor();
         c.setAccessible(true);
         
         Elvis1 e2 = Elvis1.INSTANCE;
         Elvis1 e1 = (Elvis1)c.newInstance();
         System.out.println(e1==e2);
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }

}
}
