package blog.store.logic;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import blog.domain.Post;
import blog.store.facade.PostStore;
import blog.store.mapper.PostMapper;

public class PostStoreLogic implements PostStore{
	
	private SqlSessionFactory factory;
	
	public PostStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public Post findPost(int id) {
		SqlSession session = factory.openSession();
		Post post = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			post = mapper.findPost(id);
		}finally{
			session.close();
		}
		return post;
	}

	@Override
	public List<Post> findAllPost() {
		SqlSession session = factory.openSession();
		List<Post> list = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			list = mapper.findAllPost();
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public List<Post> findPostsByBlogId(int id) {
		SqlSession session = factory.openSession();
		List<Post> list = null;
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			list = mapper.findPostsByBlogId(id);
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public List<Post> findPostsByAuthorName(String authorName) {
		SqlSession session = factory.openSession();
		List<Post> list = null;
		HashMap<String, String> map = new HashMap<>();
		map.put("name", authorName);
		try{
			list = session.selectList("findPostsByAuthorName", map);
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public List<Post> findPostsByBlogTitle(String blogTitle) {
		SqlSession session = factory.openSession();
		List<Post> list = null;
		HashMap<String, String> map = new HashMap<>();
		map.put("title", blogTitle);
		try{
			list = session.selectList("findPostsByBlogTitle", map);
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public List<Post> findPostsBySubject(String subject) {
		SqlSession session = factory.openSession();
		List<Post> list = null;
		HashMap<String, String> map = new HashMap<>();
		map.put("subject", subject);
		try{
			list = session.selectList("findPostsBySubject", map);
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public List<Post> findPostsByContents(String contents) {
		SqlSession session = factory.openSession();
		List<Post> list = null;
		HashMap<String, String> map = new HashMap<>();
		map.put("contents", contents);
		try{
			list = session.selectList("findPostsByContents", map);
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public int registPost(Post post) {
		SqlSession session = factory.openSession();
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			int generatedKey = mapper.registPost(post);
			session.commit();
			return generatedKey;
		}finally{
			session.close();
		}
	}

	@Override
	public int updatePost(Post post) {
		SqlSession session = factory.openSession();
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			int result = mapper.updatePost(post);
			if(result > 0){
				session.commit();
			}else{
				session.rollback();
			}
			return result;
		}finally{
			session.close();
		}
	}

	@Override
	public int deletePost(int id) {
		SqlSession session = factory.openSession();
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			int result = mapper.deletePost(id);
			if(result > 0){
				session.commit();
			}else{
				session.rollback();
			}
			return result;
		}finally{
			session.close();
		}
	}

}
