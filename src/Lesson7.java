public class Lesson7 {
    public static void main(String[] args) {

//    //Alarm clock app
//        String dayOfWeek;
//
//        dayOfWeek = "Tuesday";
//
//        if (dayOfWeek == "Monday" || dayOfWeek == "Tuesday"){
//            System.out.println("Alarm is set to 7 AM.");
//        }else if (dayOfWeek == "Wednesday"){
//            System.out.println("Alarm is set to 8 AM.");
//        }else if (dayOfWeek == "Thursday" || dayOfWeek == "Friday"){
//            System.out.println("Alarm is set to 7:30 AM.");
//        }else if (dayOfWeek == "Saturday" || dayOfWeek == "Sunday"){
//            System.out.println("No need for alarm.");
//        }else {
//            System.out.println("Not a week day");
//        }


        // If you go to office
        // working day - high heels
        // Casual Fridays - you can wear flats
        // Holidays - you stay at home
        // Halloween - you can wear any costume

        String day = "Working day";

        if (day == "Working day"){
            System.out.println("You have to wear high heels.");
        }else if (day == "Casual friday"){
            System.out.println("YOu can wear flats.");
        }else if (day == "Holiday"){
            System.out.println("You can stay at home.");
        }else if (day == "Halloween"){
            System.out.println("You can wear a costume.");
        }else {
            System.out.println("This day doesn't exist.");
        }

        

    }
}
