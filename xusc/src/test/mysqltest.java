package test;

import java.sql.*;

public class mysqltest {
	  public static void main(String[]args)
	  {
		  mysqltest getConn=new mysqltest();
		  getConn.getConnection();
	  }
		public Connection getConnection()
		{
			Connection conn=null;
			try
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
				}
				catch (ClassNotFoundException ex)
				{
					System.out.println("加载驱动程序有错误");
				}
 
				String url = "jdbc:mysql://localhost:3306/mysql?user=root&password=111111";
				conn = DriverManager.getConnection(url);
				System.out.println("成功连接数据库！！");
 
			}
			catch (SQLException ex1)
			{
				System.out.print("取得连接的时候有错误，请核对用户名和密码");
			}
			return conn;
		}
}
