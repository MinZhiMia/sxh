package cn.lxit.charmon.sevice;

import java.util.List;

import cn.lxit.charmon.ben.Messages;

public interface ChatrommSevice {
	/**
	 * ���������¼
	 * @param messages
	 * @return
	 */
  boolean insertChatrom(Messages messages);
  /**
   * ��ѯ���� 
   * @param m_id
   * @return
   */
  List<Messages> getSelect();
}
