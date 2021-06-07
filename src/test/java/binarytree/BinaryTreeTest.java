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
    @Test
    void givenNumbersToTreeReturnsSize() {
        BinaryTree<Integer> binaryTree = new BinaryTree();
        int[] arr = {3,11,16,22,30,40,56,70,60,95,65,63,67};
        for (int i : arr) {
            binaryTree.add(i);
        }
        int size = binaryTree.getSize();
        System.out.println("size"+size);
        Assertions.assertEquals(arr.length,size);
    }
    @Test
    void searchForAnElementInBinaryTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree();
        int[] arr = {3,11,16,22,30,40,56,70,60,95,65,63,67};
        for (int i : arr) {
            binaryTree.add(i);
        }
        int size = binaryTree.getSize();
        Assertions.assertTrue(binaryTree.containsNode(67));
    }

}