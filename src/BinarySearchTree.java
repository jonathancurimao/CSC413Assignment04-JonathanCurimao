public class BinarySearchTree { // this class will implement the various operations in the BST tree
    Node root;

    BinarySearchTree() { // this constructor is used for creating an empty BST tree
        root = null;
    }

    public void insert (int key) { // this method will insert a new node with the given key into the tree
        root = insertRecursive(root, key);
    }

    public Node insertRecursive (Node root, int key) { // this is a recursive method that inserts a new node with the given key
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecursive(root.right, key);

        }
        return root;
    }

    public void delete (int key) {
        root = deleteRecursive(root, key);
    }

    public Node deleteRecursive(Node root, int key) { // this recursive method deletes the node with the given key
    if (root == null) {
        return root;
    }
    if (key < root.key) {
        root.left = deleteRecursive(root.left, key);
    } else if (key > root.key) {
        root.right = deleteRecursive(root.right,key);
    } else {
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }
        root.key = minValue(root.right);
        root.right = deleteRecursive(root.right, root.key);
    }
    return root;
    }

    public int minValue(Node root) { // this finds the minimum value in the given tree
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

    public boolean search(int key) { // this method searches for a node with the given key in the tree
        return searchRecursive(root, key);
    }

    public boolean searchRecursive(Node root, int key) { // recursive node search method
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }
        return key < root.key ? searchRecursive(root.left, key) : searchRecursive(root.right, key);
    }

    public void inOrder() { // this will perform the in-order traversal of the BST tree
        inOrderRecursive(root);
    }

    public void inOrderRecursive(Node root) { // A recursive method for in-order traversal
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.key + " ");
            inOrderRecursive(root.right);
        }
    }
    public void preOrder() { // pre-order traversal
        preOrderRecursive(root);
    }

    public void preOrderRecursive(Node root) { // the recursive method for preOrder
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }
    public void postOrder() { // this performs a post-order traversal of the tree
        postOrderRecursive(root);
    }

    public void postOrderRecursive(Node root) {
        if (root != null) {
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.key + " ");
        }
    }
}
