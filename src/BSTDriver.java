public class BSTDriver { // this class will test all of BinarySearchTree's implemented algorithms
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Inserting int values
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // In-order traversal
        System.out.println("In-order traversal:");
        tree.inOrder();
        System.out.println();

        // Pre-order traversal
        System.out.println("Pre-order traversal:");
        tree.preOrder();
        System.out.println();

        // Post-order traversal
        System.out.println("Post-order traversal:");
        tree.postOrder();
        System.out.println();

        // Searching for a value
        int key = 60;
        if (tree.search(key)) {
            System.out.println(key + " is found in the tree.");
        } else {
            System.out.println(key + " is not found in the tree.");
        }

        // Deleting a value
        tree.delete(20);
        System.out.println("After deleting 20:");
        tree.inOrder();
        System.out.println();
    }
}
