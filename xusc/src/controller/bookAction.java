package controller;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.bookDAOImp;
import dao.bookDAO;
import model.mybook;

public class bookAction extends ActionSupport {
	
	/**
	 * 
	 */
	/*�����Ʒ*/
	private static final long serialVersionUID = 1L;

	List<String[]> book;
	List<mybook> bookByObj;
	public List<String[]> getBook() {
		return book;
	}
	
	public List<mybook> getBookByObj() {
		return bookByObj;
	}
	public String execute() throws Exception {
		bookDAO dao = new bookDAOImp();
		book = dao.getAllbook();
		bookByObj=dao.getAllbookByObj();
		System.out.println(bookByObj);
		return SUCCESS;

	}
	mybook mybook=null;
	public mybook getMybook() {
		return mybook;
	}

	public void setMybook(mybook mybook) {
		this.mybook = mybook;
	}
	/*�����Ʒ*/
	public String add()throws Exception{
		bookDAO dao = new bookDAOImp();
		System.out.println(mybook.getBookId());
		boolean isSuc=dao.add(mybook);
		return isSuc?SUCCESS:ERROR;
	}
	/*����Աɾ����Ʒ*/
	public String del()throws Exception{
		bookDAO dao = new bookDAOImp();
		System.out.println(mybook.getBookId());
		boolean isSuc=dao.del(mybook.getBookId());
		return isSuc?SUCCESS:ERROR;
	}
	/*ɾ�����ﳵ��Ʒ*/
	public String delByCar()throws Exception{
		bookDAO dao = new bookDAOImp();
		boolean isSuc=dao.delByCar(mybook.getBookId());
		return isSuc?SUCCESS:ERROR;
	}
	
	/*�޸���Ʒ*/
	public String update()throws Exception{
		bookDAO dao = new bookDAOImp();
//		mybook booktest = new mybook();
//		System.out.println(mybook.getBookId());
//		booktest = dao.findById(mybook.getBookId());
		boolean isSuc=dao.update(mybook);
		
		return isSuc?SUCCESS:"ERROR";
	}
	
	/*�޸���Ʒ*/
	public String to_update()throws Exception{
		return SUCCESS;
	}
	
	/*���빺�ﳵ*/
	public String addByCar()throws Exception{
		bookDAO dao = new bookDAOImp();
		boolean isSuc=dao.bookCar(mybook);
		return isSuc?SUCCESS:ERROR;
	}
}
