public class BinarySearchTreeNode<E extends Comparable> extends BinaryTreeNode<Number>
{
    
    private BinaryTreeNode<Number> leftChild, rightChild;
    private E element;


    public BinarySearchTreeNode(Number element) {
        super(element);
        // TODO: 03-04-2022 Skal laves om vi compare til det samme element 
    }
}
