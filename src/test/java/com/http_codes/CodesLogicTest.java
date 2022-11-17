package com.http_codes;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.http_codes.logic.Codes;

public class CodesLogicTest {

    @Mock
    private Codes codesMock = new Codes();

    @Before
    public void init(){
        MockitoAnnotations.openMocks(codesMock);
    }

    @Test
    public void logicHappyPathTest(){
        String result = codesMock.workOutMeaningOfCode("202");
        assertTrue(result.contains("Accepted"));
    }

    @Test
    public void invalidCodeTest(){
        String result = codesMock.workOutMeaningOfCode("888");
        assertTrue(result.contains("nothing as it is not present in the list of valid HTTP codes"));
    }
}
