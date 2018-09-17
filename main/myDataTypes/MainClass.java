package main.myDataTypes;

import myDataTypes.Employee.Employee;
import myDataTypes.Entertainment.IPLTicket;
import myDataTypes.Entertainment.Movie;
import myDataTypes.Entertainment.MovieTicket;
import myDataTypes.social.Mail;
import myDataTypes.social.WhatsappGroup;

public class MainClass {

	public static void main(String[] args) 
	{
		System.out.println(" employee details");
		Employee e=new Employee();
		e.workPerfomance();
		e.remarks();
		e.currentStatus();
		
		System.out.println();
		
		Employee e1=new Employee("1","goutham","34","86593364","1-9-1015","goutham@gmail.com");
		e1.workPerfomance();
		e1.remarks();
		e1.currentStatus();
		
		System.out.println();
		
		System.out.println("ipl ticket ");
		IPLTicket i= new IPLTicket();
		i.innings();
		i.breakTime();
		
		System.out.println();
		
		System.out.println("movie details ");
		Movie m=new Movie();
		m.review();
		m.audioLaunch();
		m.successMeet();
		
		System.out.println();
		
		System.out.println(" movieticket");
		MovieTicket t=new MovieTicket();
		t.validFromAndTo();
		
		System.out.println();
		
		System.out.println("mail details");
		Mail m1=new Mail();
		m1.recievingAndSending();
		m1.networkStatus();
		
		System.out.println();
		
		System.out.println(" whatsapp details");
		WhatsappGroup w=new WhatsappGroup();
		w.admin();
		w.membersInteraction();
		
	}

}
