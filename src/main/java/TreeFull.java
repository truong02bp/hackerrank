import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreeFull {

    static final Scanner scanner = new Scanner(System.in);

    static class Node {
        private int data;
        private Node left;
        private Node right;
    }

    static Node buildTree(int n){

        Node root = null;
        Map<Integer,Node> a = new HashMap<>();
        int u,v;
        char x;
        for (int i=0;i<n;i++){
            u = scanner.nextInt();
            v = scanner.nextInt();
            scanner.nextLine();
            x = scanner.nextLine().charAt(0);
            Node parent = null;
            if (a.get(u) == null){
                parent = new Node();
                parent.data = u;
                if (root == null)
                    root = parent;
            }
            else
                parent = a.get(u);
            Node child = new Node();
            child.data = v;
            if (x == 'L')
                parent.left = child;
            else
                if (x == 'R')
                    parent.right = child;
        }
        return root;
    }

    static boolean isFull(Node root){
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        return isFull(root.left) && isFull(root.right) && root.left != null && root.right != null;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();

    }
}
