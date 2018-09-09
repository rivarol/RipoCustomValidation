package nc.test;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import nc.controller.ValidatedPhoneController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:/spring/application-config.xml"})
@WebAppConfiguration
public class TestMvc {
	private MockMvc mockMvc;
	
	@Before
    public void setup(){
        this.mockMvc=MockMvcBuilders.standaloneSetup(new ValidatedPhoneController()).build();
    }


	@Test
	public void test() throws Exception {
		this.mockMvc.
	      perform(get("/validatePhone")).andExpect(view().name("phoneHome"));
	}

}
