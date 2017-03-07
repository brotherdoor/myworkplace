package store.mapper;

import domain.User;

public interface UserMapper {
	
	boolean create(User user);
	User read(String id);

}
