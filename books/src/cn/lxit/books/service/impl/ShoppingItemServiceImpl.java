package cn.lxit.books.service.impl;

import cn.lxit.books.bean.Books;
import cn.lxit.books.bean.ShoppingItem;
import cn.lxit.books.service.BooksService;
import cn.lxit.books.service.ShoppingItemService;

public class ShoppingItemServiceImpl extends ShoppingItemService {
   
	@Override//��ӵ�����Ʒ
	public boolean addShoppingItem(int bid) {
		ShoppingItem shoppingItem = null;

		// �ж�bid����Ʒ�Ƿ��ڹ��ﳵ�Ѵ���
		for (ShoppingItem item : this.getItems()) {
			if (item.getItem().getBid() == bid) {
				shoppingItem = item;
				break;
			}
		}
     
		if (shoppingItem == null) {  
			// ��Ʒ�����ڣ������Ʒ
			BooksService book = new BooksServiceImpl();
			// ������Ʒ�ı�Ų�ѯ��Ʒ
			Books books = book.getBookById(bid);
			// Ҫ��ӵ���Ʒ����
			ShoppingItem bItem = new ShoppingItem();
			bItem.setItem(books);
			bItem.setCount(1);
			// ����Ʒ���빺�ﳵ
			this.getItems().add(bItem);
		} else {
			// �����Ʒ�Ѿ�����,����ԭ���������ϼ�һ
			shoppingItem.setCount(shoppingItem.getCount() + 1);
		}

		return true;
	}

	@Override//һ����Ӷ����Ʒ
	public boolean addShoppingItem(Books book) {
		ShoppingItem shoppingItem = null;

		// �ж�bid����Ʒ�Ƿ��ڹ��ﳵ�Ѵ���
		for (ShoppingItem item : this.getItems()) {
			if (item.getItem().getBid() == book.getBid()) {
				shoppingItem = item;
				break;
			}
		}

		if (shoppingItem == null) {
			// Ҫ��ӵ���Ʒ����
			ShoppingItem bItem = new ShoppingItem();
			bItem.setItem(book);
			bItem.setCount(1);
			// ����Ʒ���빺�ﳵ
			this.getItems().add(bItem);
		} else {
			// �����Ʒ�Ѿ�����,����ԭ���������ϼ�һ
			shoppingItem.setCount(shoppingItem.getCount() + 1);
		}

		return true;
	}
               
	@Override  
	public boolean updateShoppingItem(int bid, int count) {
		ShoppingItem shoppingItem = null;
		// �ж���Ʒ�Ƿ����
		for (ShoppingItem item : this.getItems()) {
			if (item.getItem().getBid() == bid) {
				shoppingItem = item;
				break;
			}
		}

		shoppingItem.setCount(count);
		return true;
	}

	@Override
	public boolean removeItem(int bid) {
		ShoppingItem shoppingItem = null;
		// �ж���Ʒ�Ƿ����
		for (ShoppingItem item : this.getItems()) {
			if (item.getItem().getBid() == bid) {
				shoppingItem = item;
				break;
			}
		}

		this.getItems().remove(shoppingItem);
		return true;
	}

}
