package com.http_codes;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.http_codes.controller.CodesController;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CodesControllerTest {

    @Mock
    private Model modelmock;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRoot() throws Exception {
        CodesController codesController = new CodesController();
        String responseCode = codesController.codes("204", modelmock);
        assertThat(responseCode, containsString("codeDisplayPage"));
    }
}
