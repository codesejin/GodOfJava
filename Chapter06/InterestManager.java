package lang.thegodofjava.Chapter06;

public class InterestManager {

    public static void main(String[] args) {

        InterestManager interestManager = new InterestManager();

//        for (int day = 1; day <= 365; day++) {
//            double amount = interestManager.calculateAmount(day, 1000000);
//            System.out.println("day = " + day + " amount = " + amount);
//            if (day % 20 == 0) System.out.println();
//        }

        for (int day = 10; day <= 365; day+=10) {
            double amount = interestManager.calculateAmount(day, 1000000);
            System.out.println("day = " + day + " amount = " + amount);
        }
    }

    public double getInterestRate(int day) {
        if (day <= 90) {
            return 0.5;
        } else if (day > 90 && day <= 180) {
            return 1.0;
        } else if (day > 180 && day <= 364) {
            return 2.0;
        } else {
            return 5.6;
        }
    }

    // 예치기간, 예치금액을 매개변수로 받아 계산금액 (예치금 + 이자)
    public double calculateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);
        double interest = amount * (interestRate / 100.0);
        return amount + interest;
    }
}
