package dao;

import java.util.List;

import model.mybook;

public interface bookDAO {
	List<String[]> getAllbook() throws Exception;
	List<mybook> getAllbookByObj() throws Exception;
	boolean add(mybook mybook)throws Exception;
	mybook selectType(String type)throws Exception;
	mybook selectAuthor(String author)throws Exception;
	mybook selectName(String bookname)throws Exception;
	boolean update(mybook book) throws Exception;
	boolean bookCar(mybook mybook)throws Exception;
	boolean del(int id) throws Exception;
	boolean delByCar(int id) throws Exception;
	mybook findById(int bookId) throws Exception;
}
