import java.util.NoSuchElementException;

public class Queue<E> extends ArrayList<E>{
    Queue(){
        super();
    }

    @Override
    public void add(E e) {
        super.add(e);
    }
    public E remove(){
        if (getSize()==0)
            throw new NoSuchElementException("This queue is null");
        return remove(getSize()-1);
    }
    public E poll(){
        if(getSize()==0)
            return null;
        return remove(getSize()-1);
    }
    public E element(){
        if (getSize()==0)
            throw new NoSuchElementException("This queue is null");
        return get(getSize()-1);
    }
    public E peek(){
        return get(getSize()-1);
    }


}
