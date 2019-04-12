public class Main {
    public static void main(String []args){
        Stack<Integer> list=new Stack<>();
        for (int i = 1; i <=10; i++) {
            list.push(i);
        }
        System.out.println(list.peek());
        System.out.println(list.pop());
        System.out.println(list.peek());
        System.out.println(list.push(1));
        System.out.println(list.peek());
    }
}
