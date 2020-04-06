package guru.springframework.springrestclientexamples.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public List<User> getUser(Integer limit) {
		
		UserData userdata = restTemplate.getForObject("http://private-anon-872f6db5b2-apifaketory.apiary-mock.com/api/user?limit" + limit, UserData.class);
		return userdata.getData();
	}

}
