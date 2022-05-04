package binaryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import static binaryTrees.TestTrees.dftRecursive;

public class TestTrees {

    public static void main(String[] args) {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

//        a
//       / \
//      b   c
//    /  \    \
//   d    e    f

        //DFT => a -> b -> d -> e -> c -> f
        System.out.println(Arrays.toString(depthFirstValues(a).toArray()));
//        depthFirstValues(a);
    }


    public static ArrayList depthFirstValues (Node root) {

        if (root == null) {
            return new ArrayList(0);
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node current;

        ArrayList<String> results = new ArrayList<>();

        while (stack.size() > 0) {
            current = stack.pop();
            String rez = current.val;
            results.add(rez);
//            System.out.print(current.val + "->");

            if(current.right != null) {
                stack.push(current.right);
            }

            if(current.left != null) {
                stack.push(current.left);
            }
        }

        return results;
    }



    public static void dftRecursive(Node root) {
//        if(root == null)
//            return null;
//        Node leftVals = dftRecursive(root.left);  // [b, d, e]
//        Node rightVals = dftRecursive(root.right); // [c, f]

//        ArrayList<Node> results = new ArrayList<>();
//        return re;

//        if (root != null) {
//            visit(root.val);
//            dftRecursive(root.left);
//            dftRecursive(root.right);
//        }
    }
}
