/*
There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time.
Count the number of ways, the person can reach the top.

Example:
n = 5
No of ways = 8

1. Implement binary tree
2. Decrement 1 on left child
3. Decrement 2 on right child
4. Count the number of zeroes in the tree
*/

import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int arg) {
        this.data = arg;
        left = null;
        right = null;
    }
}

class Tree {

    Node root;
    int steps;

    public Tree(int val) {
        root = new Node(val);
        steps = 0;
    }
    
    int count = 1;

    public void initial(Node node) {
        System.out.println("Call number : " + count);
        count++;
        if (node.data > 0) {
                node.left = newNode(node.data - 1);
                node.right = newNode(node.data - 2);
                initial(node.left);
                initial(node.right);
        } else if (node.data == 0) {
            steps++;
            return;
        }
        System.out.println("");
        return;
    }

    public Node newNode(int val) {
        return new Node(val);
    }
    
    public void getSteps() {
        System.out.println("The number of possible combos are : " + steps);
    }
}

public class Steps {

    public static void main(String args[]) {
      	System.out.println("Enter the number of steps : ");
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree(sc.nextInt());
        tree.initial(tree.root);
        tree.getSteps();
    }
}