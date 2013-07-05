package pullupconstructorbody;


public class Manager extends Employee {
	
	private int _grade;
	
	public Manager(String name, String id, int grade){
		_name = name;
		_id = id;
		_grade = grade;
		if(isPriviliged()){
			assignCar();
		}
	}
	
	private boolean isPriviliged(){
		return _grade > 4;
	}
}
