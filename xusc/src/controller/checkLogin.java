package controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAOImp;
import dao.UserDao;
import model.mylogin;

public class checkLogin extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String pwd;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override public String execute() throws Exception{
		UserDao dao=new UserDAOImp();
		//boolean isHave=dao.isLogin(username,pwd);
		boolean isHave=dao.isLogin(username);
		if(isHave){
			   Map session=ActionContext.getContext().getSession();
			   session.put("username", username);
			   //session.put("pwd", pwd);
			   return "success";//�Զ���ָ���ҳ��
			 }else
				 return "fail";
	}
	/*
	mylogin log;
	UserDao ud=new UserDAOImp();
	
	
	public mylogin getLog() {
		return log;
	}
	public void setLog(mylogin log) {
		this.log = log;
	}
	@Override public void validate(){
		if(this.log.getUsername().isEmpty()){
			addFieldError("log.username","û�������û���");			
		}
		if(log.getPwd().isEmpty()){
			addFieldError("log.pwd","û����������");
		}		
	}
	@Override public String execute() throws Exception{
		UserDao dao=new UserDAOImp();
		boolean isHave=dao.isLogin(log.getUsername());
		if(isHave){
			   Map session=ActionContext.getContext().getSession();
			   session.put("username", log.getUsername());
			   return "success";//�Զ���ָ���ҳ��
			 }else
				 return "fail";
	}*/
}
