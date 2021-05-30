package oh29oh29.study01;

/**
 * 헤당 클래스는 final 상수를 사용할 때 문제점을 확인해보기 위해 작성되었다.
 * */
public class Constants {
    private final static int UPPER_A = 0;
    private final static int UPPER_B = 1;
    private final static int UPPER_C = 2;

    private final static int LOWER_A = 0;
    private final static int LOWER_B = 1;
    private final static int LOWER_C = 2;

    public void print(int type) {
        switch (type) {
            case UPPER_A:
                System.out.println("This is Upper A");
                break;
            case UPPER_B:
                System.out.println("This is Upper B");
                break;
            case UPPER_C:
                System.out.println("This is Upper C");
                break;
        }
    }

    public static void main(String[] args) {
        Constants constants = new Constants();
        constants.print(LOWER_A);
    }
}
