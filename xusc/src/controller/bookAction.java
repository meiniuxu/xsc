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
	/*浏览商品*/
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
	/*添加商品*/
	public String add()throws Exception{
		bookDAO dao = new bookDAOImp();
		System.out.println(mybook.getBookId());
		boolean isSuc=dao.add(mybook);
		return isSuc?SUCCESS:ERROR;
	}
	/*管理员删除商品*/
	public String del()throws Exception{
		bookDAO dao = new bookDAOImp();
		System.out.println(mybook.getBookId());
		boolean isSuc=dao.del(mybook.getBookId());
		return isSuc?SUCCESS:ERROR;
	}
	/*删除购物车商品*/
	public String delByCar()throws Exception{
		bookDAO dao = new bookDAOImp();
		boolean isSuc=dao.delByCar(mybook.getBookId());
		return isSuc?SUCCESS:ERROR;
	}
	
	/*修改商品*/
	public String update()throws Exception{
		bookDAO dao = new bookDAOImp();
//		mybook booktest = new mybook();
//		System.out.println(mybook.getBookId());
//		booktest = dao.findById(mybook.getBookId());
		boolean isSuc=dao.update(mybook);
		
		return isSuc?SUCCESS:"ERROR";
	}
	
	/*修改商品*/
	public String to_update()throws Exception{
		return SUCCESS;
	}
	
	/*加入购物车*/
	public String addByCar()throws Exception{
		bookDAO dao = new bookDAOImp();
		boolean isSuc=dao.bookCar(mybook);
		return isSuc?SUCCESS:ERROR;
	}
}
