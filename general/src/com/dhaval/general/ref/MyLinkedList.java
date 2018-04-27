/**
 * 
 */
package com.dhaval.general.ref;

/**
 * @author Dhaval Simaria
 *
 */
public class MyLinkedList {

    private ListNode head;
    private int size;

    // inner class for ListNode
    private class ListNode {
        private Object data;
        private ListNode next;

        private ListNode(Object d) {
            this.data = d;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = new ListNode(null); // with a dummy head node
        this.size = 0;
    }
}
