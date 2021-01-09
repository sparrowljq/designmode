package com.lzu.edu.cn.desiginmode.ob;
/**
 * 
 * @author junqiangliu
 * 当对象存在一对多的关系时，使用观察者模式。比如，当一个对象被修改时，则
 * 自动通知依赖它的对象。观察者模式属于行为型模式。
 * 意图：定义对象间一种一对多的依赖关系，当一个对象的状态发生改变时，所有
 * 依赖它的对象都得到通知并被自动更新。
 * 主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合
 * 保证高度的协作。
 * 何时使用：一个对象（目标对象）的状态改变，所有的依赖对象（观察者对象）
 * 都将的到通知，进行广播通知。
 * 如何解决：使用面向对象技术，可以将这种依赖关系弱化。
 * 关键代码：在抽象类中有一个ArrayList存放观察者。
 * 应用实例：拍卖的时候，拍卖师观察最高标价，然后通知给其他竞价者竞价。
 * 优点：1、观察者和被观察者是抽象耦合的 2、建立一套出发机制
 * 缺点：1、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会
 * 花费很多时间。 2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行
 * 循环调用，可能导致系统崩溃。 3、观察者模式没有相应的机制让观察
 * 者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
 * 使用场景：
 * 一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使它们
 * 可以各自独立地改变和复用。
 * 一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低
 * 对象之间的耦合度。一个对象必须通知其他对象，而并不知道这些对象是谁。
 * 需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象……，可以使用观察者
 * 模式创建一种链式触发机制。
 * 
 */
public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject=new Subject();
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		System.out.println("First state change:15");
		subject.setState(15);
		System.out.println("Second state change:10");
		subject.setState(10);
	}
}