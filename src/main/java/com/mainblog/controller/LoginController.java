package com.mainblog.controller;

import com.mainblog.httpresult.Result;
import com.mainblog.httpresult.ResultFactory;
import com.mainblog.pojo.VueLoginInfoVo;
import java.util.Objects;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Indexalice
 * @date 2018/10/28 22:51
 */
@Controller
public class LoginController {

  @CrossOrigin
  @RequestMapping(value = "/api/login", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
  @ResponseBody
  public Result login(@Valid @RequestBody VueLoginInfoVo loginInfoVo, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      String message = String.format("登陆失败，详细信息[%s]。", Objects
          .requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
      return ResultFactory.buildFailResult(message);
    }
    return ResultFactory.buildSuccessResult("登陆成功。");
  }
}
