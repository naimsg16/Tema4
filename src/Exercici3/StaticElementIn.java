package Exercici3;

import Implementations.BinaryTree;

public class StaticElementIn {

    public static boolean isElementInTree(BinaryTree tree, Object elem){
        for(Object e : tree.preOrder()){
            if(e.equals(elem)){
                return true;
            }
        }
        return false;
    }
}
