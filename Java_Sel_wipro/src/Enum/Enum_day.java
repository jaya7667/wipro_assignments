package Enum;
enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
public class Enum_day {

	public static void main(String[] args) {
		Day day= Day.WEDNESDAY;
		switch(day)
		{
		case MONDAY: System.out.println("Today is Monday");break;
		case TUESDAY: System.out.println("Today is Tuesday");break;
		case WEDNESDAY: System.out.println("Today is Wednesday");break;
		case THURSDAY: System.out.println("Today is Thursday");break;
		case FRIDAY: System.out.println("Today is Friday");break;
		case SATURDAY: System.out.println("Today is Saturday");break;
		case SUNDAY: System.out.println("Today is Sunday");break;
		
		}
		
		
		// TODO Auto-generated method stub

	}

}
