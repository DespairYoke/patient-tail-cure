package com.zwd.app.Exception;

import com.alibaba.fastjson.JSON;
import com.zwd.app.util.RespInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwd
 * @date 2018/3/22 17:13
 * @Email lovejavazwd@gmail.com
 */
@ControllerAdvice
public class AutienceException extends Exception{

    @ExceptionHandler(Exception.class)
    public String error(Exception e){
        RespInfo respInfo = new RespInfo();
        respInfo.setMsg("请求不合法");
        e.printStackTrace();
        return JSON.toJSONString(respInfo);
    }
}
