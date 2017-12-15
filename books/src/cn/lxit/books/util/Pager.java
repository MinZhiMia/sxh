package cn.lxit.books.util;

import java.util.List;

public class Pager<T> {

	private int pageIndex;// ��ǰҳ
	private int pageSize;// ÿҳ��ʾ������
	private int sumCount;// ������
	private int sumpage;// ��ҳ��
	private boolean isFirst;// �ǲ��ǵ���ҳ
	private boolean isLast;// �ǲ���βҳ
	private List<T> data;// ��ѯ����������

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		if (pageIndex < 1) {
			this.pageIndex = 1;
		} else {
			this.pageIndex = pageIndex;
		}

	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getSumCount() {
		return sumCount;
	}

	public void setSumCount(int sumCount) {
		this.sumCount = sumCount;

		this.sumpage = this.sumCount % pageSize == 0 ? this.sumCount / pageSize : this.sumCount / pageSize + 1;

		if (this.pageIndex > this.sumpage && this.sumpage > 0) {
			this.pageIndex = this.sumpage;
		}
	}
      
	public int getSumpage() {
		return sumpage;  
	}

	public void setSumpage(int sumpage) {
		this.sumpage = sumpage;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public boolean getIsFirst() {
		return this.pageIndex <= 1;
	}

	public boolean getIsLast() {
		return this.pageIndex >= this.sumpage;
	}
	
	

}
