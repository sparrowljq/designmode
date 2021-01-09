package com.lzu.edu.cn.desiginmode.ob;

public class BinaryObserver extends Observer{
	
	public BinaryObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Binary String:"+Integer.toBinaryString(subject.getState()));
		
	}

}
