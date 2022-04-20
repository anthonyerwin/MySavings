
public class PiggyBank {

    double balance;

    // 1, total
    public void showTotal() {
        System.out.println("Balance : " + this.balance + "\n");
    }

    // 2,3,4,5
    public void addBank(int choice) {
        switch(choice){
            case 2->{ //penny
                this.balance += 0.01;
            }
            case 3 ->{//nickel
                this.balance += 0.05;
            }
            case 4->{
                this.balance += 0.10;
            }
            case 5->{
                this.balance += 0.25;
            }
            default->{
                System.out.println("System error.");
            }
        }
    }
}
