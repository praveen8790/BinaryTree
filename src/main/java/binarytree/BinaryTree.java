package binarytree;

public class BinaryTree<T extends Comparable<T>> {
    BinaryNode<T> root;
    public void add(T key) {
        this. root = this.addRecursively(root, key);
    }
    public BinaryNode<T> addRecursively(BinaryNode<T> current, T key) { if (current == null)
        return new BinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }
    public int getSize() {
        return this.getSizeRecursive(root);
    }
    private int getSizeRecursive(BinaryNode<T> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                + this.getSizeRecursive(current.right);
    }

    private boolean containsNodeRecursive(BinaryNode current, T value) {
        if (current == null) {
            return false;
        }
        if (current.key.equals(value)) {
            return true;
        }
        Integer comparison = (value.compareTo((T) current.key));
        return comparison<0
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }
    public boolean containsNode(T value) {
        return containsNodeRecursive(root, value);
    }


    }
