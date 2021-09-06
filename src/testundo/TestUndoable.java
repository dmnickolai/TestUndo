/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testundo;
import Core.NotUndoable;
import Core.UndoableBaseFirstCut;
/**
 *
 * @author dmnic
 */
class TestUndoable extends UndoableBaseFirstCut{

    Integer i = 1;
    final int j = 2;
    @NotUndoable
    Integer k = 3;
    static protected int m = 4;
    public boolean n = true;
    private double s = 55;
    
    AnotherClass a = new AnotherClass();
    AnotherClass b = null;
    AnotherClass c;
    
      
    void test1() {
        System.out.printf(" %d  %d  %d  %d %b %n", i,j,k,m, n);
        System.out.println("ac1 =" + a.getAc1());
        copyState();
        i = 99;  k =100;
        m = 102; s = 99.0;
        a.setAc1(88);
        System.out.printf(" %d  %d  %d  %d %b %n", i,j,k,m, n);
        System.out.println("ac1 =" + a.getAc1());
        undoChanges();
        System.out.printf(" %d  %d  %d  %d %b %n", i,j,k,m, n);
        System.out.println("ac1 =" + a.getAc1());
        
    }
 
}
