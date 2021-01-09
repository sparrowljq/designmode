package com.lzu.edu.cn.desiginmode.st;
/**
 * 
 * @author junqiangliu
 *	在策略模式中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为模式。
 *	在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的context对象。策略对象
 *	改变context对象的执行算法。
 *	意图：定义一系列的算法，把它们一个个封装起来，并且是使它们可相互替换。
 *	主要解决：在有多种算法形似的情况下，使用if...else所带来的复杂和难以维护
 *	何时使用：一个系统有许多许多类，而区分它们的只是它们直接的行为。
 *	如何解决：将这些算法封装成一个一个类，任意地替换。
 *	关键代码：实现同一个接口
 *	应用实例：旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略。
 *	优点：1、算法可以自由切换 2、避免使用多重条件判断 3、扩展性良好。
 *	缺点：1、策略类会增多 2、所有策略类都需要对外暴露。
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context=new Context(new OperationAdd());
		System.out.println("10 + 5 ="+context.executeStrategy(10, 5));
		context=new Context(new OperationSubtract());
		System.out.println("10 - 5 ="+context.executeStrategy(10, 5));
		context=new Context(new OperationMultiply());
		System.out.println("10 * 5 ="+context.executeStrategy(10, 5));

	}
}
