/**
 * <p>Title: UserDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月10日下午2:29:15
 * @version 1.0
 */
package xidian.edu.mapper;

import java.util.List;

import xidian.edu.pojo.Orders;
import xidian.edu.pojo.User;

/**
 * <p>
 * Title: UserDao
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * University: xidian.edu
 * </p>
 * 
 * @author 胡有兵
 * @date 2017年8月10日下午2:29:15
 * @version 1.0
 */
public interface UserMapper {
	public User findUserById(Integer id);

	public List<User> findUserByUsername(String name);

	public List<Orders> findOrdersAndUser();

	public List<User> findUserAndOrders();
}
