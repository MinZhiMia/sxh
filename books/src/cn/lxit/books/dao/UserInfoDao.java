package cn.lxit.books.dao;

import cn.lxit.books.bean.UserInfo;

public interface UserInfoDao {

	 /**
	  * �ж��û��Ƿ����
	  * @param user
	  * @return
	  */
	 public boolean checkuser(UserInfo user);
	 
	 boolean insert(UserInfo user);
}
