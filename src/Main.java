public class Main {
    public static void main(String[] args) {

        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode nNotInTree = new BinaryTreeNode(6);

        n1.addLeftChild(n2);
        n2.addRightChild(n3);


        BinaryTree tree = new BinaryTree();

        tree.setRoot(n1);
        System.out.println(tree.size());
        System.out.println(tree.contains(nNotInTree));
    }
}
