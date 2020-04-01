/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quezada
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object value = null;
        VectorHeap instance = new VectorHeap();
        instance.add((Comparable) value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parent method, of class VectorHeap.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        int i = 0;
        int expResult = 0;
        int result = VectorHeap.parent(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of left method, of class VectorHeap.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        int i = 0;
        int expResult = 0;
        int result = VectorHeap.left(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of right method, of class VectorHeap.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        int i = 0;
        int expResult = 0;
        int result = VectorHeap.right(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of percolateUp method, of class VectorHeap.
     */
    @Test
    public void testPercolateUp() {
        System.out.println("percolateUp");
        int leaf = 0;
        VectorHeap instance = new VectorHeap();
        instance.percolateUp(leaf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pushDownRoot method, of class VectorHeap.
     */
    @Test
    public void testPushDownRoot() {
        System.out.println("pushDownRoot");
        int root = 0;
        VectorHeap instance = new VectorHeap();
        instance.pushDownRoot(root);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class VectorHeap.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        VectorHeap instance = new VectorHeap();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class VectorHeap.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        VectorHeap instance = new VectorHeap();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class VectorHeap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        VectorHeap instance = new VectorHeap();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class VectorHeap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        VectorHeap instance = new VectorHeap();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class VectorHeap.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        VectorHeap instance = new VectorHeap();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
