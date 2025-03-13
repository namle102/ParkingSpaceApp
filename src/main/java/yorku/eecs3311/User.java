package yorku.eecs3311;

public abstract class User {
	private String email;
	private String pwd;
	private String id;
	private double rate;
	
	/*
	 * Overloaded constructors
	 */
	public User(String email, String pwd, String id) {
		this.email = email;
		this.pwd = pwd;
		this.id = id;
	}
	
	public User(String email, String pwd) {
		this(email, pwd, null);
	}

	// Getters
	public String getEmail() { return email; }
	public String getPwd() { return pwd; }
	public String getId() { return id; }
	public double getRate() { return rate; }
	public void setRate(double rate) { this.rate = rate; }

	@Override
	public String toString() {
		return "User [email=" + email + ", pwd=" + pwd + ", id=" + id + ", rate=" + rate + "]";
	}
}
