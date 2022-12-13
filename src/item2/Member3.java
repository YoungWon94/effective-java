package item2;

/**
 * 빌더 패턴
 */
public class Member3 {
    private String id;       //아이디   필수
    private String password; //비밀번호  필수
    private String name;     //이름     선택
    private String gender;   //성별     선택
    private String email;    //이메일    선택

    //빌더 클래스
    public static class Builder {
        //필수 매개변수
        private String id;
        private String password;
        //선택 매개변수
        private String name;
        private String gender;
        private String email;

        //필수 매개변수를 받는 생성자
        public Builder(String id, String password) {
            this.id = id;
            this.password = password;
        }

        //선택 매개변수 설정(setter) 메서드
        public Builder name(String val) { this.name = val; return this; }
        public Builder gender(String val) { this.gender = val; return this; }
        public Builder email(String val) { this.email = val; return this; }

        //빌드 메서드
        public Member3 build() {
            return new Member3(this);
        }
    }

    //Member 클래스 생성자
    private Member3(Builder builder) {
        id = builder.id;
        password = builder.password;
        name = builder.name;
        gender = builder.gender;
        email = builder.email;
    }

    //정적 팩토리로 빌더를 반환하면 new 연산자 없이 빌더 객체를 얻을 수 있다.
    public static Builder builder(String id, String password) {
        return new Member3.Builder(id, password);
    }

}