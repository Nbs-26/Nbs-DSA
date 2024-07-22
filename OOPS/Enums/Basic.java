package OOPS.Enums;

public class Basic {
    enum Week{
        //The below are enum constants
        //Every constant is public,static & final
        SUNDAY, 
        MONDAY, 
        TUESDAY, 
        WEDNESDAY, 
        THURSDAY, 
        FRIDAY, 
        SATURDAY;

        Week(){//This is private or default
            System.out.println(this);
        }
    }
    public static void main(String[] args) {
        Week w=Week.FRIDAY;
        // for (Week w1 : Week.values()) {
        //     System.out.println(w1);
        // }
        System.out.println(w.ordinal());
    }
}