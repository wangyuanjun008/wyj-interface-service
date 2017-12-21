package com.wyj.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * http服务端
 * 
 * 
 * @author：WangYuanJun
 * @date：2017年12月21日 下午8:27:08
 */
@RestController
@RequestMapping("/httpService")
public class HttpServiceTest {

    @RequestMapping(value = "/sendPostDataByMap", method = RequestMethod.POST)
    public String sendPostDataByMap(HttpServletRequest request, HttpServletResponse response) {
        String result = "调用成功：数据是 " + "name:" + request.getParameter("name") + " city:" + request.getParameter("city");
        return JSON.toJSONString(result);
    }
    
    @RequestMapping(value = "/sendPostDataByJson", method = RequestMethod.POST)
    public String sendPostDataByJson(HttpServletRequest request, HttpServletResponse response, @RequestBody String requestBody) {
        JSONObject jsonObject = JSONObject.parseObject(requestBody);
        String result = "调用成功：数据是 " + "name:" + jsonObject.getString("name") + " city:" + jsonObject.getString("city");
        return JSON.toJSONString(result);
    }
    
    @RequestMapping(value = "/sendGetData", method = RequestMethod.GET)
    public String sendGetData(HttpServletRequest request, HttpServletResponse response) {
        String result = "调用成功：数据是 " + "name:" + request.getParameter("name") + " city:" + request.getParameter("city");
        return JSON.toJSONString(result);
    }
}
