package com.sonan.restdocsstudy.controller;

import com.sonan.restdocsstudy.SpringMockMvcTestSupport;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Jaeseong on 2021/03/23
 * Git Hub : https://github.com/AnJaeSeongS2
 */
public class HelloControllerTest extends SpringMockMvcTestSupport {

    @Test
    void helloworldJsonTest() throws Exception {
        this.mockMvc.perform(get("/helloworld/json"))
                .andDo(print())
                .andExpect(status().is(HttpStatus.OK.value()))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.message").exists());
    }


    @Test
     void helloworldPageTest() throws Exception {
        this.mockMvc.perform(post("/helloworld/page").param("message", "testPageMessage"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(new MediaType("text", "html", Charset.forName("UTF-8"))))
                .andExpect(content().string("<!DOCTYPE html>\n" +
                        "<html lang=\"ko\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"utf-8\">\n" +
                        "    <title>testPageMessage</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<h1>hello.message: testPageMessage</h1>\n" +
                        "<h2>helloworld.ftl file.</h2>\n" +
                        "</body>\n" +
                        "</html>\n"));
    }
}
