package com.mainblog.repository;

import com.mainblog.entity.BaseUserEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Indexalice
 * @date 2018/10/28 20:04
 */
public interface BaseUserRepository extends JpaRepository<BaseUserEntity,Integer> {

  /**
   * 根据用户名获取用户实体
    * @param userName 用户名
   * @return 用户实体
   */
  BaseUserEntity findBaseUserRepositoriesByUserName(String userName);
}
