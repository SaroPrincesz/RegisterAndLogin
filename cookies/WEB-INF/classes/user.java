public class user{
	private String name;
	private String email;
	private String phoneNo;
	private String gender;
	private String address;
	private String password;
	private String cookie;
	
	public user(String name, String email, String phoneNo, String gender, 
					String address, String password, String cookie){
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.address = address;
		this.password = password;
		this.cookie = cookie;
	}	
	
	public String getEmail(){
		return email;
	}
	public String getPassword(){
		return password;
	}
	public String getCookie(){
		return cookie;
	}
}