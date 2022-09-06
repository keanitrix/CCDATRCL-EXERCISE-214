// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack plates_stack = new Stack(5);
  
      // Insert new elements into the stack
      plates_stack.push("Blue Plate");
      plates_stack.push("Red Plate");
      plates_stack.push("Yellow Plate");
      plates_stack.push("Green Plate");
  
      // Show the size of the stack
      System.out.println("The size of the plates stack is: " + plates_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the plates stack is: " + plates_stack.peek());
  
      // Remove top element in the stack
      plates_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      plates_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + plates_stack.peek());
    }
  }
