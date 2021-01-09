package com.lzu.edu.cn.designmode.command;
/**
 * 
 * @author junqiangliu
 *	命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在
 *	对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并吧该命令传给相应的对象，该对象执行命令
 *	意图：将一个请求封装成一个对象，从而可以使用不同的请求对客户进行参数化。
 *	主要解决：在某些场景，比如要对行为进行“记录、撤销/重做、事物”等处理，这种无法抵御变化的紧耦合是不合适的
 *	如何将“行为请求者”与“行为实现者”，解藕？将一组行为抽象为对象，可以实现二者之间的松耦合。
 *	如何解决：通过调用者调用接受者执行命令，顺序：调用者->命令->接受者
 *	关键代码：定义三个角色：1、received真正的命令执行对象 2、Command 3、invoker使用命令对象的入口
 *	优点：1、降低系统的耦合度，2、新的命令很容易添加到系统中
 * 	缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
 */
public class CommandPatternDemo {
	//使用Broker类来接受并执行命令
	public static void main(String[] args) {
		Stock abcStock = new Stock();
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.placeOrders();
	}
}
