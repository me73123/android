package extractinterface;

public class Employee{
	/*
	 * 1. 建立Billable介面,宣告getRate()與hasSpecialSkill()函式
	 * 2. 將TimeSheet的charge()中Employee改為介面
	 */
	private String name;
	private int rate;
	private boolean hasSpecialSkill;
	
	public int getRate(){
		return rate;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean hasSpecialSkill(){
		return hasSpecialSkill;
	}
	
}
