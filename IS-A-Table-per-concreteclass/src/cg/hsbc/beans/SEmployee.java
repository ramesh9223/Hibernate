package cg.hsbc.beans;

public class SEmployee extends Employee {
	private String tool;

	public SEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SEmployee(int id, String name, String email, int salary, String tool) {
		super(id, name, email, salary);
		this.tool = tool;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	
	

	
	

	
	
}
