package com.mainblog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Indexalice
 * @date 2018/10/28 19:50
 */
@Entity
@Table(name = "t_base_user")
@Getter
@Setter
public class BaseUserEntity {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "user_name")
  private String userName;
  @Column(name = "login_name")
  private String loginName;
  @Column(name = "password")
  private String password;
}
