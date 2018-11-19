package com.mainblog.httpresult;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Indexalice
 * @date 2018/10/28 23:06
 */
@Getter
@Setter
public class Result {

  /**
   * 响应状态码
   */
  private int code;
  /**
   * 响应提示信息
   */
  private String message;
  /**
   * 响应结果对象
   */
  private Object data;

  public Result(int code, String message, Object data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }
}
