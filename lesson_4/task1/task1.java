package OOP_Java_Prokushenkov_seminars.lesson_4.task1;

public class task1 {

    public static <T> void printElement(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {

        Integer ti = 5;
        String ts = "Five";
        Double td = 1.25;

        printElement(ti);
        printElement(ts);
        printElement(td);
        printElement(6);
        printElement("Six");
        printElement(2.38);

    }

}
