package oh29oh29.study02;

/**
 * 헤당 클래스는 enum 으로 typesafe 함을 확인해보기 위해 작성되었다.
 * */
public class Constants {

    enum Upper {
        A, B, C;
    }

    enum Lower {
        A, B, C;
    }

    public void print(Upper type) {
        switch (type) {
            case A:
                System.out.println("This is Upper A");
                break;
            case B:
                System.out.println("This is Upper B");
                break;
            case C:
                System.out.println("This is Upper C");
                break;
        }
    }

    public static void main(String[] args) {
        Constants constants = new Constants();
        constants.print(Upper.A);
    }
}
