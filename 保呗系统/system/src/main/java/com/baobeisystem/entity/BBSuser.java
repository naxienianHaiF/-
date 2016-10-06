package com.baobeisystem.entity;
/**
 * bbs的用户表对应的实体类
 * @author WJH
 *
 */
public class BBSuser {
	
	private int id;   //id
	private String username;  //用户名
	private String password;  //密码
	private String nickname;  //昵称
	private String signature; //个性签名
	private String phonenumber; //手机号码
	private String email;  //email
	private byte age;  //年龄
	private String job; //职业
	private String address;  //地址
	
	public BBSuser(){
		
	}

	
	public BBSuser(int id, String username, String password, String nickname,
			String signature, String phonenumber, String email, byte age,
			String job, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.signature = signature;
		this.phonenumber = phonenumber;
		this.email = email;
		this.age = age;
		this.job = job;
		this.address = address;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "BBSuser [id=" + id + ", username=" + username + ", password="
				+ password + ", nickname=" + nickname + ", signature="
				+ signature + ", phonenumber=" + phonenumber + ", email="
				+ email + ", age=" + age + ", job=" + job + ", address="
				+ address + "]";
	}
	
	
	
	
}
