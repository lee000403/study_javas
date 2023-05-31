

public class ClassFirsts {
    public int second = 0;
    ClassFirsts() {
        // this 는 클래스 내부 어딘가에 변수가 있다고 함수에서 호출할때 가능하다.
        System.out.println();
    }
    ClassFirsts(int first) { // 파라미터 값을 넣어주는 순간 같은 클래스 내에더라도 같은 함수 이름을 사용 할 수 있다.
        this.second = first;
        System.out.println(second); // 이것이 오버라이드이다.
    }
    public int getSecond() { // get에는 가져오기 때문에 파라미터가 필요없다. return 할때는 this를 사용해야한다.
        return this.second;
    }
}
