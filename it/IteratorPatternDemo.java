package com.lzu.edu.cn.desiginmode.it;
/**
 * 
 * @author junqiangliu
 *	迭代器模式(iterator pattern)是Java和.Net编程环境中非常常用的设计模式。这种模式用于顺序访问
 *	集合对象的元素，不需要知道集合对象的底层表示（该模式属于行为型模式）。
 *	意图：提供一种方法顺序访问一个聚合对象中各个元素，而又无需暴露该对象的内部表示。
 *	主要解决：不同的方式来遍历整个整合对象。
 *	何时使用：遍历一个聚合对象
 *	如何解决：把在元素之间游走的责任交给迭代器，而不是聚合对象。
 *	应用实例：Java中的迭代器
 *  优点：1、它支持以不同的方式遍历一个聚合对象。 2、迭代器简化了聚合类。3、在同一个聚合上可以有多个遍历
 *  4、在迭代器模式中增加新的聚合类和迭代器类都很方便，无需修改原有代码。
 *  缺点：由于迭代器模式将存储数据和遍历数据职责分离，增加新的聚合类需要增加新的迭代器类，类的个数增加一定
 *  程度增加了系统的复杂性。
 *  使用场景：1、访问一个聚合对象的内容无须暴露它的内部表示。2、需要为聚合对象提供多种遍历方式。3、为遍历
 *  不同的聚合结构提供一个统一的接口。
 *  注意事项：迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器来负责，这样既可以做到不暴露集合的内部
 *  结构，又可让外部代码透明地访问集合内部的数据。
 */
public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRepository nameRepository=new NameRepository();
		for(Iterator iter=nameRepository.getIterator();iter.hasNext();) {
			String name=(String) iter.next();
			System.out.println("Name:"+name);
		}
	}
}
