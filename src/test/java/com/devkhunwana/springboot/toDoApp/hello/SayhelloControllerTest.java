package com.devkhunwana.springboot.toDoApp.hello; 
  
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc; 
  
//@RunWith(SpringRunner.class) 
@ExtendWith(SpringExtension.class)
@WebMvcTest(SayHelloController.class) 
class SayhelloControllerTest { 
  
    @Autowired
    private MockMvc mockMvc; 
  
    @Test
    public void checkSuccessMessage() throws Exception 
    { 
        this.mockMvc 
            .perform(get("/say-hello")) 
            .andExpect(status().isOk()) 
            .andExpect(content().string( 
                containsString("hello! What are you learning today?")));
        System.out.println(content().toString());
    } 
    
    @Test
    public void checkHtmlMessage() throws Exception 
    { 
        this.mockMvc 
            .perform(get("/say-hello-html")) 
            .andExpect(status().isOk()) 
            .andExpect(content().string( 
                containsString("My First Html page with body")));
//        System.out.println(content().toString());
    } 
    
    @Test
    public void checkJspMessage() throws Exception 
    { 
        this.mockMvc 
            .perform(get("/say-hello-jsp")) 
            .andExpect(status().isOk()) ;
//            .andExpect(content().)
//        System.out.println(content().toString());
    } 
}