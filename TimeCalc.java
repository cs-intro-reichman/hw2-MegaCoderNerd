public class TimeCalc {
    public static void main(String[] args) {
        String timeIn = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        // substring function makes a substring from a start index to an end index
        int hours = Integer.parseInt(timeIn.substring(0, 2));
        int minutes = Integer.parseInt(timeIn.substring(3, 5));
        
        // first I convert to minutes and then I add the minutes needed.
        // only after that I convert back to hours and minutes and print
        int hoursToMinutes = hours * 60 + minutes + minutesToAdd;
        int newHours = (hoursToMinutes / 60) % 24;
        int newMinutes = hoursToMinutes % 60;
        String finalString = "";

        // String formatting for when there is only one digit for hours or minutes
        if (newHours < 10) {
            finalString += "0" + newHours + ":";
        }
        else {
            finalString += newHours + ":";
        }
        
        if (newMinutes < 10) {
            finalString += "0" + newMinutes;
        }
        else {
            finalString += newMinutes;
        }

        System.out.println(finalString);
    }
}
