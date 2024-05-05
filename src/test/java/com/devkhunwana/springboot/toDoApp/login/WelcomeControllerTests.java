package com.devkhunwana.springboot.toDoApp.login; 

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
@ExtendWith(SpringExtension.class)
@WebMvcTest(WelcomeController.class) 
class ToDoControllerTests { 
  
  
    @Test
    public void checkSuccessMessage() throws Exception 
    { 

    } 

}