import java.util.NoSuchElementException;

public class Queue<E> extends ArrayList<E>{
    Queue(){
        super();
    }

    /**
     *
     * 增加元素
     * @param e
     */
    @Override
    public void add(E e) {
        super.add(e);
    }

    /**
     * 删除最后一位（队列为空时抛出异常）
     * @return
     */
    public E remove(){
        if (getSize()==0)
            throw new NoSuchElementException("This queue is null");
        return remove(getSize()-1);
    }

    /**
     * 删除最后一位（队列为空时返回null）
     * @return
     */
    public E poll(){
        if(getSize()==0)
            return null;
        return remove(getSize()-1);
    }

    /**
     * 返回最后一位元素（为空抛异常）
     * @return
     */
    public E element(){
        if (getSize()==0)
            throw new NoSuchElementException("This queue is null");
        return get(getSize()-1);
    }

    /**
     * 返回最后一位元素
     * @return
     */
    public E peek(){
        return get(getSize()-1);
    }


}
