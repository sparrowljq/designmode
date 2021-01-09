package com.lzu.edu.cn.desiginmode.st;

public class OperationSubtract implements Strategy{

	@Override
	public int doOperation(int num1, int num2) {
		return num1-num2;
	}

}
