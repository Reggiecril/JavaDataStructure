import java.util.Arrays;

public class ArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] array;
    private int size;

    ArrayList() {
        this(DEFAULT_CAPACITY);
        size = 0;
    }

    ArrayList(int Capacity) {
        array = (E[]) new Object[Capacity];
        size = 0;
    }

    /**
     * 获得容量长度
     * @return
     */
    public int getCapacity() {
        return array.length;
    }

    /**
     * 添加元素
     * @param e
     */
    public void add(E e) {
        add(array.length - 1, e);
    }

    /**
     * 添加元素到指定位置
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("OutOfIndex: index in " + index);
        if (array.length == size)
            grow((int) (1.5 * array.length));
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = e;
        size++;
    }

    /**
     * 增加容量
     * @param newCapcity
     */
    private void grow(int newCapcity) {
        Arrays.copyOf(array, newCapcity);
    }

    /**
     * 清空数据
     */
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
    }

    /**
     * 获取指定位置元素
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("OutOfIndex: index in " + index);
        return array[index];
    }

    /**
     * 删除指定位置元素
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("OutOfIndex: index in " + index);
        E temp = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return temp;
    }

    /**
     * 删除指定元素
     * @param e
     * @return
     */
    public boolean remove(E e) {
        if (indexOf(e) == -1)
            return false;
        remove(indexOf(e));
        return true;
    }

    /**
     * 查询指定元素
     * @param e
     * @return
     */
    public boolean contains(E e) {
        if (indexOf(e) == -1) return false;
        return true;
    }

    /**
     * 返回指定元素地址
     * @param e
     * @return
     */
    public int indexOf(E e) {
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(e)) return i;
            }
        }
        return -1;
    }

    /**
     * 重置指定位置元素值
     * @param index
     * @param e
     * @return
     */

    public E set(int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("OutOfIndex: index in " + index);
        array[index] = e;
        return e;
    }

    /**
     * 获取长度
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 是否无数据
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }


}
