package cn.lxit.charmon.dao;

import java.util.List;

import cn.lxit.charmon.ben.Users;

public interface UserDao {
	/**
	 * �ж��û����Ƿ����
	 * @param u_name
	 * @return
	 */
  Users getUserName(String u_name);
  /**
   * �����û�
   * @param users
   * @return
   */
 public	boolean inserUser(Users users);
 /**
  * �ж��û���������
  * @param u_name
  * @param u_pass
  * @return
  */
  Users getLogin(String u_name,String u_pass);
  /**
   * �ж�״̬
   * @param user
   * @return
   */
 boolean getChckstatus(String u_name,int u_status);
   /**
    * �����û�
    * @param u_status
    * @return
    */
   List<Users> getUser(int u_status);
}
