package com.TechODex;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Billy on 9/3/2018.
 */
public class TestUtil {


    /**
     * Maps an Object into a JSON String. Uses a Jackson ObjectMapper.
     */
    public String mapToJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
}
