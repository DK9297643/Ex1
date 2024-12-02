 public class test {
    public static void main(String[] args) {
        int num = 125;
        int base = 10;
        int firstD = num % base;
        System.out.println(firstD);
        int secondD = (num / base) % base;
        int thirdD = ((num / base) / base) % base;
        System.out.println(thirdD + "" + secondD + "" + firstD);
    }
}
