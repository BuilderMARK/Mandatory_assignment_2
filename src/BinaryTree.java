import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class BinaryTree<E>{
    private BinaryTreeNode root;
    private int size;
    private int height;

    // bare lige for ingen errors
    private ArrayList empty = new ArrayList();
    private ArrayList<Integer> inOrderArray = new ArrayList();
    private ArrayList<Integer> PreOrderArray = new ArrayList();


    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public boolean isEmpty(){
        if(root == null)
            return false;
        else
            return true;
    }

    public int size(){
        return (size(root));
    }

    private int size(BinaryTreeNode node){
        if(node == null)
            return 0;
        else {
            return (size(node.getLeftChild()) + 1 + size(node.getRightChild()));
        }
    }

    public boolean contains(E element){
        //search?
        return false;
    }

    public ArrayList<Integer> inOrder(BinaryTreeNode node){
        if (node == null) {
            return null;
        };
        inOrderArray.add(node.getElement().intValue());
        inOrder(node.getLeftChild());
        inOrder(node.getRightChild());
        Collections.sort(inOrderArray);



        return inOrderArray;
    }

    public ArrayList<Integer> preorder(BinaryTreeNode node){
        if (node == null) {
            return null;
        };
        PreOrderArray.add(node.getElement().intValue());
        preorder(node.getLeftChild());
        preorder(node.getRightChild());
        return PreOrderArray;
    }

    void Postorder(BinaryTreeNode node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        Postorder(node.getLeftChild());

        // then recur on right subtree
        Postorder(node.getRightChild());

        // now deal with the node
        System.out.print(node.getElement() + " ");
    }




    public ArrayList<E> levelOrder(){
        return empty;

    }

    public int height(){
        return -1;
    }

}
