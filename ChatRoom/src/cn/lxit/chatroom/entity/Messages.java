package cn.lxit.chatroom.entity;

public class Messages {
	private String m_from;//������
	private String m_to;//������
	private String m_message;//��������
	private String m_addtime;//����ʱ��
	public String getM_from() {
		return m_from;
	}
	public void setM_from(String m_from) {
		this.m_from = m_from;
	}
	public String getM_to() {
		return m_to;
	}
	public void setM_to(String m_to) {
		this.m_to = m_to;
	}
	public String getM_message() {
		return m_message;
	}
	public void setM_message(String m_message) {
		this.m_message = m_message;
	}
	public String getM_addtime() {
		return m_addtime;
	}
	public void setM_addtime(String m_addtime) {
		this.m_addtime = m_addtime;
	}
	public Messages(String m_from, String m_to, String m_message, String m_addtime) {
		super();
		this.m_from = m_from;
		this.m_to = m_to;
		this.m_message = m_message;
		this.m_addtime = m_addtime;
	}
	public Messages(){
		super();
	}
}
