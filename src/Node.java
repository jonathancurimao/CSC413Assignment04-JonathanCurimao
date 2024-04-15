public class Node { // this class will represent a node in the BST tree
    int key;
    Node left, right;

    Node (int item) { // this will be a constructor for creating a new node, with item representing the value of the node
        key = item;
        left = right = null;
    }
}
