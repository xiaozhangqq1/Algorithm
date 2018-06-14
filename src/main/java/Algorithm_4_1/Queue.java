package Algorithm_4_1;

/**
 * Created by zhangxuelong on 2018/5/18
 * 先进先出队列
 */
public class Queue<Item> {
    private Node first;
    private Node last;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return N;
    }
    public void enquene(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()){
            first = last;
        }else {
            oldlast.next = last;
        }
        N ++;
    }
    public Item dequene(){
        Item item = first.item;
        first = first.next;
        if (isEmpty()){
            last = null;
        }
        N --;
        return item;
    }
}
