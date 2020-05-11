
import Prog1Tools.IOTools;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// build a simple tree add 5 nodes to the tree
        Node root = new Node(5);//create tree's root O(1)
        System.out.println("Tree Example");
        System.out.println("Building tree with root value " + root.value);
        insert(root, 1);//insert first item after root
        insert(root, 8);//insert second item after root
        insert(root, 6);//insert third item after root
        insert(root, 3);//insert fourth item after root
        insert(root, 9);//insert fifth item after root
        System.out.println("Traversing tree ");
        printOrder(root);
	}
	
	public static void insert(Node node, int value) {
        if (value < node.value) {//if new value < than current node value
          if (node.left != null) {//if current node left child is not null, meaning there is a child there
            insert(node.left, value);//try insert the a new node under that left child node with a recursive insert call
          } else {
            System.out.println(" Inserted " + value + " to left of "
                + node.value);
            node.left = new Node(value);
          }
       } else if (value > node.value) {
          if (node.right != null) {
            insert(node.right, value);
          } else {

               System.out.println(" Inserted " + value + " to right of "
                    + node.value);
               node.right = new Node(value);
           }
        }
   }
	
	public static void printOrder(Node node) {
        if (node != null) {
           printOrder(node.left);
           System.out.println(" Traversed " + node.value);
           printOrder(node.right);
        }
     }
}

class Node {
    Node left;
    Node right;
    int value;

    public Node(int value) {
        this.value = value;
    }
}