package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.mybook;

public class bookDAOImp implements bookDAO {
	String url = "jdbc:mysql://localhost:3306/mysql";
	String driver = "com.mysql.jdbc.Driver";
	String use = "root";
	String pass = "111111";

	public List<String[]> getAllbook() throws Exception {
		
		List<String[]> book = new ArrayList<>();
		Class.forName(driver);
		String sql = "select * from bookinfo";
		try (Connection con = DriverManager.getConnection(url, use, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {// ����ÿ�е�����
					String[] row=new String[8];
					row[0]=rs.getString("bookId");
					row[1]=rs.getString("bookName");
					row[2]=rs.getString("bookAuthor");
					row[3]=rs.getString("bookPress");
					row[4]=rs.getString("bookPrice");
					row[5]=rs.getString("bookNumber");
					row[6]=rs.getString("bookType");
					row[7]=rs.getString("bookRemark");
					book.add(row);
				}
			}
			return book;
		}
	}
	/* �����Ʒ */
	public List<mybook> getAllbookByObj() throws Exception {
		List<mybook> book = new ArrayList<>();
		Class.forName(driver);
		String sql = "select * from bookinfo";
		try (Connection con = DriverManager.getConnection(url, use, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {// ����ÿ�е�����
					mybook mybook = new mybook();
					mybook.setBookId(rs.getInt("bookId"));
					mybook.setBookName(rs.getString("bookName"));
					mybook.setBookAuthor(rs.getString("bookAuthor"));
					
					mybook.setBookPress(rs.getString("bookPress"));
					
					mybook.setBookPrice(rs.getDouble("bookPrice"));
					mybook.setBookNumber(rs.getInt("bookNumber"));
					mybook.setBookType(rs.getString("bookType"));
					mybook.setBookRemark(rs.getString("bookRemark"));
					book.add(mybook);
				}
				return book;
			}

		}
	}
	/*�����Ʒ*/
	public boolean add(mybook mybook)throws Exception{
		boolean b=false;
		Class.forName(driver);
		String sql = "insert into bookinfo values(?,?,?,?,?,?,?,?)";
		try (Connection con = DriverManager.getConnection(url, use, pass);
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setInt(1, mybook.getBookId());
			ps.setString(2, mybook.getBookName());
			ps.setString(3, mybook.getBookAuthor());
			ps.setString(4, mybook.getBookPress());
			ps.setDouble(5, mybook.getBookPrice());
			ps.setInt(6, mybook.getBookNumber());
			ps.setString(7, mybook.getBookType());
			ps.setString(8, mybook.getBookRemark());
			System.out.println(ps);
			int i=ps.executeUpdate();
			if(i>0)
				b=true;
		}
		return b;
	}
	/*������ѯ*/
	public mybook selectType(String type)throws Exception{
		mybook mybook=new mybook();
		Class.forName(driver);
		String sql = "select *from bookInfo where type=?";
		try (Connection con = DriverManager.getConnection(url, use, pass);
				PreparedStatement ps = con.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {// ����ÿ�е�����
				mybook.setBookId(rs.getInt("bookId"));
				mybook.setBookName(rs.getString("bookName"));
				mybook.setBookAuthor(rs.getString("bookAuthor"));
				
				mybook.setBookPress(rs.getString("bookPress"));
				
				mybook.setBookPrice(rs.getDouble("bookPrice"));
				mybook.setBookNumber(rs.getInt("bookNumber"));
				mybook.setBookType(rs.getString("bookType"));
				mybook.setBookRemark(rs.getString("bookRemark"));
				
		}
	}
	return mybook;
	}
	/*�����߲�ѯ*/
	public mybook selectAuthor(String author)throws Exception{
		mybook mybook=new mybook();
		Class.forName(driver);
		String sql = "select *from bookInfo where author=?";
		try (Connection con = DriverManager.getConnection(url, use, pass);
				PreparedStatement ps = con.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {// ����ÿ�е�����
				mybook.setBookId(rs.getInt("bookId"));
				mybook.setBookName(rs.getString("bookName"));
				mybook.setBookAuthor(rs.getString("bookAuthor"));
				
				mybook.setBookPress(rs.getString("bookPress"));
				
				mybook.setBookPrice(rs.getDouble("bookPrice"));
				mybook.setBookNumber(rs.getInt("bookNumber"));
				mybook.setBookType(rs.getString("bookType"));
				mybook.setBookRemark(rs.getString("bookRemark"));
				
		}
	}
	return mybook;
	}
	/*���Ʋ�ѯ��Ʒ*/
	public mybook selectName(String bookname)throws Exception{
		mybook mybook=new mybook();
		Class.forName(driver);
		String searchName="";
		String sql = "select *from bookInfo where bookname LIKE '%"+searchName+"%'";
		try (Connection con = DriverManager.getConnection(url, use, pass);
				PreparedStatement ps = con.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {// ����ÿ�е�����
				mybook.setBookId(rs.getInt("bookId"));
				mybook.setBookName(rs.getString("bookName"));
				mybook.setBookAuthor(rs.getString("bookAuthor"));
				
				mybook.setBookPress(rs.getString("bookPress"));
				
				mybook.setBookPrice(rs.getDouble("bookPrice"));
				mybook.setBookNumber(rs.getInt("bookNumber"));
				mybook.setBookType(rs.getString("bookType"));
				mybook.setBookRemark(rs.getString("bookRemark"));
				
		}
	}
	return mybook;
	}
	/*�޸�ͼ����Ϣ*/
	public boolean update(mybook book) throws Exception {
	    boolean isSuc=false;
	    Class.forName(driver);
	    String sql = "update bookinfo set bookName=?,bookAuthor=?,bookPress=?,bookPrice=?,bookNumber=?,bookType=?,bookRemark=? where bookId=?";
	    try (Connection con = DriverManager.getConnection(url, use, pass);
	        PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, book.getBookName());
			ps.setString(2, book.getBookAuthor());
			ps.setString(3, book.getBookPress());
			ps.setDouble(4, book.getBookPrice());
			ps.setInt(5, book.getBookNumber());
			ps.setString(6, book.getBookType());
			ps.setString(7, book.getBookRemark());
			ps.setInt(8, book.getBookId());
			System.out.println(ps);
			int row=ps.executeUpdate();
		      isSuc=row>0;
		    }
		    return isSuc;
	  }
	/*���빺�ﳵ*/
	public boolean bookCar(mybook mybook)throws Exception{
		boolean c=false;
		Class.forName(driver);
		String sql = "insert into shopcar vlaues(?,?,?,?)";
		try (Connection con = DriverManager.getConnection(url, use, pass);
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setInt(1, mybook.getBookId());
			ps.setString(2, mybook.getBookName());
			ps.setString(3, mybook.getBookAuthor());
			ps.setDouble(4, mybook.getBookPrice());
			int i=ps.executeUpdate();
			if(i>0)
				c=true;
		}
		return c;
	}
	/*����Աɾ����Ʒ*/
	public boolean del(int bookId) throws Exception {
	    boolean isSuc=false;
	    Class.forName(driver);
	    String sql = "delete from bookinfo where bookId=?";
	    try (Connection con = DriverManager.getConnection(url, use, pass);
	        PreparedStatement pstmt = con.prepareStatement(sql);) {
	      pstmt.setInt(1,bookId);
	      int row=pstmt.executeUpdate();
	      isSuc=row>0;
	    }
	    return isSuc;
	  }
	/*���ﳵɾ����Ʒ*/
	public boolean delByCar(int id) throws Exception {
	    boolean isSuc=false;
	    Class.forName(driver);
	    String sql = "delete from bookCar where id=?";
	    try (Connection con = DriverManager.getConnection(url, use, pass);
	        PreparedStatement pstmt = con.prepareStatement(sql);) {
	      pstmt.setInt(1,id);
	      int row=pstmt.executeUpdate();
	      isSuc=row>0;
	    }
	    return isSuc;
	  }
	public mybook findById(int bookId) throws Exception {
	    mybook mybook=new mybook();
	    Class.forName(driver);
	    String sql = "select * from bookinfo where bookId=?";
	    
	    try (Connection con = DriverManager.getConnection(url, use, pass);
				PreparedStatement ps = con.prepareStatement(sql);) {
	    	ps.setInt(1,bookId);
	    	ResultSet rs = ps.executeQuery();
			rs.next();
				mybook.setBookId(rs.getInt("bookId"));
				mybook.setBookName(rs.getString("bookName"));
				mybook.setBookAuthor(rs.getString("bookAuthor"));
				mybook.setBookPress(rs.getString("bookPress"));
				mybook.setBookPrice(rs.getDouble("bookPrice"));
				mybook.setBookNumber(rs.getInt("bookNumber"));
				mybook.setBookType(rs.getString("bookType"));
				mybook.setBookRemark(rs.getString("bookRemark"));
				
		}
	return mybook;
	}
}