package basicRevision;

public class Three extends Two {
	int totsalary;

	public void totalSalary() {
		totsalary = getBasicpay() + getHRA() - getPF() - getDeduction() + getBonus();
		System.out.println("Total salary by hand : "+totsalary);
	}

	public void salarySlip() {
		System.out.println("SALARY SLIP OF THE EMPLOYEE:-");
		System.out.println("Basic Pay: "+getBasicpay());
		System.out.println("Deduction: "+getDeduction());
		System.out.println("HRA: "+getHRA());
		System.out.println("PF: "+getPF());
		System.out.println("Bonus: "+getBonus());
		totalSalary();
		//System.out.println("Total Salary by Hand: "+totSalary);
		
	}

	public static void main(String[] args) {
		Three t = new Three();
		t.setBasicpay(10000);
		t.setBonus(1000);
		t.setDeduction(500);
		t.setHRA(1500);
		t.setPF(700);
		t.salarySlip();
	}
}
