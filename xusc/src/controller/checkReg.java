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
//			addFieldError("username","�û�������Ϊ��");			
//		}
//		if(user.getPwd1().isEmpty()){
//			addFieldError("pwd","���벻��Ϊ��");
//		}
//		if(user.getPwd1().equals(user.getPwd2())){
//			addFieldError("pwd2","���벻һ��");
//		}
//		if(user.getRelname().isEmpty()){
//			addFieldError("Relname","��������Ϊ��");
//		}
//		if(user.getAddress().isEmpty()){
//			addFieldError("address","��ַ����Ϊ��");			
//		}
//		if(user.getPhone().isEmpty()){
//			addFieldError("phone","�ֻ����벻��Ϊ��");
//		}
//	}
	public String execute() throws Exception{
		UserDao dao=new UserDAOImp();
		boolean isSuc = dao.isReg(user);
		return isSuc?SUCCESS:ERROR;
	}

}
