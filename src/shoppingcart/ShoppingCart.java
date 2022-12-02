package shoppingcart;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> fruitList = new LinkedList<>();

        Console console = System.console();

        String userAction = "";

        System.out.println("Welcome to your shopping cart");

        // think about trimming and to lowercase
        // try
        while(!userAction.equals("exit")) {
            String userInput = console.readLine("Please enter an action> ");
            userInput = userInput.trim().toLowerCase();
            String[] userInputArray = userInput.split(" ");
            userAction = userInputArray[0];

            switch(userAction) {
                case "add":
                    if (userInputArray.length <= 1) {
                        System.out.println("Please specify an item.");
                    }
                    else {
                        for (int i = 1; i < userInputArray.length; i++) {
                            fruitList.add(userInputArray[i]);
                            System.out.printf("%s added to cart\n", userInputArray[i]);
                        }
                    }
                    break;
                case "list":
                    // fruitList.size() <= 0
                    if (fruitList.isEmpty()) {
                        System.out.println("Your cart is empty");
                    } else {
                        for (int i = 0; i < fruitList.size(); i++) {
                            System.out.printf("%d. %s\n", (i + 1), fruitList.get(i));
                        }
                    }
                    break;
                case "delete":
                    if (userInputArray.length <= 1) {
                        System.out.println("Please specify a valid number.");
                        break;
                    }
                    int fruitListIndex = Integer.parseInt(userInputArray[1]) - 1;
                    if (fruitListIndex < 0 || fruitListIndex >= fruitList.size()) {
                        System.out.println("Incorrect item index");
                    } else {
                        String removedFruit = fruitList.remove(fruitListIndex);
                        System.out.printf("%s removed from cart\n", removedFruit);
                    }
                    break;
                case "exit":
                    break;
                default:
                    System.err.printf("Unknown command: %s\n", userAction);
                    break;

            } 
        }

        System.out.println("Thank you for using our shopping cart.");

    }
}