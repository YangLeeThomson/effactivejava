package com.uec.createobject.c˽�й��췽����ö��ǿ��Singleton����;

public enum Elivis3 {

	INSTANCE;
	private Resource instance;
	Elivis3(){
		instance = new Resource();
	}
    public Resource getInstance() {
        return instance;
    }
	public void leaveTheBuilding(){
		
	}
}
class Resource{
	
}