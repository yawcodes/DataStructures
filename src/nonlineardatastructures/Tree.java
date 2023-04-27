package nonlineardatastructures;

public class Tree {
    public TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void depthFirstTraversal(TreeNode current) {
        System.out.print(current.data);

        for (TreeNode child : current.children) {
            depthFirstTraversal(child);
        }
    }

    public void printlist(TreeNode root) {
        for (TreeNode node : root.children) {
            print(node, 0);
        }
    }

    public void print(TreeNode current, int level) {
        String levelMarks = "";
        for (int i = 0; i < level; i++) {
            levelMarks += "-- ";
        }
        System.out.println(levelMarks + current.data);
        for (TreeNode child : current.children) {
            print(child, level + 1);
        }
    }
}
