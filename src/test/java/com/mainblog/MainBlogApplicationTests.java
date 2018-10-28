package com.mainblog;

import com.mainblog.entity.BaseUserEntity;
import com.mainblog.repository.BaseUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainBlogApplicationTests {

  @Autowired
  BaseUserRepository baseUserRepository;

  @Test
  public void contextLoads() {
    BaseUserEntity admin = baseUserRepository.findBaseUserEntityByUserName("admin");
    assertEquals("admin", admin.getLoginName());
  }

}
