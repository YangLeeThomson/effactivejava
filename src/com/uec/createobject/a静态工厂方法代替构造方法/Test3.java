package com.uec.createobject.a��̬�����������湹�췽��;

public class Test3 {
	public static void main(String[] args) {
		Person p = Person.getInstance();
		Player pl = (Player) Person.getInstance2();
		Cooker c = (Cooker) Person.getInstance3();
	}
}

class Person {

	public static Person getInstance() {
		return new Person();
		// ������Ը�Ϊ return new Player() / Cooker()
	}
	public static Person getInstance2() {
		return new Player();
		// ������Ը�Ϊ return new Player() / Cooker()
	}
	public static Person getInstance3() {
		return new Cooker();
		// ������Ը�Ϊ return new Player() / Cooker()
	}
}

class Player extends Person {

}

class Cooker extends Person {

}
