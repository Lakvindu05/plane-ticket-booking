import java.util.*;
public class PlaneManagement {
    static Scanner input = new Scanner (System.in);
    static int [] row_A = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};// declare array row 1 as global array
    static int [] row_B = {0,0,0,0,0,0,0,0,0,0,0,0};// declare array row 2 as global array
    static int [] row_C = {0,0,0,0,0,0,0,0,0,0,0,0};// declare array row 3 as global array
    static int [] row_D = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};// declare array row 4 as global array
    static String [] row = {"A","B","C","D"};

    static String rowNum;
    static int seatNum;
    static String mail;
    static ArrayList<Ticket> ticket_list = new ArrayList<>();
    public static void main(String [] args){
        System.out.println("Welcome to the Plane Management application");

        while (true){
            System.out.println("------------------------------------------------- \nPlease Select an option: \n1.Buy a ticket\n2.Cancel ticket\n3.List available seats\n4.Print seating area\n5.Print ticket information and total price\n6.Search Ticket\n0.Quit\n------------------------------------------------- ");
            try {
                System.out.print("Enter option:");
                int option = input.nextInt();
                switch (option) {
                    case 0 -> {System.out.println("Exiting program\nGoodbye");
                        System.exit(0);}
                    case 1 -> buyTicket();
                    case 2 -> cancelTicket();
                    case 3 -> showAvailable();
                    case 4 -> printSeatingArea();
                    case 5 -> showInfo();
                    case 6 -> search();
                    case 7 -> save();
                    default -> System.out.println("Invalid option number");
                }
            }
            catch (InputMismatchException e){
                System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                input.nextLine();
            }
        }
    }
    static void buyTicket(){

        System.out.println("\t***************");
        System.out.println("\t* BUY  TICKET *");
        System.out.println("\t***************\n");


        System.out.print("Enter your name:");
        String name = input.next();
        System.out.print("Enter your Surname:");
        String surName = input.next();
        // validating E-mail
        while (true){
            System.out.print("Enter your mail:");
            mail = input.next();
            if (mail.contains("@") && mail.contains(".")){
                break;
            }
            else {
                System.out.println("Invalid email format\nenter again");
            }
        }
        // validating row number
        while(true){
            try{
                System.out.print("Enter row (A,B,C,D):");
                rowNum = input.next().toUpperCase();
                boolean isValid = false;
                for (String r : row) {
                    if (r.equals(rowNum)) {
                        isValid = true;
                        break;
                    }
                }
                if (!isValid) {
                    System.out.println("Invalid row number\nPlease enter again below");
                } else {
                    break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("You have entered an invalid input\nPlease note that you can only enter values mentioned above");
                input.nextLine();
            }
        }
        while (true){
            switch (rowNum){
                case "A" -> {
                    try {
                        int price = 150;
                        System.out.print("Enter seat number (1-14):");
                        seatNum = input.nextInt()-1;
                        if (seatNum < 0 || seatNum > 14) {
                            System.out.println("Invalid seat number\nplease enter again below");
                        } else if (row_A[seatNum] == 0) {
                            System.out.println("Seat:"+rowNum+"-"+(seatNum+1)+" available");
                            row_A[seatNum] = 1;
                            Person personObj = new Person(name,surName,mail);
                            Ticket ticketObj  = new Ticket(rowNum,seatNum,price,personObj);
                            ticket_list.add(ticketObj);
                            System.out.println("Seat:"+rowNum+"-"+(seatNum+1)+" booked");
                            return;

                        } else {
                            System.out.println("Seat unavailable");
                            return;
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
                case "B" -> {
                    try {
                        int price = 150;
                        System.out.print("Enter seat number (1-12):");
                        seatNum = input.nextInt()-1;
                        if (seatNum < 0 || seatNum > 11) {
                            System.out.println("Invalid seat number\nplease enter again below");
                        } else if (row_B[seatNum] == 0) {
                            System.out.println("Seat:"+rowNum+"-"+(seatNum+1)+" available");
                            row_B[seatNum] = 1;
                            Person personObj = new Person(name,surName,mail);
                            Ticket ticketObj  = new Ticket(rowNum,seatNum,price,personObj);
                            ticket_list.add(ticketObj);
                            System.out.println("Seat:"+rowNum+"-"+(seatNum+1)+" booked");
                            return;

                        } else {
                            System.out.println("Seat unavailable");
                            return;
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
                case "C" -> {
                    try {
                        int price = 150;
                        System.out.print("Enter seat number (1-12):");
                        seatNum = input.nextInt()-1;
                        if (seatNum < 0 || seatNum > 11) {
                            System.out.println("Invalid seat number\nplease enter again below");
                        } else if (row_C[seatNum] == 0) {
                            System.out.println("Seat:"+rowNum+"-"+(seatNum+1)+" available");
                            row_C[seatNum] = 1;
                            Person personObj = new Person(name,surName,mail);
                            Ticket ticketObj  = new Ticket(rowNum,seatNum,price,personObj);
                            ticket_list.add(ticketObj);
                            System.out.println("Seat:"+rowNum+"-"+(seatNum+1)+" booked");
                            return;

                        } else {
                            System.out.println("Seat unavailable");
                            return;
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
                case "D" -> {
                    try {
                        int price = 150;
                        System.out.print("Enter seat number (1-14):");
                        seatNum = input.nextInt()-1;
                        if (seatNum < 0 || seatNum > 13) {
                            System.out.println("Invalid seat number\nplease enter again below");
                        } else if (row_D[seatNum] == 0) {
                            System.out.println("Seat:"+rowNum+"-"+(seatNum+1)+" available");
                            row_D[seatNum] = 1;
                            Person personObj = new Person(name,surName,mail);
                            Ticket ticketObj  = new Ticket(rowNum,seatNum,price,personObj);
                            ticket_list.add(ticketObj);
                            System.out.println("Seat:"+rowNum+"-"+(seatNum+1)+" booked");
                            return;

                        } else {
                            System.out.println("Seat unavailable");
                            return;
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
            }
        }
    }
    static void cancelTicket(){
        String rowNum;
        int seatNum;

        System.out.println("\t*****************");
        System.out.println("\t* CANCEL TICKET *");
        System.out.println("\t*****************\n");
        // Obtaining and validating row
        while(true){
            try{
                System.out.print("Enter row number:");
                rowNum = input.next().toUpperCase();
                boolean isValid = false;
                for (String r : row) {
                    if (r.equals(rowNum)) {
                        isValid = true;
                        break;
                    }
                }
                if (!isValid) {
                    System.out.println("Invalid row number\nPlease enter again below");
                } else {
                    break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                input.nextLine();
            }
        }
        switch (rowNum) {
            case "A" -> {
                // Obtaining and validating seat number
                while (true){
                    try {
                        System.out.print("Enter seat number (1-14):");
                        seatNum = input.nextInt()-1;
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
                if (seatNum < 0 || seatNum > 13) {
                    System.out.println("Invalid seat number\nPlease enter again below");
                    // Process of canceling ticket
                } else if (row_A[seatNum] == 1) {
                    System.out.println("Seat occupied\nThis ticket has been canceled");
                    row_A[seatNum] = 0;// Updating row array
                    for (int i = 0; i < ticket_list.size();i++){
                        Ticket ticketClass = ticket_list.get(i); // obtaining ticket list item
                        if(ticketClass.getSeat() == seatNum+1 && ticketClass.getRowNum() == rowNum){
                            ticket_list.remove(i);
                            break;
                        }
                    }
                } else {
                    System.out.println("Seat unoccupied");
                }
            }
            case "B" -> {
                // Obtaining and validating seat number
                while (true){
                    try {
                        System.out.print("Enter seat number (1-12):");
                        seatNum = input.nextInt()-1;
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
                if (seatNum < 0 || seatNum > 13) {
                    System.out.println("Invalid seat number\nPlease enter again below");
                    // Process of canceling ticket
                } else if (row_B[seatNum] == 1) {
                    System.out.println("Seat occupied\nThis ticket has been canceled");
                    row_B[seatNum] = 0;// Updating row array
                    for (int i = 0; i < ticket_list.size();i++){
                        Ticket ticketClass = ticket_list.get(i); // obtaining ticket list item
                        if(ticketClass.getSeat() == seatNum+1 && ticketClass.getRowNum() == rowNum){
                            ticket_list.remove(i);
                            break;
                        }
                    }
                } else {
                    System.out.println("Seat unoccupied");
                }
            }
            case "C" -> {
                // Obtaining and validating seat number
                while (true){
                    try {
                        System.out.print("Enter seat number (1-12):");
                        seatNum = input.nextInt()-1;
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
                if (seatNum < 0 || seatNum > 13) {
                    System.out.println("Invalid seat number\nPlease enter again below");
                    // Process of canceling ticket
                } else if (row_C[seatNum] == 1) {
                    System.out.println("Seat occupied\nThis ticket has been canceled");
                    row_C[seatNum] = 0;// Updating row array
                    for (int i = 0; i < ticket_list.size();i++){
                        Ticket ticketClass = ticket_list.get(i); // obtaining ticket list item
                        if(ticketClass.getSeat() == seatNum+1 && ticketClass.getRowNum() == rowNum){
                            ticket_list.remove(i);
                            break;
                        }
                    }
                } else {
                    System.out.println("Seat unoccupied");
                }
            }
            case "D" -> {
                // Obtaining and validating seat number
                while (true){
                    try {
                        System.out.print("Enter seat number (1-14):");
                        seatNum = input.nextInt()-1;
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
                if (seatNum < 0 || seatNum > 13) {
                    System.out.println("Invalid seat number\nPlease enter again below");
                    // Process of canceling ticket
                } else if (row_D[seatNum] == 1) {
                    System.out.println("Seat occupied\nThis ticket has been canceled");
                    row_D[seatNum] = 0;// Updating row array
                    for (int i = 0; i < ticket_list.size();i++){
                        Ticket ticketClass = ticket_list.get(i); // obtaining ticket list item
                        if(ticketClass.getSeat() == seatNum+1 && ticketClass.getRowNum() == rowNum){
                            ticket_list.remove(i);
                            break;
                        }
                    }
                } else {
                    System.out.println("Seat unoccupied");
                }
            }
            default -> System.out.println("Invalid row number");
        }
    }
    static void showAvailable(){

    }
    static void printSeatingArea(){
        // Row 1
        for (int x=0;x<=13;x++){
            // Declaring mark
            String mark;
            if (row_A[x]==0){
                mark = "O";
            }
            else{
                mark = "X";
            }
            System.out.print(" "+mark);
        }
        System.out.print("\n");
        // Row 2
        for (int x=0;x<=11;x++){
            // Declaring mark
            String mark;
            if (row_B[x]==0){
                mark = "O";
            }
            else{
                mark = "X";
            }
            System.out.print(" "+mark);
        }
        System.out.print("\n");
        // Row 3
        for (int x=0;x<=11;x++){
            // Declaring mark
            String mark;
            if (row_C[x]==0){
                mark = "O";
            }
            else{
                mark = "X";
            }
            System.out.print(" "+mark);
        }
        System.out.print("\n");
        // Row 4
        for (int x=0;x<=13;x++){
            // Declaring mark
            String mark;
            if (row_D[x]==0){
                mark = "O";
            }
            else{
                mark = "X";
            }
            System.out.print(" "+mark);
        }
        System.out.print("\n");
    }
    static void showInfo(){
        int totalPrice = 0;
        for(int i =0; i < ticket_list.size();i++) {
            System.out.println("\nTicket No: #"+(i+1));
            Ticket ticketClass = ticket_list.get(i); // the list item
            ticketClass.print();
            System.out.println("------------------------------");
            // getting the total price
            int price = ticketClass.getPrice();
            totalPrice = totalPrice + price;
        }
        System.out.println("\ntotal price is," + totalPrice); // printing the total price
    }
    static void search(){
        while(true){
            try{
                System.out.print("Enter row (A,B,C,D):");
                rowNum = input.next().toUpperCase();
                boolean isValid = false;
                for (String r : row) {
                    if (r.equals(rowNum)) {
                        isValid = true;
                        break;
                    }
                }
                if (!isValid) {
                    System.out.println("Invalid row number\nPlease enter again below");
                } else {
                    break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                input.nextLine();
            }
        }
        while (true){
            switch (rowNum){
                case "A" -> {
                    try {
                        System.out.print("Enter seat number (1-14):");
                        seatNum = input.nextInt()-1;
                        if (seatNum < 0 || seatNum > 13) {
                            System.out.println("Invalid seat number\nplease enter again below");
                        } else if (row_A[seatNum] == 0) {
                            System.out.println("This seat is available’");
                            return;
                        } else {
                            System.out.println("Seat occupied");
                            for (Ticket ticket : ticket_list) {
                                if (ticket.getRowNum().equals(rowNum) && ticket.getSeat() == seatNum + 1) {
                                    ticket.print();
                                }
                            }
                            return;
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
                case "B" -> {
                    try {
                        System.out.print("Enter seat number (1-12):");
                        seatNum = input.nextInt()-1;
                        if (seatNum < 0 || seatNum > 11) {
                            System.out.println("Invalid seat number\nplease enter again below");
                        } else if (row_B[seatNum] == 0) {
                            System.out.println("This seat is available’");
                            return;
                        } else {
                            System.out.println("Seat occupied");
                            for (Ticket ticket : ticket_list) {
                                if (ticket.getRowNum().equals(rowNum) && ticket.getSeat() == seatNum + 1) {
                                    ticket.print();
                                }
                            }
                            return;
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
                case "C" -> {
                    try {
                        System.out.print("Enter seat number (1-12):");
                        seatNum = input.nextInt()-1;
                        if (seatNum < 0 || seatNum > 11) {
                            System.out.println("Invalid seat number\nplease enter again below");
                        } else if (row_C[seatNum] == 0) {
                            System.out.println("This seat is available’");
                            return;

                        } else {
                            System.out.println("Seat occupied");
                            for (Ticket ticket : ticket_list) {
                                if (ticket.getRowNum().equals(rowNum) && ticket.getSeat() == seatNum + 1) {
                                    ticket.print();
                                }
                            }
                            return;
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
                case "D" -> {
                    try {
                        System.out.print("Enter seat number (1-14):");
                        seatNum = input.nextInt()-1;
                        if (seatNum < 0 || seatNum > 13) {
                            System.out.println("Invalid seat number\nplease enter again below");
                        } else if (row_D[seatNum] == 0) {
                            System.out.println("This seat is available’");
                            return;

                        } else {
                            System.out.println("Seat occupied");
                            for (Ticket ticket : ticket_list) {
                                if (ticket.getRowNum().equals(rowNum) && ticket.getSeat() == seatNum + 1) {
                                    ticket.print();
                                }
                            }
                            return;
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println("You have entered an invalid input\nPlease note that you can only enter integer values");
                        input.nextLine();
                    }
                }
            }
        }
    }
    static void save(){

    }
}
