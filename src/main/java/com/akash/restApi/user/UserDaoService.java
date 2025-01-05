package com.akash.restApi.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	public static int userCount = 0;
	
	static {
		users.add(new User(++userCount, "Akash", LocalDate.now().minusYears(20)));
		users.add(new User(++userCount, "Vikas", LocalDate.now().minusYears(10)));
		users.add(new User(++userCount, "Harsh", LocalDate.now().minusYears(30)));
		users.add(new User(++userCount, "Tanmay", LocalDate.now().minusYears(15)));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		Predicate<? super User> Predicate = user -> user.getId().equals(id);
		return users.stream().filter(Predicate).findFirst().orElse(null);
	}
	
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}

	public void deleteById(int id) {
		Predicate<? super User> Predicate = user -> user.getId().equals(id);
		users.removeIf(Predicate);
	}
}
