/**
 * <p>Title: UserDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月10日下午2:29:45
 * @version 1.0
 */
package xidian.edu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import xidian.edu.pojo.User;

/**
 * <p>Title: UserDaoImpl</p>
 * <p>Description: </p>
 * <p>University: xidian.edu</p> 
 * @author	胡有兵
 * @date	2017年8月10日下午2:29:45
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {
	private SqlSessionFactory sessionFactory;

	/**
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param sessionFactory
	 */
	public UserDaoImpl(SqlSessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * <p>Title: findUserById</p>
	 * <p>Description: </p>
	 * @param id
	 * @return
	 * @see xidian.edu.dao.UserDao#findUserById(java.lang.Integer)
	 */
	@Override
	public User findUserById(Integer id) {
		SqlSession openSession = sessionFactory.openSession();
		
		User user = openSession.selectOne("test.findUserById", id);
		
		return user;
	}

	/**
	 * <p>Title: findUserByUsername</p>
	 * <p>Description: </p>
	 * @param username
	 * @return
	 * @see xidian.edu.dao.UserDao#findUserByUsername(java.lang.String)
	 */
	@Override
	public List<User> findUserByUsername(String username) {
		SqlSession openSession = sessionFactory.openSession();
		List<User> list = openSession.selectList("test.findUserByUsername", "张");
		
		return list;
	}
	
	

}
