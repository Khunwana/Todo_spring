package com.devkhunwana.springboot.toDoApp.appImpl; 
  
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension; 
  
//@RunWith(SpringRunner.class) 
@ExtendWith(SpringExtension.class)
@WebMvcTest(TodoController.class) 
class ToDoControllerTests { 
  
//    @Autowired
//    private MockMvc mockMvc; 
  
//    @Test
//    public void checkSuccessMessage() throws Exception 
//    { 
//        this.mockMvc 
//            .perform(get("/say-hello")) 
//            .andExpect(status().isOk()) 
//            .andExpect(content().string( 
//                containsString("hello! What are you learning today?")));
//        System.out.println(content().toString());
//    } 
//    
//    @Test
//    public void checkHtmlMessage() throws Exception 
//    { 
//        this.mockMvc 
//            .perform(get("/say-hello-html")) 
//            .andExpect(status().isOk()) 
//            .andExpect(content().string( 
//                containsString("My First Html page with body")));
////        System.out.println(content().toString());
//    } 
//    
//    @Test
//    public void checkJspAval() throws Exception 
//    { 
//        this.mockMvc 
//            .perform(get("/list-todos")) 
//            .andExpect(status().isOk()) ;
////            .andExpect(content().)
////        System.out.println(content().toString());
//    } 
}