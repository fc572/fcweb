package com.http_codes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class RispostaTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnStatusOK() throws Exception {
        this.mockMvc.perform(get("/codeswithheaders?codestatus=200")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("OK")));
    }
    @Test
    public void shouldReturnStatusNotFound() throws Exception {
        this.mockMvc.perform(get("/codeswithheaders?codestatus=404")).andDo(print()).andExpect(status().isNotFound())
                .andExpect(content().string(containsString("Not Found")));
    }
    @Test
    public void shouldReturnStatusIAmATeapot() throws Exception {
        this.mockMvc.perform(get("/codeswithheaders?codestatus=418")).andDo(print()).andExpect(status().isIAmATeapot())
                .andExpect(content().string(containsString("I'm a teapot")));
    }
}
