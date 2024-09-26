package InheritanceDemo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin_type")
public class Admin extends UserLogin{

	public Admin(int userID, String userName, String userPassword) {
		super(userID, userName, userPassword);
		
	}

}
