package cn.lxit.books.service;

import cn.lxit.books.bean.UserInfo;

public interface UserInfoService {

	 /**
	  * �ж��û��Ƿ����
	  * @param user
	  * @return
	  */
	 public boolean checkuser(UserInfo user);
	 
	 boolean insert(UserInfo user);
}
