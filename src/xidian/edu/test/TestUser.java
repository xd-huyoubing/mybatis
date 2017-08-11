/**
 * <p>Title: TestUser.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月10日上午10:21:12
 * @version 1.0
 */
package xidian.edu.test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import xidian.edu.pojo.User;

/**
 * <p>
 * Title: TestUser
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * University: xidian.edu
 * </p>
 * 
 * @author 胡有兵
 * @date 2017年8月10日上午10:21:12
 * @version 1.0
 */
public class TestUser {

	private SqlSessionFactory factory;

	@Before
	public void init() throws Exception {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		factory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testfindUserById() throws Exception {
		SqlSession openSession = factory.openSession();
		User user = openSession.selectOne("test.findUserById", 1);
		System.out.println(user);

	}
	@Test
	public void testfindUserByUsername() throws Exception {
		SqlSession openSession = factory.openSession();
		
		List<User> list = openSession.selectList("test.findUserByUsername", "张");
		
		System.out.println(list);

	}

	@Test
	public void testInsertUser() throws Exception {
		SqlSession openSession = factory.openSession();
		
		User user = new User();
		user.setUsername("zhangsan");
		user.setBirthday(new Date());
		openSession.insert("test.insertUser", user);
		
		
		System.out.println("返回的userID："+user.getId());
		
		openSession.commit();
		
		
		openSession.close();
	}
	
	
	
	@Test
	public void testDeleteUserById() throws Exception {
		SqlSession openSession = factory.openSession();
		openSession.delete("test.deleteUserById", 28);
		
		openSession.commit();
		openSession.close();
	}
	
	
	@Test
	public void testupdateUserById() throws Exception {
		SqlSession openSession = factory.openSession();
		User user = new User();
		user.setId(27);
		user.setUsername("张三");
		user.setBirthday(new Date());
		
		openSession.update("test.updateUserById", user);
		openSession.commit();
		
		openSession.close();
	}
	
	
	
}
