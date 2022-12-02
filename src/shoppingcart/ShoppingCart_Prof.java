package shoppingcart;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart_Prof {
    public static void main(String[] args) {
        List<String> fruitList = new LinkedList<>();

        Console console = System.console();

        Boolean stop = false;

        System.out.println("Welcome to your shopping cart");

        // think about trimming and to lowercase
        // try
        while(!stop) {
            String userInput = console.readLine("Please enter an action> ");
            userInput = userInput.trim().toLowerCase();
            String[] userInputArray = userInput.split(" ");
            String userAction = userInputArray[0];

            switch(userAction) {
                case "add":
                    fruitList.add(userInputArray[1]);
                    System.out.printf("%s added to cart\n", userInputArray[1]);
                    break;
                case "list":
                    System.out.println("The contents of your cart:");
                    if (fruitList.size() <= 0) {
                        System.out.println("Your cart is empty");
                    } else {
                        for (int i = 0; i < fruitList.size(); i++) {
                            System.out.printf("%d. %s\n", (i + 1), fruitList.get(i));
                        }
                    }
                    break;


            }

            
        }

        

    }
}
