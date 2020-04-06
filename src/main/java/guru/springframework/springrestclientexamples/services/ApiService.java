package guru.springframework.springrestclientexamples.services;

import java.util.List;

import org.springframework.stereotype.Service;

import guru.springframework.api.domain.User;

@Service
public interface ApiService {
	List<User> getUser(Integer limit);
}
