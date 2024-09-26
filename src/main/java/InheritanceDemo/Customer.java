package InheritanceDemo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("customer_type")
public class Customer extends UserLogin{

	public Customer(int userID, String userName, String userPassword) {
		super(userID, userName, userPassword);
		// TODO Auto-generated constructor stub
	}

}
