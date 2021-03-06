/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tree;

/**
 *
 * @author Hp
 */
public class BinaryTreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree bt = new BinaryTree();
        
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Max = "+bt.findMax(bt.root));                
        System.out.println("Min = "+bt.findMin(bt.root));
        bt.dataLeaf(bt.root);
        System.out.println("");
        bt.jumlahLeaf(bt.root);
        System.out.println("");
    }
    
}
