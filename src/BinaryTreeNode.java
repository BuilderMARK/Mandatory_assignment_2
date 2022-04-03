public class BinaryTreeNode<E extends Number> implements Comparable<BinaryTreeNode<E>> {

    private E element;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;
    private BinaryTreeNode parrent;

    public void setParrent(BinaryTreeNode parrent) {
        this.parrent = parrent;
    }

    public BinaryTreeNode getParrent() {
        return parrent;
    }

    public BinaryTreeNode(E value) {
        element = value;
    }

    void setElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    void addLeftChild(BinaryTreeNode v, BinaryTreeNode parrent) {
        this.leftChild = v;
        this.parrent = parrent;
    }

    void addRightChild(BinaryTreeNode v, BinaryTreeNode parrent) {
        this.rightChild = v;
        this.parrent = parrent;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    @Override
    public int compareTo(BinaryTreeNode<E> o) {
        return 0;
    }

}
