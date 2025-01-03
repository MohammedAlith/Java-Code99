package showroom;

public class Manager {
	private int id;
	private String name;
	private String pass;
	public Manager() {}
	public Manager(int id,String name,String pass) {
		this.id=id;
		this.name=name;
		this.pass=pass;
		
	}
	public void prnt() {
		System.out.println("Welcome to Login page");
	}

public int Getid() {
	return id;
}

public String Getname() {
	return name;
}


public String Getpass() {
	return pass;
}








}
