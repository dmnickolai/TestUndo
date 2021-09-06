/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testundo;

import Core.NotUndoable;

/**
 *
 * @author dmnic
 */
public class AnotherClass implements Core.IUndoableObject{
    Integer ac1 = 999;
    @NotUndoable
    public Boolean bool;

    public AnotherClass() {
        this.bool = false;
    }
        public Integer getAc1() {
        return ac1;
    }

    public void setAc1(Integer ac1) {
        this.ac1 = ac1;
    }

    @Override
    public void copyState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undoChanges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void acceptChanges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
