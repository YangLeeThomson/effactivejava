package com.uec.createobject.a��̬�����������湹�췽��;

public class Test5 {
public static void main(String[] args) {
    // ����һ����������
    User tester = User.newTestInstance();
    // use tester
    System.out.println(tester);
}
static class User{
    String name ;
    int age ;
    String description;
    public static User newTestInstance() {
        User tester = new User();
        tester.setName("��������");
        tester.setAge(16);
        tester.setDescription("��ס���������ţ�");
        return tester;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
}
}
