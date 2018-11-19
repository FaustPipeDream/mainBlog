package com.mainblog.pojo;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Indexalice
 * @date 2018/10/28 23:11
 */
@Getter
@Setter
public class VueLoginInfoVo {
  @NotNull(message="用户名不允许为空")
  private String username;

  @NotNull(message="密码不允许为空")
  private String password;
}
