package store.logic.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.User;
import store.logic.UserStoreLogic;

public class UserStoreLogicTest {
	
	private UserStoreLogic store;
	
	@Before
	public void setUp(){
		store = new UserStoreLogic();
	}

//	@Test
//	public void testCreate() {
//		User user = new User();
//		user.setLoginId("id");
//		user.setPassword("passwd");
//		user.setName("name");
//		assertEquals(true, store.create(user));
//	}

	@Test
	public void testRead() {
		assertEquals("name", store.read("id").getName());
	}

}
