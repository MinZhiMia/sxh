package cn.lxit.books.bean;

public class Books {
	
	private int bid;// ͼ��id
	private String bookname;// ͼ������
	private double b_price;// �۸�
	private String image;// ͼ��ͼƬ�Ĵ��·��
	private int stock;// �����

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public double getB_price() {
		return b_price;
	}

	public void setB_price(double b_price) {
		this.b_price = b_price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
}
