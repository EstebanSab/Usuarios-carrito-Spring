    package com.example.demo;
              
              import org.springframework.web.bind.annotation.GetMapping;
              import org.springframework.web.bind.annotation.RequestParam;
              import org.springframework.web.bind.annotation.RestController;
              
              @RestController
              public class DemoApplication {
                
                  
                  @GetMapping("/hello")
                  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
                  return String.format("Hello %s!", name);
                  }

                  @GetMapping("/andapaalla")
                  public String andapaalla(@RequestParam(value = "name", defaultValue = "World") String name) {
                  return String.format("andapaalla %s!", name);
                  }
                
              }
            