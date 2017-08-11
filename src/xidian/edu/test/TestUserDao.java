/**
 * <p>Title: TestUserDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月10日下午2:36:04
 * @version 1.0
 */
package xidian.edu.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import xidian.edu.dao.UserDao;
import xidian.edu.dao.UserDaoImpl;
import xidian.edu.pojo.User;

/**
 * <p>
 * Title: TestUserDao
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * University: xidian.edu
 * </p>
 * 
 * @author 胡有兵
 * @date 2017年8月10日下午2:36:04
 * @version 1.0
 */
public class TestUserDao {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void init() throws Exception{
		
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		
		User user = userDao.findUserById(1);
		System.out.println(user);
	}
	
	@Test
	public void testFindUserUserName() throws Exception {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		
		List<User> list = userDao.findUserByUsername("张");
		System.out.println(list);
	}

}
