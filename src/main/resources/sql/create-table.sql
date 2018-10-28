CREATE TABLE t_base_user
(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    user_name varchar(255) COMMENT '用户名',
    login_name varchar(255) COMMENT '登录名',
    password varchar(255) COMMENT '登录密码'
);
ALTER TABLE t_base_user COMMENT = '用户基础信息表';