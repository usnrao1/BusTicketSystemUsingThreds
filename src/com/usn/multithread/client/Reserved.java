package com.usn.multithread.client;

import com.usn.multithread.system.TicketBookingThread;
import com.usn.multithread.system.TicketCounter;

public class Reserved {

	public static void main(String[] args) {
		
		TicketCounter ticketCounter = new TicketCounter();
		
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter,"John",2);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter,"Martin",2);
        
        t1.start();
        t2.start();
    }

	}

