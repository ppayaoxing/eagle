package com.seezoon.eagle.dubbo.test;

import org.springframework.test.context.ContextConfiguration;

import com.seezoon.eagle.core.test.BaseJunitTest;

/**
 * dubbo 测试父类
 * 
 * @author hdf
 *
 */
@ContextConfiguration(locations = {"classpath*:META-INF/spring/root.spring.xml"}) // 初始化core
public class DubboJunitTest extends BaseJunitTest{
}
