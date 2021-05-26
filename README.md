# Java Enumeration

열거형은 상수 그룹을 나타내는 목적으로 사용된다.  
열거형 상수 집합이 항상 고정된 상태로 유지 될 필요는 없다.  
Java 에서는 변수, 메서드 및 생성자를 추가할 수도 있다. enum 의 주요 목적은 데이터 유형을 정의하는 것이다.

enum 키워드는 Java 5 부터 도입되었다.  
enum 으로 정의된 상수는 코드를 더 일기 쉽게 만들고 컴파일 타임 검사를 허용하며, 허용된 값 목록을 미리 문서화하고 잘못된 값이 전달되어 예기치 않은 동작을 방지할 수 있다.

enum 선언은 클래스 외부 또는 클래스 내부에서 할 수 있지만 메서드 내부에서는 할 수 없다.

```java
enum Color {
    RED, GREEN, BLUE;
}
```

## values() 와 valueOf()

이러한 메서드는 `java.lang.Enum` 에 존재한다.  
values() 메서드는 enum 내에 있는 모든 값을 알고 싶을 때 사용할 수 있다. 
valueOf() 메서드는 지정된 문자열 값과 일치하는 열거형 상수가 존재할 경우 반환한다.  

## Enum and Inheritance

모든 열거형은 암시적으로 `java.lang.Enum` 클래스를 상속한다.  
클래스는 Java 에서 하나의 부모 클래스만 상속할 수 있으므로 열거형은 다른 클래스를 상속할 수 없다.

<hr>

#### References

> 웹 문서
> - [geeksforgeeks | enum in Java](https://www.geeksforgeeks.org/enum-in-java/)
> - [geeksforgeeks | Enum with Customized Value in Java](https://www.geeksforgeeks.org/enum-customized-value-java/)
> - [baeldung | A Guide to Java Enums](https://www.baeldung.com/a-guide-to-java-enums)
> - [baeldung | Attaching Values to Java Enum](https://www.baeldung.com/java-enum-values)