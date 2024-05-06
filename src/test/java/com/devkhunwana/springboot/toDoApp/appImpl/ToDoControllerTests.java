package com.devkhunwana.springboot.toDoApp.appImpl; 
  
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

  
//@RunWith(SpringRunner.class) 
@ExtendWith(SpringExtension.class)
@WebMvcTest(TodoControllerJpa.class) 
class ToDoControllerTests { 
  
    
}