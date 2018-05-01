package cg.hsbc.beans;

public class Admin extends Employee {
	
	private String barnch;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String name, String email, int salary, String barnch) {
		super(id, name, email, salary);
		this.barnch = barnch;
	}

	public String getBarnch() {
		return barnch;
	}

	public void setBarnch(String barnch) {
		this.barnch = barnch;
	}
	
	
	
}
