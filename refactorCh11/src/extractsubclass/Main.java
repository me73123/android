package extractsubclass;

public class Main {
	
	Employee kent = new Employee(2);
	JobItem j1 = new JobItem(0, 5, true, kent);  //呼叫舊的建構式
	
//	JobItem j2 = new JobItem(10, 15);  //呼叫新的建構式
}
