package com.dz.nan.tizi.command;

/**
 * 
 * @author LYES KHERBICHE
 * @UserCommand: is Spring Command Object for @User, @SaveUserValidator, @UserController and JSP
 *
 */
public class UserCommand {
	private String email;
	private String pseudo;
	private String pwd;
	
	public UserCommand(){
		super();
	}
	public UserCommand(String email, String pseudo, String pwd) {
		super();
		this.email = email;
		this.pseudo = pseudo;
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
