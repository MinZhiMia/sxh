package cn.lxit.books.service;

public interface OrdersService {

	
	   //ͨ���û�����ѯ����
	   int checkOrders(String userName);
	   //���붩��
	   boolean insertOrders(int oid,String userName);
}
