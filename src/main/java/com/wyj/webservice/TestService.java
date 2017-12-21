package com.wyj.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * webservice测试接口
 * 
 * 
 * @author：WangYuanJun
 * @date：2017年12月19日 下午9:36:49
 */
@WebService(name = "TestService", // 暴露服务名称
targetNamespace = "http://service.wyj.com"// 命名空间,一般是接口的包名倒序
)
public interface TestService {
    
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    String sendMessage(@WebParam(name = "username") String username);
}