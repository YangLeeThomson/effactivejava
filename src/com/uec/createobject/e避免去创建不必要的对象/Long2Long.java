package com.uec.createobject.e����ȥ��������Ҫ�Ķ���;

public class Long2Long {
public static void main(String[] args) {
	System.out.println("start========="+System.currentTimeMillis());
	/*
	 * ����sum��������Long������long����ζ�ų����Լ����2��31�η���Long��ʵ��
	 * sum������Long����ԼҪ7.6��ſ��Եõ�������
	 * sum������long����ԼҪ700����
	 */
//	long sum = 0L;
	Long sum = 0L;
	for(long i = 0;i < Integer.MAX_VALUE;i++){
		sum += i;
	}
	/*
	 * ����ʹ�û������Ͷ�����װ��������ͣ���������ʶ���Զ�װ��
	 * 
	 */
	System.out.println(sum);
	System.out.println("end========="+System.currentTimeMillis());
}
}
