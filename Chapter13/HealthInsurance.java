package lang.thegodofjava.Chapter13;

public enum HealthInsurance {

    LEVEL_ONE(1000, 1.0f),

    LEVEL_TWO(2000, 2.0f),

    LEVEL_THREE(3000, 3.2f),

    LEVEL_FOUR(4000, 4.5f),

    LEVEL_FIVE(5000, 5.6f),

    LEVEL_SIX(6000, 7.1f);

    private final int maxSalary;

    private final float ratio;

    HealthInsurance(int maxSalary, float ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public float getRatio() {
        return ratio;
    }

//    public static HealthInsurance getHealthInsurance(int salary) {
//        if(salary<1000) {
//            return LEVEL_ONE;
//        } else if(salary<2000) {
//            return LEVEL_TWO;
//        } else if(salary<3000) {
//            return LEVEL_THREE;
//        } else if(salary<4000) {
//            return LEVEL_FOUR;
//        } else if(salary<5000) {
//            return LEVEL_FIVE;
//        } else {
//            return LEVEL_SIX;
//        }
//    }
    // 위의 코드보다 더 깔끔함
    public static HealthInsurance getHealthInsurance(int salary) {
        for (HealthInsurance insurance : HealthInsurance.values()) {
            if (salary < insurance.maxSalary) {
                return insurance;
            }
        }
        // 기본적으로 LEVEL_ONE을 리턴하거나 예외 처리 등을 추가할 수 있음
        return LEVEL_ONE;
    }

    public static void  main(String []args) {
        int salaryArray[]=new int[]{1500,5500,8000};
        HealthInsurance[] insurances=new HealthInsurance[3];
        insurances[0]=HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurances[1]=HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurances[2]=HealthInsurance.getHealthInsurance(salaryArray[2]);

        for(int loop=0;loop<3;loop++) {
            System.out.println(salaryArray[loop]+"= "+insurances[loop]+", "+insurances[loop].getRatio());
        }
    }
}
