package com.uec.createobject.e����ȥ��������Ҫ�Ķ���;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
	public static void main(String[] args) {
		/*
		 * new String("stringette")���Ŷ����ѭ���У��ᴴ������ǧ�����String����
		 */
		String  s = new String("stringette");//Do not do this������
		
		// �Ľ���汾
		String ss = "stringette";
		System.out.println(new Person().isBabyBoomer());
	}

	
	
	private final Date birthDate = new Date();
	/*
	 * ÿ��isBabyBoomer()�����õ�ʱ�򣬶����½�һ��Calendar��һ��TimeZone������Dateʵ�������ǲ���Ҫ��
	 * ��ΪCalendarʵ���Ĵ��������ر𰺹󣡣���
	 */
	public boolean isBabyBoomer(){
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = gmtCal.getTime();
		
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}
	
}
