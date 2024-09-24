package week6.Day1Assignment;

public class AxisBank extends BankInfo {
	
	 public void deposit() {
	        System.out.println("Deposit in BankInfo");
	    }

	    public static void main(String[] args) {
	        AxisBank axis = new AxisBank();
	        axis.deposit(); 
	        axis.saving();
	        axis.fixed();
	    }
	}

