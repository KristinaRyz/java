//package qa10_less20_skype;

public class User {
String login;
String password;
@Override
public String toString() {
	return "User [login=" + login + ", password=" + password + "]";
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User(String login, String password) {
	super();
	this.login = login;
	this.password = password;
}


}