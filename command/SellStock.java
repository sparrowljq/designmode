package com.lzu.edu.cn.designmode.command;
/**
 * 
 * @author junqiangliu
 * 创建命令接口实体类
 */
public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}

}
