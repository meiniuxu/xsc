package dao;


import model.mylogin;
import model.myreg;

public interface UserDao {
	myreg find(String username) throws Exception;
	boolean isLogin(String user) throws Exception;
	public boolean isReg(myreg user) throws Exception;

}
