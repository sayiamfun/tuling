package com.liwenjie.tuling.tuling.system;

import com.liwenjie.tuling.tuling.system.entity.TuLingEntity.TuLingResult;
import com.liwenjie.tuling.tuling.utils.HttpClientUtil;
import com.liwenjie.tuling.tuling.utils.JSONUtils;
import com.liwenjie.tuling.tuling.utils.TuLingParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin //跨域
@RestController
public class controller {

    @GetMapping("{text}")
    public Object getSay(@PathVariable("text") String text){
        String params = TuLingParam.getParams(text, "");
        String s = HttpClientUtil.sendPost("http://openapi.tuling123.com/openapi/api/v2", params);
        TuLingResult tuLingResult = JSONUtils.jsonToPojo(s, TuLingResult.class);
        if(tuLingResult.getIntent().getCode() == 10004 ){
            return tuLingResult.getResults().get(0).getValues().getText();
        }else if(tuLingResult.getIntent().getCode() == 10008){
            return tuLingResult.getResults().get(0).getValues().getText();
        }
        return "不知道你在说什么呢~";
    }
}
