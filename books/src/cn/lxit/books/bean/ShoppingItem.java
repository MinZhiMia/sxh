package cn.lxit.books.bean;

/**
 * ��Ʒ��
 * 
 * @author Administrator
 *
 */
public class ShoppingItem {

	// �������Ʒ
	private Books item;
	// ��Ʒ������
	private int count;
	// ��Ʒ�ļ۸�
	private double b_price;

	public Books getItem() {
		return item;
	}

	public void setItem(Books item) {
		this.item = item;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * ��ȡ��Ʒ��С��
	 * 
	 * @return
	 */
	public double getB_price() {
		b_price = item.getB_price() * count;
		return b_price;
	}

	public void setPrice(double b_price) {
		this.b_price = b_price;
	}

}
