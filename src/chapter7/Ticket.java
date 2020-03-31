package chapter7;

import java.util.Random;

public class Ticket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUM = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTickets(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i=0; i<LENGTH; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUM)+1;
        }
        return ticket;

    }

    public static void printTickets(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            System.out.println(ticket[i] + " | " );
        }
    }
}
