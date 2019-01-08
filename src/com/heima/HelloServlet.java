package com.heima;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @Author:Wealthy
 * @Date:6/19/2018
 */
@WebServlet(name = "HelloServlet",urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = "{\"name\":\"lili\",\"age\":\"18\"}";
        JSONObject object1 = JSON.parseObject(s);
        Map map = JSON.parseObject(s);

        System.out.println("hello servlet");
        System.out.println(object1);
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
