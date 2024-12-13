import java.util.Scanner;
import javafoundations.LinkedBinaryTree;

public class TreeDriver {
    public static void main(String[] args) {
        // Leaf nodes / final decisions
        LinkedBinaryTree<String> leaf1 = new LinkedBinaryTree<String>("coffee");
        LinkedBinaryTree<String> leaf2 = new LinkedBinaryTree<String>("tea");
        LinkedBinaryTree<String> leaf3 = new LinkedBinaryTree<String>("juice");
        LinkedBinaryTree<String> leaf4 = new LinkedBinaryTree<String>("water");
        
        LinkedBinaryTree<String> tree1 = new LinkedBinaryTree<String>("Do you like caffeine?", leaf1, leaf2);
        LinkedBinaryTree<String> tree2 = new LinkedBinaryTree<String>("Do you like fruit?", leaf3, leaf4);
        
        LinkedBinaryTree<String> root = new LinkedBinaryTree<String>("Do you like hot drinks?", tree1, tree2);
        

        promptUser(root);
    }

    public static void promptUser(LinkedBinaryTree<String> currentTree) {
        Scanner scanner = new Scanner(System.in);
        
        // Base case: If the tree is empty, print an error
        if (currentTree == null || currentTree.getRootElement() == null) {
            System.out.println("Error: Empty tree.");
            return;
        }

        if (currentTree.height() == 0) {
            System.out.println("I recommend " + currentTree.getRootElement() + ".");
            return;  // End the recursion when a leaf is reached
        }

        // Otherwise, prompt the user with a question at the current node
        System.out.println(currentTree.getRootElement());  // Print current question
        System.out.print("Enter 'yes' or 'no': ");
        String answer = scanner.nextLine().trim().toLowerCase();

        // Traverse based on the user's answer
        if (answer.equalsIgnoreCase("yes")) {
            if (currentTree.getLeft() != null) {
                promptUser(currentTree.getLeft());
            } else {
                System.out.println("Invalid answer, moving to default subtree.");
            }
        } else if (answer.equals("no")) {
            if (currentTree.getRight() != null) {
                promptUser(currentTree.getRight());
            } else {
                System.out.println("Invalid answer, moving to default subtree.");
            }
        } else {
            System.out.println("Invalid input. Please answer with 'yes' or 'no'.");
            promptUser(currentTree);  // Recur for invalid input
        }
    }
}
