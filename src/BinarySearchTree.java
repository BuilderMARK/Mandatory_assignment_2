public class BinarySearchTree <E extends Comparable<E>> extends BinaryTree<E> {


    private BinaryTreeNode root;

    public boolean insert(E element){
        // TODO: 03-04-2022
        return true;
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
        // TODO: 03-04-2022
        return true;
    }
    public void rebalance(){
        // TODO: 03-04-2022
        System.out.println("Lav senere");
    }
}
