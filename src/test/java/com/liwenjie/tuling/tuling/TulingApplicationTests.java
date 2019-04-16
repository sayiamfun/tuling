package com.liwenjie.tuling.tuling;

import com.liwenjie.tuling.tuling.utils.HttpClientUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TulingApplicationTests {

    @Test
    public void contextLoads() {
        String s = HttpClientUtil.sendPost("http://openapi.tuling123.com/openapi/api/v2", "{\n" +
                "\t\"reqType\":0,\n" +
                "    \"perception\": {\n" +
                "        \"inputText\": {\n" +
                "            \"text\": \"你好啊\"\n" +
                "        },\n" +
                "        \"inputImage\": {\n" +
                "            \"url\": \"\"\n" +
                "        },\n" +
                "        \"selfInfo\": {\n" +
                "            \"location\": {\n" +
                "                \"city\": \"\",\n" +
                "                \"province\": \"\",\n" +
                "                \"street\": \"\"\n" +
                "            }\n" +
                "        }\n" +
                "    },\n" +
                "    \"userInfo\": {\n" +
                "        \"apiKey\": \"f624cc9e68e940e4b45ef3f720c35273\",\n" +
                "        \"userId\": \"430528\"\n" +
                "    }\n" +
                "}");
        System.err.println(s);
    }

}
