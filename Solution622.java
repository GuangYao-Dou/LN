package LeetCode;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/21
 * Time: 14:44
 * Description：
 */
public class Solution622 {
    private  int head;
    private int tail;
    private int[] element;
    private int useSize;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public Solution622(int k) {
        this.element = new int[k];
        this.head = 0;
        this.tail = 0;
        this.useSize = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        this.element[tail] = value;
        this.tail = (tail + 1) % element.length;
        useSize ++ ;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        this.head = (this.head + 1) % element.length;
        this.useSize--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return 0;
        }
        return element[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return 0;
        }
        int temp  =  (this.tail + element.length - 1) % element.length;
        return element[temp];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return this.head == this.tail;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if ((this.tail + 1) % this.element.length == head) {
            return true;
        }
        return false;
    }
}
