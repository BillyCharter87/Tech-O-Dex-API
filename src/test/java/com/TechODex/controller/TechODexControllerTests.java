/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.TechODex.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.TechODex.dto.RegistrationDTO;
import com.TechODex.service.RegistrationService;
import com.TechODex.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value=RegistrationController.class,secure = false)
public class TechODexControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RegistrationService registrationService;

    @MockBean
    private UserService userService;


    private RegistrationDTO registrationDTO;

    @Before
    public void setup(){

        registrationDTO = new RegistrationDTO();
        registrationDTO.setFirstName("Bob");
        registrationDTO.setLastName("Tom");
        registrationDTO.seteId("abc123");
        registrationDTO.setTech("AWS");
    }

    @Test
    public void registrationControllerTest() throws Exception {

        //convert DTO to string
        String inputInJson = mapToJson(registrationDTO);


        //return DTO in @Before block when calling controller
        Mockito.when(registrationService.createRegistrant(Mockito.any(RegistrationDTO.class))).thenReturn(registrationDTO);


        //build request
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/registration")
                .accept(MediaType.APPLICATION_JSON).content(inputInJson)
                .contentType(MediaType.APPLICATION_JSON);

        //call controller
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        //assign MVC result to MockHttpServletResponse object so you can call getContentAsString() in next step
        MockHttpServletResponse response = result.getResponse();

        //convert response to string
        String outputInJson = response.getContentAsString();


        //assertions
        assertThat(outputInJson).isEqualTo(inputInJson);
        assertEquals(HttpStatus.OK.value(), response.getStatus());

    }


    @Test
    public void shouldReturnStatusOK() throws Exception {

        this.mockMvc.perform(get("/health")).andDo(print()).andExpect(status().isOk());
    }


    /**
     * Maps an Object into a JSON String. Uses a Jackson ObjectMapper.
     */
    public String mapToJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }

}
