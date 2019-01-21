package com.wangxuegang.service;

import java.util.List;

/**
 * 
 * @类描述：DemoService
 * @项目名称：dubbo-api
 * @包名： com.wangxuegang.service
 * @类名称：DemoService
 * @创建人：wangxuegang
 * @创建时间：2019年1月18日下午3:12:45
 * @mail 15510235102@163.com
 * @version v1.0
 */
public interface DemoService {
	
	List<String> getPermissions(Long id);
}
