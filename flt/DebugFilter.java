package com.lzu.edu.cn.desiginmode.flt;

public class DebugFilter implements Filter{

	@Override
	public void execute(String request) {
		System.out.println("request log:"+request);
		
	}

}
