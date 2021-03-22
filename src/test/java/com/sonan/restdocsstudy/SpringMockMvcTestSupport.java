package com.sonan.restdocsstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created by Jaeseong on 2021/03/23
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@AutoConfigureMockMvc
public class SpringMockMvcTestSupport extends SpringTestSupport {

    @Autowired
    protected MockMvc mockMvc;
}
