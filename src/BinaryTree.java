import java.util.ArrayList;

public class BinaryTree<E>{
    private BinaryTreeNode root;
    private int size;
    private int height;

    // bare lige for ingen errors
    private ArrayList empty = new ArrayList();


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

    public ArrayList<E> inOrder(){
        if(root == null)
            return empty;
        else {
            //return inorder
            return empty;
        }
    }

    public ArrayList<E> preorder(){
    return empty;
    }

    public ArrayList<E> postOrder(){
        return empty;

    }

    public ArrayList<E> levelOrder(){
        return empty;

    }

    public int height(){
        return -1;
    }

}
