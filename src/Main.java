public class Main {
    public static void main(String[] args) {
        Time time4 = new Time(10, 14, 43);
        System.out.println(time4.info());
        Time time5 = new Time(8, 30, 29);
        time4.add(time5.info());
        System.out.println(time4.info());


    }
}