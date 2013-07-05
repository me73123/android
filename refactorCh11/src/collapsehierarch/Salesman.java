package collapsehierarch;

public class Salesman extends Employee {

	protected String name;
	private int rate;
	private boolean hasSpecialSkill;

	public String getName(){
		return "name= " + name;
	}
	
	public int getRate(){
		return rate * 5;
	}
	
	public boolean hasSpecialSkill(){
		return hasSpecialSkill;
	}
}
