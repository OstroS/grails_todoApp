package todoapp

import java.util.Date;

class User {
	
	String username
	Date createDate
	
    static constraints = {
    }

	@Override
	public String toString() {
		return "User [username=" + username + ", createDate=" + createDate
				+ "]";
	}	

}
