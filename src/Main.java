public class Main {
    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.getSize()-1; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.getCapacity());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(4));
        System.out.println(list.remove(3));
        for (int i = 0; i < list.getSize()-1; i++) {
            System.out.println(list.get(i));
        }
    }
}
