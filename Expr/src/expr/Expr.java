/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expr;

/**
 *
 * @author danecek
 */
public abstract class Expr {
    
    abstract int eval();
    abstract int priority();
    abstract void accept(ExprVisitor visitor);
    
}
