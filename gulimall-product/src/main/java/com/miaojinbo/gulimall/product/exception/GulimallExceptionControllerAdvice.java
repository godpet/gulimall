package com.miaojinbo.gulimall.product.exception;

import com.miaojinbo.common.exception.BizCodeEnume;
import com.miaojinbo.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @Auther miaojinbo
 * @Create 2022-07-25-10:44
 */

/**
 * 集中处理所有异常
 */

@Slf4j

//@ResponseBody
//@ControllerAdvice(basePackages = "com.miaojinbo.gulimall.product.controller")
@RestControllerAdvice(basePackages = "com.miaojinbo.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e){
        log.error("数据校验出现问题{}，异常类型：{}", e.getMessage(), e.getClass());
        BindingResult result = e.getBindingResult();
        HashMap<String, String> map = new HashMap<>();
        result.getFieldErrors().forEach((item) ->{
            map.put(item.getField(), item.getDefaultMessage());
        });

        return R.error(BizCodeEnume.VALID_EXCEPTION.getCode(), BizCodeEnume.VALID_EXCEPTION.getMsg()).put("data", map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){

        return R.error(BizCodeEnume.UNKNOWN_EXCEPTION.getCode(), BizCodeEnume.UNKNOWN_EXCEPTION.getMsg());
    }


}
