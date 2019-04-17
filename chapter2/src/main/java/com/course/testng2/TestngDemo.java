package com.course.testng2;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestngDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test4(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void test2(){
        Assert.assertEquals(2323,2323);
    }

    @Test
    public void test3(){
        Reporter.log("----这个test3输出的额日志-----");
//        throw new RuntimeException("这是特意抛出来看看的运行时异常");
    }

    @Test
    public void test5() throws IOException {
        String result;//用来存放结果。
        HttpGet get = new HttpGet("https://www.baidu.com");

        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);


    }

}
