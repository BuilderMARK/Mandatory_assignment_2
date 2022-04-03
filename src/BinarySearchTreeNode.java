public class BinarySearchTreeNode<E extends Comparable> extends BinaryTreeNode<Number>
{
    
    private BinaryTreeNode leftChild, rightChild;
    private E element;
    public BinarySearchTreeNode(E element) {
        super(element.compareTo(element));
        // TODO: 03-04-2022 Skal laves om vi compare til det samme element 
    }
}
