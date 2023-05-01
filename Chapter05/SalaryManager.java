package lang.thegodofjava.Chapter05;

/**
아래 코드는 SalaryManager 클래스의 getMonthlySalary 메소드를 이용해 연봉을 월급으로 변환하는 예제 코드입니다.

하지만 해당 예제 코드에서는 getMonthlySalary 메소드를 static으로 선언하여 객체를 생성하지 않고 메소드를 바로 사용하도록 구현되어 있습니다.
따라서 calculateTax, calculateNationalPension, calculateHealthInsurance와 같은 보조 메소드도 모두 static으로 선언되어 있습니다.

반면, 주석 처리된 코드에서는 getMonthlySalary 메소드와 보조 메소드들이 모두 인스턴스 메소드로 선언되어 있으며,
SalaryManager 객체를 생성하여 메소드를 호출하도록 구현되어 있습니다.

즉, 주석 처리된 코드는 객체 지향적인 방식으로 구현되어 있으며, 객체를 생성하여 해당 객체의 메소드를 호출하는 방식으로 동작합니다.
반면, 원본 코드는 객체 지향적인 개념을 반영하지 않고, static 메소드를 사용하여 구현되어 있습니다.

따라서 객체 지향적인 방식으로 코드를 작성하고자 한다면,
주석 처리된 코드와 같이 SalaryManager 객체를 생성하여 메소드를 호출하는 방식으로 구현하는 것이 더 적절할 것입니다.

1. 정적 메서드(static method)
 - 객체 지향적이지 않은 방식으로, 클래스를 통해 직접 호출합니다.
 - 객체를 생성하지 않아도 바로 사용 가능합니다.
 - 클래스의 인스턴스 변수를 사용하지 않는 경우에 사용합니다.
 - 메모리 절약을 위해 사용할 수 있습니다.

2. 인스턴스 메서드(instance method)
 - 객체 지향적인 방식으로, 인스턴스를 생성하고 해당 인스턴스의 메서드를 호출합니다.
 - 인스턴스 변수를 사용하기 때문에, 메서드 호출 전에 인스턴스가 생성되어 있어야 합니다.
 - 인스턴스 변수를 사용하기 때문에, 메서드를 호출하기 전에 인스턴스 변수의 값이 존재해야 합니다.
 - 객체 지향적인 설계를 할 때 주로 사용합니다.
*/

public class SalaryManager {

    public static void main(String[] args) {

        int yearlySalary = 20000000;

        double monthlySalary = getMonthlySalary(yearlySalary);

        System.out.println("Real monthlySalary = " + monthlySalary);
    }

    public static double getMonthlySalary(int yearlySalary) {

        double monthSalary = yearlySalary / 12.0;
        System.out.println("Monthly salary original = " + monthSalary);

        double tax = calculateTax(monthSalary);
        double nationalPension = calculateNationalPension(monthSalary);
        double healthInsurance = calculateHealthInsurance(monthSalary);
        double total = tax + nationalPension + healthInsurance;

        System.out.println("tax per month = " + tax);
        System.out.println("nationalPension per month = " + nationalPension);
        System.out.println("healthInsurance per month = " + healthInsurance);


        monthSalary -= total;

        return monthSalary;
    }

    // 근로소득세
    public static double calculateTax(double monthSalary) {
        return monthSalary * (12.5 / 100);
    }

    // 국민연금
    public static double calculateNationalPension(double monthSalary) {
        return monthSalary * (8.1 / 100);
    }

    // 건강보험료
    public static double calculateHealthInsurance(double monthSalary) {
        return monthSalary * (13.5 / 100);
    }

}
/**
 * 나는 객체 생성을 안하고 static 함수로 만들어서 사용했는데, 뭐가 다른지 확인 필요
 */

//public class SalaryManager {
//
//    public static void main(String[] args) {
//        SalaryManager manager=new SalaryManager();
//        System.out.println("Real monthlySalary:"+manager.getMonthlySalary(20000000));
//    }
//
//    public double getMonthlySalary(int yearlySalary) {
//        double monthlySalary=yearlySalary/12.0;
//        System.out.println("Monthly salary original:"+monthlySalary);
//
//        double tax=calculateTax(monthlySalary);
//        double nationalPension=calculateNationalPension(monthlySalary);
//        double healthInsurance=calculateHealthInsurance(monthlySalary);
//        double minusTotal=tax+nationalPension+healthInsurance;
//
//        System.out.println("Tax per month:"+tax);
//        System.out.println("NationalPension per month:"+nationalPension);
//        System.out.println("HealthInsurance per month:"+healthInsurance);
//
//        monthlySalary-=minusTotal;
//
//        return monthlySalary;
//    }
//    public double calculateTax(double monthlySalary) {
//        double tax=monthlySalary*(12.5/100);
//        return tax;
//    }
//    public double calculateNationalPension(double monthlySalary) {
//        double nationalPension=monthlySalary*(8.1/100);
//        return nationalPension;
//    }
//    public double calculateHealthInsurance(double monthlySalary) {
//        double healthInsurance=monthlySalary*(13.5/100);
//        return healthInsurance;
//    }
//}
