/**
 * <p>Title: User.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月10日上午9:17:58
 * @version 1.0
 */
package xidian.edu.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * Title: User
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * University: xidian.edu
 * </p>
 * 
 * @author 胡有兵
 * @date 2017年8月10日上午9:17:59
 * @version 1.0
 */
public class User implements Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String address;
	private Date birthday;
	private String sex;
	private List<Orders> orders;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the orders
	 */
	public List<Orders> getOrders() {
		return orders;
	}

	/**
	 * @param orders
	 *            the orders to set
	 */
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	/**
	 * <p>
	 * Title: toString
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", address=" + address + ", birthday=" + birthday
				+ ", sex=" + sex + "]";
	}

}
