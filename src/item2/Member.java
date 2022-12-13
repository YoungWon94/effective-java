package item2;

/**
 * 점층적 생성자 패턴
 */
public class Member {
    private String id;       //아이디   필수
    private String password; //비밀번호  필수
    private String name;     //이름     선택
    private String gender;   //성별     선택
    private String email;    //이메일    선택

    //필수 매개변수만 있는 생성자
    public Member(String id, String password) {
        this(id, password, null, null, null);
    }
    //선택 매개변수 name 추가된 생성자
    public Member(String id, String password, String name) {
        this(id, password, name, null, null);
    }
    //선택 매개변수 name, gender 추가된 생성자
    public Member(String id, String password, String name, String gender) {
        this(id, password, name, gender, null);
    }
    //선택 매개변수 name, gender, email 추가된 생성자
    public Member(String id, String password, String name, String gender, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.email = email;
    }
}