package lang.thegodofjava.Chapter13.study;

public class OverTimeManager {
    public int getOverTimeAmount(OverTimeValues value) {
        int amount = 0;
        System.out.println(value);
        switch (value) {
            case THREE_HOUR :
                amount=getRemoteValue("THREE_HOUR");
                break;
            case FIVE_HOUR :
                amount=getRemoteValue("FIVE_HOUR");
                break;
            case WEEKEND_FOUR_HOUR:
                amount=getRemoteValue("WEEKEND_FOUR_HOUR");
                break;
            case WEEKEND_EIGHT_HOUR:
                amount=getRemoteValue("WEEKEND_EIGHT_HOUR");
                break;
        }
        return amount;
    }

    private static int getRemoteValue(String key) {
        // 원격 서버에서 값을 읽어오는 로직 추가
        // 예: HTTP 요청 등
        return 2000; // 임시로 고정된 값
    }

    public static void main(String[] args) {
        OverTimeManager manager = new OverTimeManager();
        OverTimeValues value = OverTimeValues.THREE_HOUR;
        int myAmount = manager.getOverTimeAmount(value);
        System.out.println(myAmount);
    }
}
