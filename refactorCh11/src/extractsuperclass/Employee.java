package extractsuperclass;

public class Employee{

	private String _name;
	private String _id;
	private int _annualCost;
	
	public Employee(String name, String id, int annualCost) {
		super();
		this._name = name;
		this._id = id;
		this._annualCost = annualCost;
	}
	
	public int getAnnualCost(){
		return _annualCost;
	}

	public String getName() {
		return _name;
	}

	public String getId() {
		return _id;
	}
}
