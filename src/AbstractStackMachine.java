import java.util.List;
import java.util.Stack;

/**
 * Created by pin0y on 31.12.2017.
 */
public class AbstractStackMachine {
    private Stack<Integer> stack;

    public AbstractStackMachine() {
        stack = new Stack<Integer>();
    }

    private void add() {
        stack.push(stack.pop()+stack.pop());
    }

    private void sub() {
        stack.push(stack.pop()-stack.pop());
    }

    private void mul() {
        stack.push(stack.pop()*stack.pop());
    }

    private void div() {
        stack.push(stack.pop()/stack.pop());
    }

    private void load(int v)  {
        stack.push(v);
    }

    public int execute(String code) {
        String[] commands = code.split(";");
        System.out.println("- Abstract Stack Machine -");
        for (String command:commands) {
            if (command.startsWith("LOAD")) {
                int v = Integer.parseInt(command.substring(command.indexOf(' ')+1));
                load(v);
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
        return stack.pop();
    }

}
