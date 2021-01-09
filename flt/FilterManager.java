package com.lzu.edu.cn.desiginmode.flt;
/**
 * 
 * @author junqiangliu
 *	创建过滤器管理器
 */
public class FilterManager {
	FliterChain fliterChain;
	public FilterManager(Target target) {
		fliterChain=new FliterChain();
		fliterChain.setTarget(target);
	}
	public void setFilter(Filter filter) {
		fliterChain.addFilter(filter);
	}
	public void filterRequest(String request) {
		fliterChain.execute(request);
	}
}
