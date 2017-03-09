package moscow.coliseum.models.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

// tag::code[]
@Data
@Entity
public class Person {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String nickName;

	private Person() {}

	public Person(String firstName, String lastName, String nickName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
	}
}
// end::code[]