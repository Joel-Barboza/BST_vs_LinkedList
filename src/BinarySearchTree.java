class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    public TreeNode(int item){
        this.value = item;
        this.left = null;
        this.right = null;
    }
}
public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int value){
        this.root = insertRecursive(this.root, value);
    }

    private TreeNode insertRecursive(TreeNode root, int value){
        if (root == null){
            root = new TreeNode(value);
            return root;
        }

        if (value < root.value){
            root.left = insertRecursive(root.left, value);
        } else if (value > root.value) {
            root.right = insertRecursive(root.right, value);
        }

        return root;
    }

    public boolean search(int key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(TreeNode root, int key) {
        if (root == null || root.value == key)
            return root != null;

        if (root.value < key)
            return searchRecursive(root.right, key);

        return searchRecursive(root.left, key);
    }


}
