public class Stack<E> extends ArrayList<E>{

    Stack(){
        super();
    }
    public boolean empty(){
        return isEmpty();
    }
    public E peek(){
       return get(getSize()-1);
    }
    public E pop(){
        return remove(getSize()-1);
    }
    public E push(E e){
        add(e);
        return e;
    }
    public int search(E e){
        return indexOf(e);
    }


}
