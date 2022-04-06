package Hotel.Modules.Users.Classes;
public abstract class User {
	
	//ATRIBUTS
	private String username;
	private String password;
	private String gmail;
	


	//CONSTRUCTOR
	public User(String username, String password, String gmail) {

		this.username = username;
		this.password = password;
		this.gmail = gmail;
	}
	
	//CONSTRUCTOR de CLAU PRIMARIA
	public User(String username) {
		this.username= username;	
	}	
	
	//GETTERS Y SETTERS
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
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}


	
	
	//TOSTRING
	public abstract String toString();
	
	
	
}//find_user


