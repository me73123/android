package extractsuperclass;

import java.util.Enumeration;
import java.util.Vector;

public class Department{
	/*
	 * 1. 建立父類別Party
	 * 2. 將_name一至Party
	 * 3. 將get_name()反白,refactor pull up
	 * 4. 在Party中建立建構子,修改子類別建構子
	 * 5. 將getAnnualCost()與 getTotalAnnualCost()變更相同名稱
	 * 6. 在Party中建立getAnnualCost()的抽象函式
	 * 7. 將Department的getAnnualCost()中Employee改為取Party
	 */

	private String _name;
	private Vector _staff = new Vector();
	
	public Department(String name) {
		super();
		this._name = name;
	}
	
	public int getTotalAnnualCost(){
		Enumeration e = getStaff();
		int result = 0;
		while(e.hasMoreElements()){
			Employee each = (Employee) e.nextElement();
			result += each.getAnnualCost();
		}
		return result;
	}
	
	public int getHeadCount(){
		return _staff.size();
	}
	
	public Enumeration getStaff(){
		return _staff.elements();
	}
	
	public void addStaff(Employee arg){
		_staff.addElement(arg);
	}
	
	public String get_name() {
		return _name;
	}
}
