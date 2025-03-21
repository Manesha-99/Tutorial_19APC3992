package com.example.stringmanipulationservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface StringManipulationService {
    @WebMethod
    public String reverseText(String text);

    @WebMethod
    public int countCharacters(String text);
}
