package pers.java.carAdmin;

public class ElectricVehicle extends NonMotor {
	private String cellName;
	public ElectricVehicle() {
		
	}
	public ElectricVehicle(String cellName) {
			this.setCellName(cellName);
	}
	public String getCellName() {
		return cellName;
	}

	public void setCellName(String cellName) {
		this.cellName = cellName;
	}
	public String work() {
		String str = "这是一辆使用"+this.getCellName()+"牌电池的电动车";
		return str;
	}
	
}
