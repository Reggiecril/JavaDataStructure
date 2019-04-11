# Java Data Structure
###### This is a practise about data structure in Java. Author by [Reggiecril](https://github.com/Reggiecril)

* ArrayList
    [Detail](https://github.com/Reggiecril/JavaDataStructure/blob/master/src/ArrayList.java)
  
    该文件仅实现基本arraylist方法。
    
    Arraylist中比较重要的点为泛型和扩展容量。
    泛型就是在程序编码中一些包含参数的类。其参数可以代表类或对象等等。主要作用就是加强类型安全及减少类转换的次数，主要因为使用object类型进行强制转换繁多且易出错。
    
    Arraylist中扩展容量顾名思义就是扩展数组长度。 ArrayList是以数组为基础的，其中Capcity代表这它的数组长度，size就是指针指到最后一个数据的指针。
    Arraylist初始容量为10。当用户添加数据到11时，数组就必须要扩展容量不然会报出异常。下面这段代码为JDK源码中的arraylist所扩展的容量：为旧的容量在加上（旧容量往后移位一位）。
    而本文档，仅仅作为练习使用，所以只是扩展容量为原始容量的1。5倍。
    ```Java
          int newCapacity = oldCapacity + (oldCapacity >> 1);
    ```