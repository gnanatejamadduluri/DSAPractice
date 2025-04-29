package dbTables;

public class LoginDetails {
	private int userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private int wrongPasswordCount;
	
	public LoginDetails(int user_id, String first_name, String last_name, String email_id, String password_, int wrong_password_count) {
		this.userId=user_id;
		this.firstName=first_name;
		this.lastName=last_name;
		this.emailId=email_id;
		this.password=password_;
		this.wrongPasswordCount=wrong_password_count;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getWrongPasswordCount() {
		return wrongPasswordCount;
	}

	public void setWrongPasswordCount(int wrongPasswordCount) {
		this.wrongPasswordCount = wrongPasswordCount;
	}
	
}
