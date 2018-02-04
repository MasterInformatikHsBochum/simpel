import java.util.Stack;

/**
 * This is the StackMachine for the simpel Language
 */
public class AbstractStackMachine {
    private Stack<Object> stack;

    public AbstractStackMachine() {
        stack = new Stack<Object>();
    }

    private void add() {
        Object stack1 = stack.pop();
        Object stack2 = stack.pop();
        if(stack1 instanceof Integer) {
            if (stack2 instanceof Integer) {
                stack.push((int) stack1 + (int) stack2);
            } else if (stack2 instanceof Double) {
                stack.push((int)stack1 + (double) stack2);
            }
        } else  if(stack1 instanceof Double) {
            if (stack2 instanceof Integer) {
                stack.push((int) stack1 + (int) stack2);
            } else if (stack2 instanceof Double) {
                stack.push((double) stack1 + (double) stack2);
            }
        } else {
            throw new RuntimeException("RuntimeException: NaN");
        }
    }

    private void sub() {
        Object stack1 = stack.pop();
        Object stack2 = stack.pop();
        if(stack1 instanceof Integer) {
            if (stack2 instanceof Integer) {
                stack.push((int) stack1 - (int) stack2);
            } else if (stack2 instanceof Double) {
                stack.push((int)stack1 - (double) stack2);
            }
        } else  if(stack1 instanceof Double) {
            if (stack2 instanceof Integer) {
                stack.push((int) stack1 - (int) stack2);
            } else if (stack2 instanceof Double) {
                stack.push((double) stack1 - (double) stack2);
            }
        } else {
            throw new RuntimeException("RuntimeException: NaN");
        }
    }

    private void mul() {
        Object stack1 = stack.pop();
        Object stack2 = stack.pop();
        if(stack1 instanceof Integer) {
            if (stack2 instanceof Integer) {
                stack.push((int) stack1 * (int) stack2);
            } else if (stack2 instanceof Double) {
                stack.push((int)stack1 * (double) stack2);
            }
        } else  if(stack1 instanceof Double) {
            if (stack2 instanceof Integer) {
                stack.push((int) stack1 * (int) stack2);
            } else if (stack2 instanceof Double) {
                stack.push((double) stack1 * (double) stack2);
            }
        } else {
            throw new RuntimeException("RuntimeException: NaN");
        }
    }

    private void div() {
        Object stack1 = stack.pop();
        Object stack2 = stack.pop();
        if(stack1 instanceof Integer) {
            if (stack2 instanceof Integer) {
                stack.push((int) stack1 / (int) stack2);
            } else if (stack2 instanceof Double) {
                stack.push((int)stack1 / (double) stack2);
            }
        } else  if(stack1 instanceof Double) {
            if (stack2 instanceof Integer) {
                stack.push((int) stack1 / (int) stack2);
            } else if (stack2 instanceof Double) {
                stack.push((double) stack1 / (double) stack2);
            }
        } else {
            throw new RuntimeException("RuntimeException: NaN");
        }
    }

    private void load(Object v)  {
        stack.push(v);
    }

    public void execute(String code) {
        String[] commands = code.split(";");
        System.out.println("- Abstract Stack Machine -");
        for (String command:commands) {
            if (command.startsWith("LOADN")) {
                int v = Integer.parseInt(command.substring(command.indexOf(' ')+1));
                load(v);
            } else if (command.startsWith("LOADD")) {
                double v = Double.parseDouble(command.substring(command.indexOf(' ') + 1));
                load(v);
            } else if (command.equals("LOADS")) {
                load(command.substring(command.indexOf(' ') + 1));
            } else if (command.equals("ADD")) {
                add();
            } else if (command.equals("SUB")) {
                sub();
            } else if (command.equals("MUL")) {
                mul();
            } else if (command.equals("DIV")) {
                div();
            }
            System.out.println(command + " : " +stack.toString());
        }
    }

}
