public class Ticket {
    private String rowNum;
    private int seat;
    private int price;
    private Person person;

    public Ticket(String rowNum, int seat, int price, Person person) {
        this.rowNum = rowNum;
        this.seat = seat + 1;
        this.price = price;
        this.person = person;
    }

    public String getRowNum() {
        return rowNum;
    }

    public int getSeat() {
        return seat;
    }

    public int getPrice() {
        return price;
    }

    public Person getPerson() {
        return person;
    }

    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void print(){
        System.out.println("name :"+ person.getName()+" "+ person.getSurname()+"\nmail :"+ person.getEmail());
        System.out.println("seat location(row-seat) :"+getRowNum()+"-"+getSeat());
        System.out.println("seat price :"+getPrice());
    }
}
