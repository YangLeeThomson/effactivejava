package com.uec.createobject.c˽�й��췽����ö��ǿ��Singleton����;
/*
 * ����Elvis2����д����
 * ͨ��������ƣ����Ե���˽�й���������������
 * ���Ե�������д����Ȼ����bug
 * ��������Ҫ������⣬��������Ĺ����������޸Ĺ������������ڱ�Ҫ�󴴽���2��ʵ����ʱ���׳��쳣	
 */
public class Elvis1 {

	public static final Elvis1 INSTANCE = new Elvis1();
	
/*	private Elvis1(){
		
	}*/

    private static boolean flag = false;
    

	public void leaveTheBuilding(){
		
	}
	
	//����취��
	
	private Elvis1(){
	       synchronized(Elvis1.class)
	        {
	            if(flag == false)
	            {
	                flag = !flag;
	            }
	            else
	            {
	                throw new RuntimeException("����ģʽ���ַ���");
	            }

	        }
	}
	
}
