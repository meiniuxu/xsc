package controller;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAOImp;
import dao.UserDao;
import model.myreg;

public class userAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	myreg user;

	public myreg getUser() {
		return user;
	}

	public void setUser(myreg user) {
		this.user = user;
	}
	/*�鿴������Ϣ*/
	public String execute() throws Exception {
		UserDao dao=new UserDAOImp();
		user=dao.find("username");
		return SUCCESS;

	}
	/*ע��*/
	public String reg()throws Exception{
		UserDao dao=new UserDAOImp();
		boolean isSuc=dao.isReg(user);
		return isSuc?SUCCESS:ERROR;
	}
}
