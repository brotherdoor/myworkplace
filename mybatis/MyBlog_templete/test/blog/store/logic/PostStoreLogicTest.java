package blog.store.logic;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import blog.domain.Author;
import blog.domain.Blog;
import blog.domain.Comment;
import blog.domain.Post;
import blog.domain.Tag;

public class PostStoreLogicTest {
	
	private PostStoreLogic store;
	
	@Before
	public void setUp(){
		store = new PostStoreLogic();
	}

//	@Test
//	public void testFindPost() {
//		assertEquals("mybatis", store.findPost(1).getSubject());
//		assertEquals("mybatis3", store.findPost(2).getSubject());
//	}
//
//	@Test
//	public void testFindAllPost() {
//		assertEquals(3, store.findAllPost().size());
//		assertEquals("mybatis", store.findAllPost().get(0).getSubject());
//	}

	@Test
	public void testFindPostsByBlogId() {
		Post p = store.findPost(1);
		List<Tag> tagList = p.getTags();
		List<Comment> commentList = p.getComments();
		assertEquals("mybatis", tagList.get(0).getName());
		assertEquals("임재락", commentList.get(0).getName());
	}

//	@Test
//	public void testFindPostsByAuthorName() {
//		assertEquals(2, store.findPostsByAuthorName("박").size());
//	}
//
//	@Test
//	public void testFindPostsByBlogTitle() {
//		assertEquals(2, store.findPostsByBlogTitle("바람").size() );
//	}

//	@Test
//	public void testFindPostsBySubject() {
//		assertEquals(2, store.findPostsBySubject("my").size());
//	}
//
//	@Test
//	public void testFindPostsByContents() {
//		assertEquals(2, store.findPostsByContents("my").size());
//	}
//
//	@Test
//	public void testRegistPost() {
//		Post p = new Post();
//		Author a = new Author("n", "p", "e");
//		a.setId("22");
//		Blog b = new Blog();
//		b.setAuthor(a);
//		b.setId(22);
//		b.setTitle("t");
//		p.setAuthor(a);
//		p.setBlog(b);
//		p.setSubject("sub");
//		p.setContents("con");
//		
//		assertEquals(44, store.registPost(p));
//	}

//	@Test
//	public void testUpdatePost() {
//		Post p = store.findPost(54);
//		p.setSubject("update");
//		p.setContents("kkk");
//		
//		assertEquals(1, store.updatePost(p));	
//	}
//
//	@Test
//	public void testDeletePost() {
//		assertEquals(1, store.deletePost(54));
//	}

}
