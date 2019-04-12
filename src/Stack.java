public class Stack<E> extends ArrayList<E>{

    Stack(){
        super();
    }

    /**
     * 栈是否为空
     * @return
     */
    public boolean empty(){
        return isEmpty();
    }

    /**
     * 查看栈最尾部
     * @return
     */
    public E peek(){
       return get(getSize()-1);
    }

    /**
     * 删除最后一位
     * @return
     */
    public E pop(){
        return remove(getSize()-1);
    }

    /**
     * 加入元素
     * @param e
     * @return
     */
    public E push(E e){
        add(e);
        return e;
    }

    /**
     * 查找元素
     * @param e
     * @return
     */
    public int search(E e){
        return indexOf(e);
    }


}
