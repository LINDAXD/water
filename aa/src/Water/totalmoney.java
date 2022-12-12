package Water;

public class totalmoney {
	private static totalmoney singleton = new totalmoney();
	private int allmoney;
	
		
	
private totalmoney() {}
		


public static totalmoney getInstance() {
	return singleton;
	
}



public static totalmoney getSingleton() {
	return singleton;
}



public static void setSingleton(totalmoney singleton) {
	totalmoney.singleton = singleton;
}



public int getAllmoney() {
	return allmoney;
}
public void setAllmoney(int allmoney) {
	this.allmoney = allmoney;
}
}
