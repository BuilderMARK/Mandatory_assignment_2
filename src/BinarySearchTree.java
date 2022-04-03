import java.util.ArrayList;

public class BinarySearchTree <E extends Comparable<E>> extends BinaryTree<E> {


    private BinaryTreeNode root;

    @Override
    public BinaryTreeNode getRoot() {
        return root;
    }

    BinarySearchTree() { root = null; }

    BinarySearchTree(int value) { root = new BinaryTreeNode(value); }


    public BinaryTreeNode insert(BinaryTreeNode root, int value){
        if (root == null) {
            root = new BinaryTreeNode(value);
            return root;
        }

        if (value < root.getElement().intValue())
            root.addLeftChild(insert(root.getLeftChild(), value));
        else if (value > root.getElement().intValue())
            root.addRightChild(insert(root.getRightChild(), value));

        return root;
    }

    public boolean removeElement(E element){
        // TODO: 03-04-2022
        return true;
    }
    public E findMin(){
        //Ikke lavet endnu
        BinaryTreeNode node;
        node = root;
        while (node.getLeftChild() != null){
            node.getLeftChild();
        }
        return (E) node.getElement();
    }

    public E findMax(){
        // TODO: 03-04-2022
        BinaryTreeNode node;
        node = root;
        while (node.getRightChild() != null){
            node.getRightChild();
        }
        return (E) node.getElement();
    }

    public boolean contains(E element){
        if(root == null)
            return false;
        else
            return contains(element, root);
    }

    private boolean contains(E element, BinaryTreeNode node){
        if(node == null)
            return false;

        int comp = element.compareTo((E) node.getElement());
        System.out.println(comp);

        if(comp < 0)
            return contains(element,root.getLeftChild());
        else if(comp > 0)
            return contains(element, root.getRightChild());
        else
            return true;
    }


    public void rebalance(){
        ArrayList<Integer> tmp = new ArrayList();
        tmp = inOrder(root);

        root = null;
        for (Integer i :tmp){
            insert(root, i.intValue());
        }
    }
}
