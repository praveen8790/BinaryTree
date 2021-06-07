package binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    @Test
    void given3NumbersToTreeReturnsSize() {
        BinaryTree<Integer> binaryTree = new BinaryTree();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int size = binaryTree.getSize();
        Assertions.assertEquals(3,size);
    }

}