/**
 * <p>Title: TestUserMapper.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月10日下午2:48:00
 * @version 1.0
 */
package xidian.edu.test;


import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import xidian.edu.mapper.UserMapper;
import xidian.edu.pojo.Orders;
import xidian.edu.pojo.User;

/**
 * <p>
 * Title: TestUserMapper
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * University: xidian.edu
 * </p>
 * 
 * @author 胡有兵
 * @date 2017年8月10日下午2:48:00
 * @version 1.0
 */
public class TestUserMapper {
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void init() throws Exception {

		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);

		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();

		UserMapper mapper = openSession.getMapper(UserMapper.class);
		User user = mapper.findUserById(1);

		System.out.println(user);
	}

	@Test
	public void findUserByUsername() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();

		UserMapper mapper = openSession.getMapper(UserMapper.class);
		List<User> list = mapper.findUserByUsername("张");

		System.out.println(list);
	}

	@Test
	public void testFindOrdersAndUser() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		UserMapper mapper = openSession.getMapper(UserMapper.class);
		
		List<Orders> list = mapper.findOrdersAndUser();
		
		System.out.println(list);
	}
	
	@Test
	public void testfindUserAndOrders() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		UserMapper mapper = openSession.getMapper(UserMapper.class);
		
		List<User> list = mapper.findUserAndOrders();
		
		System.out.println(list);
	}
}
