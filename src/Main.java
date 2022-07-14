public class Main {
    public static void main(String[] args) {
        BankAccount person=new BankAccount();
        person.deposit(20000);
        System.out.println(person.getAmount());
        while (true){
            try {
                person.withDraw(6000);
                System.out.println(person.getAmount());
            } catch (LimitException e) {
                try {
                    person.withDraw((int) person.getAmount());
                    System.out.println(person.getAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                break;
            }
        }
    }
}