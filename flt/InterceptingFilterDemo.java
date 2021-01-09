package com.lzu.edu.cn.desiginmode.flt;
/**
 * 
 * @author junqiangliu
 *	拦截过滤器模式用于对应用程序的请求或响应做一些预处理/后处理。定义过滤器，
 *	并在把请求传给实际目标应用程序之前应用在请求上。过滤器可以做认证/授权/记录日志
 *	然后把相应的请求传给相应的处理程序。以下是这种设计模式的实体。
 *	过滤器：过滤器在请求处理程序之前或者之后，执行某些任务。
 *	过虑器链：过滤器链带有多个过滤器，并在target上按照定义的顺序执行这些过滤器
 *	Target对象是请求处理程序
 *	过滤器管理器：过滤管理器管理过滤器和过滤器链
 *	客户端：Client是向Target对象发送请求的对象。
 *	
 */
public class InterceptingFilterDemo {
	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}
}
