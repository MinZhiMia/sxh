package cn.lxit.books.service;

import java.util.List;

import cn.lxit.books.bean.Books;
import cn.lxit.books.util.Pager;

public interface BooksService {
	
	//��ѯ�����鼮
    List<Books> getBooks();
    
	// ���鼮��ҳ
	Pager<Books> getTopicsGetPageIndex(int pageIndex, int pageSize);

	// ������
	int getSumCount();
	
    
	Books getBookById(int bid);   
}
   