package DataStructures;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Yashraj on 4/7/2017.
 *
 * In this post, an efficient solution based on hash map is discussed. We need to check the Horizontal Distances from root for all nodes.
 * If two nodes have the same Horizontal Distance (HD), then they are on same vertical line.
 * The idea of HD is simple.
 * HD for root is 0, a right edge (edge connecting to right subtree) is considered as +1 horizontal distance and a left edge is considered as -1 horizontal distance.
 * For example, in the above tree, HD for Node 4 is at -2, HD for Node 2 is -1, HD for 5 and 6 is 0 and HD for node 7 is +2.
 * We can do preorder traversal of the given Binary Tree. While traversing the tree, we can recursively calculate HDs.
 * We initially pass the horizontal distance as 0 for root.
 * For left subtree, we pass the Horizontal Distance as Horizontal distance of root minus 1.
 * For right subtree, we pass the Horizontal Distance as Horizontal Distance of root plus 1.
 * For every HD value, we maintain a list of nodes in a hasp map.
 * Whenever we see a node in traversal, we go to the hash map entry and add the node to the hash map using HD as a key in map.
 *
 */
public class VerticalOrderBT {

    public static TreeMap<Integer, ArrayList> ht = new TreeMap<>();;
    public static int level;
    public ArrayList<Integer> al;

    public Node vertical(Node root, int level) {
        if (root == null) {
            return null;
        }
        Node y = vertical(root.left, --level);
        if (y == null) {
            level++;
        }
        if (ht.get(level) != null) {
            ArrayList x = ht.get(level);
            x.add(root.data);
            ht.put(level, x);
        } else {
            al = new ArrayList<>();
            al.add(root.data);
            ht.put(level, al);
        }
        return vertical(root.right, ++level);
    }

    public void printResult(TreeMap ht) {
        Set<Integer> i = ht.keySet();
        for (int keys : i) {
            System.out.println(ht.get(keys));
        }
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        VerticalOrderBT p = new VerticalOrderBT();
        p.vertical(root, 0);
        p.printResult(ht);

    }
}

class Node {


    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        next = null;
    }
}
