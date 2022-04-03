public class Main {
    public static void main(String[] args) {

        /*
        BinaryTreeNode n1 = new BinaryTreeNode(40);
        BinaryTreeNode n2 = new BinaryTreeNode(20);
        BinaryTreeNode n3 = new BinaryTreeNode(10);
        BinaryTreeNode n4 = new BinaryTreeNode(30);
        BinaryTreeNode n5 = new BinaryTreeNode(60);
        BinaryTreeNode n6 = new BinaryTreeNode(50);
        BinaryTreeNode n7 = new BinaryTreeNode(70);


        n1.addLeftChild(n2);
        n1.addRightChild(n5);

        n2.addLeftChild(n3);
        n2.addRightChild(n4);

        n5.addLeftChild(n6);
        n5.addRightChild(n7);


        BinaryTree tree = new BinaryTree();
        tree.setRoot(n1);


        System.out.println("POST ORDER;");
        tree.Postorder(tree.getRoot());
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("PRE ORDER;");
        System.out.println(tree.preorder(tree.getRoot()));
        System.out.println("");

        System.out.println("IN ORDER;");
        System.out.println(tree.inOrder(tree.getRoot()));
        */

        BinarySearchTree tree = new BinarySearchTree(50);
        tree.insert(tree.getRoot(),30);
        tree.insert(tree.getRoot(),20);
        tree.insert(tree.getRoot(),40);
        tree.insert(tree.getRoot(),70);
        tree.insert(tree.getRoot(),60);
        tree.insert(tree.getRoot(),80);

        System.out.println(tree.inOrder(tree.getRoot()));

        System.out.println(tree.preorder(tree.getRoot()));

        System.out.println(tree.Postorder(tree.getRoot()));



    }
}
