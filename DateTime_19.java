import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateTime_19 {
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalDate userday = LocalDate.of(2015, Month.MAY, 15);
        Period diff = Period.between(userday, today);
        System.out.println("\nDifference between "+ userday +" and "+ today +": "
                + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");
    }
}
