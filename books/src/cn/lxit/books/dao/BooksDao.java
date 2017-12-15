package cn.lxit.books.dao;

import java.util.List;

import cn.lxit.books.bean.Books;
import cn.lxit.books.util.Pager;

public interface BooksDao {

        
	
	    // ���鼮��ҳ
		Pager<Books> getTopicsGetPageIndex(int pageIndex, int pageSize);

		// ������
		int getSumCount();
		
		//��ѯ�����鼮
	    List<Books> getBooks();
	    
		Books getBookById(int bid);        
	
}
