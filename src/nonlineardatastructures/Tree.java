package nonlineardatastructures;

public class Tree {
    public TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void printlist(TreeNode root) {
        for (TreeNode node : root.children) {
            System.out.println();
        }
    }
}
