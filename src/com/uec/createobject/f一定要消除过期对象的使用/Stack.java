package com.uec.createobject.fһ��Ҫ�������ڶ����ʹ��;
/*
 * java �ڴ�й©��Ҫ3��ԭ��
 * 1�����������
 * 2����Դ�ǻ��棻����redis��session����
 * 3���������������ص�
 */
import java.util.Arrays;
import java.util.EmptyStackException;
/*
 * �������maybe�ᷢ���ڴ������
 * ԭ��һ��ջ��������������������ô����ջ�е������Ķ��󽫲��ᱻ�����������գ�
 * ��ʹʹ��ջ�ĳ�����������Щ��������Ҳ���ᱻGC���գ�
 * ������Ϊ,ջ�ڲ�ά���Ŷ���Щ����Ĺ������á�
 * ��ν�������ã���ָ��Զ���ᱻ��������á�
 */
public class Stack {
	/*
	 * ֧���������յ�java���ԣ��ڴ�й©�Ǻ����εģ��������ڴ�й©Ϊ������ʶ�Ķ���������
	 * �������Ľ���취�����ܼ򵥣���ֻҪһ����Ԫ������ջ��ָ���������þ͹����ˡ�
	 * �ڳ���33�д������롰elements[size] = null;���Ϳ�����ն�������á�
	 */
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITAL_CAPACITY = 16;
	public Stack(){
		elements = new Object[DEFAULT_INITAL_CAPACITY];
	}
	public void push(Object e){
		ensureCapacity();
		elements[size++] = e;
	}
	public Object pop(){
		if(size == 0){
			throw new EmptyStackException();
		}
		
//		elements[size] = null;
		return elements[--size];
	}
	private void ensureCapacity(){
		if(elements.length == size){
			elements = Arrays.copyOf(elements, 2*size+1);
		}
	}
}
