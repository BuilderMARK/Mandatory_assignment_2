public class BinarySearchTreeNode<E extends Number> extends BinaryTreeNode<E>
{
    private BinaryTreeNode leftChild, rightChild;
    private E element;
    public BinarySearchTreeNode(E element) {
        super(element);
    }
}
