public class BinaryTreeNode<E extends Number> implements Comparable<BinaryTreeNode<E>> {

    private E element;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode(E value) {
        element = value;
    }

    void setElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    void addLeftChild(BinaryTreeNode v) {
        this.leftChild = v;
    }

    void addRightChild(BinaryTreeNode v) {
        this.rightChild = v;
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
