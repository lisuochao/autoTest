package com.course.testng2;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.jsoup.helper.HttpConnection;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

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
    private String url;
    private ResourceBundle bundle;
    private CookieStore store;

    @BeforeTest
    public  void beforeTest(){
        url = "http://192.168.2.5/web/....";

    }

    @Test
    public void getCookie() throws IOException {
        HttpGet get = new HttpGet(url);
        DefaultHttpClient client = new DefaultHttpClient();
        client.execute(get);
        store = client.getCookieStore();
    }
    @Test(dependsOnMethods = "getCookie")
    public void test5() throws IOException {
        String result;//用来存放结果。
        HttpGet get = new HttpGet(url);

        DefaultHttpClient client = new DefaultHttpClient();
        client.setCookieStore(store);
        HttpResponse response = client.execute(get);
        int statusCode = response.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode,200);
//        //获取cookies
//       CookieStore store = client.getCookieStore();
//       List<Cookie> cookies = store.getCookies();
//       for(Cookie cookie : cookies){
//            String name = cookie.getName();
//            String value = cookie.getValue();
//           System.out.println("cookie 的 name  === " + name + "cookie value  === " + value);
//       }
//        //将cookies加入请求，设置cookies
//        client.setCookieStore(store);
//        HttpResponse response = client.execute(get);

        //获取响应状态
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("输出statusCode = " + statusCode);

        if (statusCode == 200){
            result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println("输出最终结果，result = " + result);
        }
        Assert.assertEquals(statusCode,200);

    }


    @Test(dependsOnMethods = "getCookie")
    public void test6(){
        HttpPost post = HttpPost(url);
        DefaultHttpClient client = new DefaultHttpClient();

        JSONObject param = new JSONObject();
        param.put("data","");

        post.setHeader("content-type","application/json");

        




        client.setCookieStore(store);
        HttpResponse response = client.execute(url);


    }
}
