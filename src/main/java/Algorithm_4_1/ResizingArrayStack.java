package Algorithm_4_1;

import java.util.Iterator;

/**
 * Created by zhangxuelong on 2018/5/10
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    private void resize(int max){
        //将栈移动到一个大小为max的新数组
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0;i<N;i++){
            temp[i] = a[i];
            a=temp;
        }
    }
    public void push(Item item){
        // 将元素添加到栈顶
        if (N == a.length){
            resize(2*a.length);
        }
        a[N++] = item;
    }
    public Item pop(){
        // 从栈顶删除元素
        Item item = a[--N];
        // 避免对象游离
        a[N] = null;
        if(N>0&&N==a.length/4){
            resize(a.length/2);
        }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<Item>{
        // 支持后进先出的迭代
        private int i = N;
        public boolean hasNext(){
            return i>0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        public void remove(){

        }
    }
}
