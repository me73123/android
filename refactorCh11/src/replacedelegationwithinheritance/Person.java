package replacedelegationwithinheritance;


public class Person {

	private String _name;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}
	
	public String getLastName(){
		return _name.substring(_name.lastIndexOf(' ', +1));
	}
}
