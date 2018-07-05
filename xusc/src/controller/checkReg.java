package controller;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAOImp;
import dao.UserDao;
import model.myreg;
public class checkReg extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	myreg user = new myreg();
	public myreg getUser() {
		return user;
	}
	public void setUser(myreg user) {
		this.user = user;
	}
//	@Override 
//	public void validate(){
//		
//		if(user.getUsername().isEmpty()){
//			addFieldError("username","用户名不能为空");			
//		}
//		if(user.getPwd1().isEmpty()){
//			addFieldError("pwd","密码不能为空");
//		}
//		if(user.getPwd1().equals(user.getPwd2())){
//			addFieldError("pwd2","密码不一样");
//		}
//		if(user.getRelname().isEmpty()){
//			addFieldError("Relname","姓名不能为空");
//		}
//		if(user.getAddress().isEmpty()){
//			addFieldError("address","地址不能为空");			
//		}
//		if(user.getPhone().isEmpty()){
//			addFieldError("phone","手机号码不能为空");
//		}
//	}
	public String execute() throws Exception{
		UserDao dao=new UserDAOImp();
		boolean isSuc = dao.isReg(user);
		return isSuc?SUCCESS:ERROR;
	}

}
