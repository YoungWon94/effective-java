package item2;

public class _Main {
    public static void main(String[] args) {

        /* 자바빈즈 패턴으로 객체 생성 */
        Member2 member2 = new Member2();
        member2.setId("choi94");
        member2.setPassword("1234");
        member2.setEmail("choi94@naver.com");

        /* 빌더 패턴으로 객체 생성 */
        Member3 member3 = new Member3.Builder("choi94", "1234")
                .name("yw")
                .gender("M")
                .email("choi94@naver.com")
                .build();

        //new 연산자 없이 빌더 객체 사용하기
        Member3 member3_1 = Member3.builder("choi94", "1234")
                .name("yw")
                .gender("M")
                .email("choi94@naver.com")
                .build();


    }
}
