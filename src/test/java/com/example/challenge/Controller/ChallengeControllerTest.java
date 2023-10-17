package com.example.challenge.Controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest
class ChallengeControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    @DisplayName("Get /hello - HTTP 200")
    void greet()throws Exception{
      String endPointURL="/hello";
      mockMvc
              .perform(MockMvcRequestBuilders.get(endPointURL))
              //Then
              .andExpect(MockMvcResultMatchers.status().isOk());
    }

}