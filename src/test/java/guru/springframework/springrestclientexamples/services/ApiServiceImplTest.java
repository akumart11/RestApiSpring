package guru.springframework.springrestclientexamples.services;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.api.domain.User;
import guru.springframework.springrestclientexamples.services.ApiService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

	@Autowired
	ApiService apiService;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		List<User> user = apiService.getUser(1);
		assertEquals(1, user.size());
	}

}
