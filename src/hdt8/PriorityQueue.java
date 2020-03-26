/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

/**
 *
 * @author Quezada
 */
public class PriorityQueue<E extends Comparable<E>> {
    
    /**
     *
     * @return
     */
    public E getFirst();

    /**
     *
     * @return
     */
    public E remove();
   
    /**
     *
     * @param value
     */
    public void add(E value);
    
    /**
     *
     * @return
     */
    public boolean isEmpty();
   
    /**
     *
     * @return
     */
    public int size();
    
    /**
     *
     */
    public void clear();
    
    
}
