package guru.springframework.springrestclientexamples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;
	
	public final String api_url;
	
	public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
		this.restTemplate = restTemplate;
		this.api_url = api_url;
	}

	@Override
	public List<User> getUser(Integer limit) {
		
		UserData userdata = restTemplate.getForObject( api_url + limit, UserData.class);
		return userdata.getData();
	}

}
