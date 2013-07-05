package extractsubclass;

public class JobItem {
	
	/*
	 * 1. 建立LaborItem類別,繼承JobItem
	 * 2. LaborItem中建立建構子(可把JobItem複製過去),用super執行父類別建構子
	 * 3. 修改對JobItem建構子呼叫(new LaborItem)
	 * 4. 新增建構式,將舊的建構式改為protected
	 * 5. 將外部呼叫改為呼叫新的建構式
	 * 6. 修改subclass建構式
	 * 7. 將JobItem的getEmployee()移至子類別,_quantity需改為protected
	 * 8. 在subclass中初始化_employee
	 * 9. 在JobItem與LaborItem類別中新建isLabor(),父類別回傳false,子類別回傳true,即可刪除_isLabor欄位
	 * 10. 將getUnitPrice修正,JobItem與LaborItem類別中回傳_unitPrice與_employee.getRate()
	 * 11. 對JobItem提煉出subclass partItem,將JobItem宣告為抽象類別
	 */

	private int _unitPrice;
	private int _quantity;
	private Employee _employee;
	private boolean _isLabor;
	
	public JobItem(int unitPrice, int quantity, boolean isLabor, Employee employee){
		_unitPrice = unitPrice;
		_quantity = quantity;
		_isLabor = isLabor;
		_employee = employee;
	}
	
//	public JobItem(int unitPrice, int quantity){
//		this(unitPrice, quantity, false, null);
//	}
	
	public int getTotalPrice(){
		return getUnitPrice() * _quantity;
	}
	
	public int getUnitPrice(){
		return (_isLabor) ? _employee.getRate() : _unitPrice;
	}
	
	public int getQuantity(){
		return _quantity;
	}
	
	public Employee getEmployee(){
		return _employee;
	}
}

//	LaborItem(int quantity, Employee employee){
//		super(0, quantity, true, employee);
//	}

//	LaborItem(int quantity, Employee employee){
//		super(0, quantity, true);
//		_employee = employee;
//	}
