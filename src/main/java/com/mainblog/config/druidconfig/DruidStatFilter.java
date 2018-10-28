package com.mainblog.config.druidconfig;

import com.alibaba.druid.support.http.WebStatFilter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @author Indexalice
 * @date 2018/10/28 19:31
 * 忽略静态资源加快访问速度
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
    initParams={
        @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
    })
public class DruidStatFilter extends WebStatFilter {

}
