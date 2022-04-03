import java.util.ArrayList;

public class BinaryTree<E>{
    private BinaryTreeNode root;
    private int size;
    private int height;

    // bare lige for ingen errors
    private ArrayList empty = new ArrayList();
    private ArrayList<BinaryTreeNode> inOrderArray = new ArrayList();


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
        if(root == null)
            return false;
        else {
            ArrayList workaround = new ArrayList();
            workaround = inOrder(root);
            return workaround.contains(element);
        }
    }

    /*
    private boolean contains(E element, BinaryTreeNode node){
        if(node == null)
            return false;

        int comp = node.compareTo(element);
        System.out.println(comp);

        if(comp < 0)
            return contains(element,root.getLeftChild());
        else if(comp > 0)
            return contains(element, root.getRightChild());
        else
            return true;
    }*/

    public ArrayList<BinaryTreeNode> inOrder(BinaryTreeNode node){
        if (node == null) {
            return null;
        };
        inOrderArray.add(node);
        inOrder(node.getLeftChild());
        inOrder(node.getRightChild());
        return inOrderArray;
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
        if(root == null)
            return 0;
        else
            return height(root);
    }

    private int height(BinaryTreeNode e){
        int left = 0, right = 0;
        if(e.getLeftChild() != null)
            left = height(e.getLeftChild());

        if(e.getRightChild() != null)
            right = height(e.getRightChild());


        int max = (left > right) ? left : right;
        return max+1;
    }

}
