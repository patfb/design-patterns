package behavioral.memento;

import java.util.Stack;

//caretaker
public class Caretaker {

	//you can also use an arraylist instead of a stack
	private Stack<EmployeeMemento> employeeHistory = new Stack<>();

	public void save(Employee emp) {
		employeeHistory.push(emp.save());
	}

	public void revert(Employee emp) {
		emp.revert(employeeHistory.pop());
	}

}
