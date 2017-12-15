package cn.lxit.books.dao;

import java.util.List;

import cn.lxit.books.bean.Items;
import cn.lxit.books.bean.Orders;

public interface ItemsDao {
    /**
     * ���붩��
     * @param items
     * @return
     */
	boolean insertItems(Items items);
    /**
     * ��ѯ���ж���
     * @return
     */
	List<Items> getItems();
    /**
     * ���ݶ���id��ѯ����
     * @param oid
     * @return
     */
	List<Items> getItemsById(int oid);
    /**
     * �����û����Ʋ�ѯ����
     * @param userName
     * @return
     */
	public List<Items> getItemsByName(String userName);
}
