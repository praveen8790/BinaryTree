package binarytree;

public class BinaryNode<T extends Comparable<T>>{
    T key;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
