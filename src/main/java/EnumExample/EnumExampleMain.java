package EnumExample;

public class EnumExampleMain {
    public static void main(String[] args) {
//        System.out.println(DayOfWeek.SUN.ordinal());
//        System.out.println(DayOfWeek.SUN);
//        System.out.println(DayOfWeek.SUN.name());

        DayOfWeek [] weeks = DayOfWeek.values();
        for (DayOfWeek day : weeks) {
            System.out.println(day.ordinal() + " : " + day.getValue());
        }

        System.out.println(DayOfWeek.SUN.name());
        System.out.println(DayOfWeek.SUN.getValue());
        System.out.println(DayOfWeek.SUN.ordinal());
    }
}
