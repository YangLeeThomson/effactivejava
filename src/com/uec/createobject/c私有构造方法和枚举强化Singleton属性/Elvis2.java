package com.uec.createobject.c˽�й��췽����ö��ǿ��Singleton����;

/*
 * ����Elvis2����д����
 * ͨ��������ƣ����Ե���˽�й���������������
 * ���Ե�������д����Ȼ����bug
 * ��������Ҫ������⣬��������Ĺ����������޸Ĺ������������ڱ�Ҫ�󴴽���2��ʵ����ʱ���׳��쳣	
 */
public class Elvis2 {
	private static final Elvis2 INSTANCE = new Elvis2();
	private Elvis2(){
		
	}
	public void leaveTheBuilding(){
		
	}
	public static Elvis2 getInstance(){
		return INSTANCE;
	}
}
