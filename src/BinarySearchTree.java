import java.util.ArrayList;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {


    private BinaryTreeNode root;

    @Override
    public BinaryTreeNode getRoot() {
        return root;
    }

    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int value) {
        root = new BinaryTreeNode(value);
    }


    public BinaryTreeNode insert(BinaryTreeNode root, int value) {


        if (root == null) {
            root = new BinaryTreeNode(value);
            return root;
        }

        if (value < root.getElement().intValue())
             root.addLeftChild(insert(root.getLeftChild(), value),root);
        else if (value > root.getElement().intValue())
            root.addRightChild(insert(root.getRightChild(), value),root);

        return root;
    }

    public boolean removeElement(E element) {
        // TODO: 03-04-2022
        return true;
    }

    public E findMin() {
        //Ikke lavet endnu
        BinaryTreeNode node;
        node = root;
        while (node.getLeftChild() != null) {
            node.getLeftChild();
        }
        return (E) node.getElement();
    }

    public E findMax() {
        // TODO: 03-04-2022
        BinaryTreeNode node;
        node = root;
        while (node.getRightChild() != null) {
            node.getRightChild();
        }
        return (E) node.getElement();
    }

    public boolean contains(E element) {
        if (root == null)
            return false;
        else
            return contains(element, root);
    }

    private boolean contains(E element, BinaryTreeNode node) {
        if (node == null)
            return false;

        int comp = element.compareTo((E) node.getElement());
        System.out.println(comp);

        if (comp < 0)
            return contains(element, root.getLeftChild());
        else if (comp > 0)
            return contains(element, root.getRightChild());
        else
            return true;
    }


    public void rebalance() {
        ArrayList<Integer> tmp = new ArrayList();
        tmp = Postorder(root);

        reset();
        for (Integer i : tmp) {
            root = insert(root, i.intValue());
        }
    }


    public boolean remove(Integer t) {
        ArrayList<Integer> tmp2 = new ArrayList();
        ArrayList<Integer> tmp10 = new ArrayList();
        tmp2 = Postorder(root);

        reset();

        for (Integer i: tmp2) {
            if (i != t) {
               tmp10.add(i);
            }
        }
        root = null;
        for (Integer i : tmp10 ) {
            root = insert(root, i.intValue());
        }
        return true;
}
}

//t.getParrent().getLeftChild().getElement().intValue() == v||
//t.getParrent().getRightChild().getElement().intValue() == v ||
