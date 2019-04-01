import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seasons {

   public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[ ] args) throws IOException {
        Season season ;
        season = Season.WINTER;

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter month");
        String month = br.readLine();
        switch (month) {


            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "Jule":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;

            default:
                System.out.println("No this month");
        }
        System.out.println("This is "+season);
    }

}

