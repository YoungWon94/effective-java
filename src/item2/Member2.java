package item2;

/**
 * 자바빈즈 패턴
 */
public class Member2 {
    private String id;       //아이디   필수
    private String password; //비밀번호  필수
    private String name;     //이름     선택
    private String gender;   //성별     선택
    private String email;    //이메일    선택

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

