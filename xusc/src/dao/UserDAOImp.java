package dao;
import java.sql.*;
import model.mylogin;
import model.myreg;
public class UserDAOImp implements UserDao{
	String url = "jdbc:mysql://localhost:3306/mysql";
	String driver = "com.mysql.jdbc.Driver";
	String use = "root";
	String pass = "111111";
	/*注册*/
	 public boolean isReg(myreg user) throws Exception {
		    boolean isUser=false;
		    Class.forName(driver);
		    String sql = "insert into userinfo(username,relname,address,phone) values(?,?,?,?)";
		    try (Connection con = DriverManager.getConnection(url,use,pass);
		        PreparedStatement pstmt = con.prepareStatement(sql);) {
		      pstmt.setString(1,user.getUsername());
		      pstmt.setString(2,user.getRelname());
		      pstmt.setString(3,user.getAddress());
		      pstmt.setString(4, user.getPhone());       
//		      System.out.println(pstmt);
		      int row=pstmt.executeUpdate();
		      isUser=row>0;
		    }
		    String sql1 = "insert into userpwd(username,pwd) values(?,?)";
		    try (Connection con = DriverManager.getConnection(url,use,pass);
			        PreparedStatement pstmt = con.prepareStatement(sql1);) {
			      pstmt.setString(1,user.getUsername());
			      pstmt.setString(2,user.getPwd1());
			      System.out.println(pstmt);
			      int row=pstmt.executeUpdate();
//			      isUser=row>0;
			    }
		    return isUser;
		  }
	 /*通过账号显示用户信息*/
	 public myreg find(String username) throws Exception {
		 myreg loguser=new myreg();
		    Class.forName(driver);
		    String sql = "select * from userInfo where username=?";
		    try (Connection con = DriverManager.getConnection(url, use, pass);
		        PreparedStatement pstmt = con.prepareStatement(sql);) {
		      pstmt.setString(1,username);
		      try (ResultSet rs = pstmt.executeQuery();) {
		        rs.next();
		        loguser.setUsername(rs.getString("username"));
		        loguser.setRelname(rs.getString("relname"));
		        loguser.setAddress(rs.getString("address"));
		        loguser.setPhone(rs.getString("phone"));
		      }
		    }
		    return loguser;
		  }
	 /*登录*/
	/* public boolean isLogin(mylogin user,mylogin pwd) throws Exception {
		    boolean isUser=false;
		    Class.forName(driver);
		    String sql = "select * from userpwd where user =? and pwd=?";
		    try (Connection con = DriverManager.getConnection(url,use,pass);
		        PreparedStatement pstmt = con.prepareStatement(sql);) {
		      pstmt.setString(1,user.getUsername());
		      pstmt.setString(2,user.getPwd());
		      ResultSet rs=pstmt.executeQuery();    
		      if(rs.next()){
		    	  isUser=true;
		      }
		    }
		    //close(rs,pstmt);
		    return isUser;
		  }*/
	public boolean isLogin(String username) throws Exception {
		// TODO Auto-generated method stub
		boolean isUser=false;
	    Class.forName(driver);
	    String sql = "select * from userpwd where username =?";
	    try (Connection con = DriverManager.getConnection(url,use,pass);
	        PreparedStatement pstmt = con.prepareStatement(sql);) {
	      pstmt.setString(1,username);
	     // pstmt.setString(1,pwd);
	      ResultSet rs=pstmt.executeQuery();    
	      if(rs.next()){
	    	  isUser=true;
	      }
	    }
	    //close(rs,pstmt);
	    return isUser;
	}
	
}
