package com.uec.createobject.c˽�й��췽����ö��ǿ��Singleton����;
/*
 * ���ַ�ʽ���Կ��Է�ֹ���ʵ�������������乥����
 * ��Ԫ�ص�ö�������Ѿ���Ϊʵ��singleton����ѷ���
 */
public class Test3 {
public static void main(String[] args) {
	Resource rs = Elivis3.INSTANCE.getInstance();
	Resource rs2 = Elivis3.INSTANCE.getInstance();
	Resource rs3 = Elivis3.INSTANCE.getInstance();
	System.out.println(rs2);
	System.out.println(rs);
	System.out.println(rs3);
}
}
/*
 * 
 * 
 */
