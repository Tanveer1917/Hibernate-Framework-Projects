package InheritanceDemo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type",discriminatorType = DiscriminatorType.STRING)

public class UserLogin {
	@Id
	private int  userID;
	private String userName;
	private String userPassword;
	
	
	public UserLogin(int userID, String userName, String userPassword) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserLogin [userID=" + userID + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
	
}
