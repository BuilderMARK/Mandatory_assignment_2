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
        // TODO: 03-04-2022
        return true;
    }
    public void rebalance(){
        // TODO: 03-04-2022
        System.out.println("Lav senere");
    }
}
