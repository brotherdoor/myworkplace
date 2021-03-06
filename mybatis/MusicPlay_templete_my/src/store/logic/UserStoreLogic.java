package store.logic;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.User;
import store.UserStore;
import store.mapper.UserMapper;

public class UserStoreLogic implements UserStore{
	
	private SqlSessionFactory factory;
	
	public UserStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public boolean create(User user) {
		SqlSession session = factory.openSession();
		try{
			UserMapper mapper = session.getMapper(UserMapper.class);
			if(mapper.create(user)){
				session.commit();
				return true;
			}else{
				session.rollback();
				return false;
			}
		}finally{
			session.close();
		}
	}

	@Override
	public User read(String id) {
		SqlSession session = factory.openSession();
		User user = null;
		try{
			UserMapper mapper = session.getMapper(UserMapper.class);
			user = mapper.read(id);
		}finally{
			session.close();
		}
		return user;
	}
	
	

}











