package cn.lxit.charmon.dao;

import java.util.List;

import cn.lxit.charmon.ben.Messages;

public interface ChatrommDao {
	/**
	 * ���������¼
	 * @param messages
	 * @return
	 */
  boolean insertChatrom(Messages messages);
  /**
   * ��ѯ���� 
   * @param 
   * @return
   */
  List<Messages> getSelect();
  
  
  
}
