package com.sonan.restdocsstudy;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * // ref: https://effectivesquid.tistory.com/entry/Spring-Boot-starter-test-%EC%99%80-Junit5%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%9C-%ED%85%8C%EC%8A%A4%ED%8A%B8
 *
 * Created by Jaeseong on 2021/03/23
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@SpringBootTest(classes = RestDocsStudyApplication.class)
@ActiveProfiles("test")
public abstract class SpringTestSupport {
}
