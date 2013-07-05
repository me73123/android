package replacedelegationwithinheritance;

public class Employee extends Person{
	/*
	 * 1. 將Employee繼承Person
	 * 2. 去除_person
	 * 3. 去除getName(),setName()
	 * 
	 */
	Person _person = new Person();
	
	public String getName() {
		return _person.getName();
	}
	
	public void setName(String name){
		_person.setName(name);
	}
	
	public String toString(){
		return "Emp: " + _person.getLastName();
	}
}
