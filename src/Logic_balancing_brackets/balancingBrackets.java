package Logic_balancing_brackets;

import java.util.Stack;

public  class balancingBrackets (char arr[], int size) {
	
	Stack<Character> stack= new Stack<Character>();
	
	for (int i=0; i<size; i++) {
		if (arr[i]=='('||arr[i]=='{'|| arr[i]=='[') {
			stack.push(arr[i]);
		}
		else if{
			(stack.isEmpty()){
				//return false;/
				System.out.println("Stack is Empty");
				
			}
		}
	}
	char check;
	for (int i=0;i<size;i++) {
		switch(arr[i]) {
		case ')':
			check=stack.pop();
			if (check!='(')
				return false;
			break;
		
		
	case '}':
		check=stack.pop();
		if (check!='{')
			return false;
		break;
		
	case ']':
		check=stack.pop();
		if (check!='[')
			return false;
		break;
	}
	}


