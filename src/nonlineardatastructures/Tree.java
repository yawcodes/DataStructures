package nonlineardatastructures;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void breadthFirstTraversal() {
        TreeNode current = root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(current);

        while (!queue.isEmpty()) {
            System.out.print(current.data);
            current = queue.poll();
            queue.addAll(current.children);
        }
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
