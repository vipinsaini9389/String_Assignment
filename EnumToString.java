public class EnumToString {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;


        String str = day.toString();
        System.out.println("Using toString() method: " + str);
    }
}
