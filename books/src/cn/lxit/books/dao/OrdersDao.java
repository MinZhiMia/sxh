package cn.lxit.books.dao;

public interface OrdersDao {
       
	   //ͨ���û�����ѯ����
	   int checkOrders(String userName);
	   //���붩��
	   boolean insertOrders(int oid,String userName);
	    
}
