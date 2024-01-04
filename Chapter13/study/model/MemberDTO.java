package lang.thegodofjava.Chapter13.study.model;


import java.util.Objects;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;
    // 아무 정보도 모를 때
    public MemberDTO() {
    }
    // 이름만 알 때
    public MemberDTO(String name) {
        this.name=name;
    }
    // 이름과 전화번호만만 알 때
    public MemberDTO(String name, String phone) {
        this.name=name;
        this.phone=phone;
    }

    public MemberDTO(String name, String phone, String email) {
        this.name=name;
        this.phone=phone;
        this.email=email;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        lang.thegodofjava.Chapter12.study.MemberDTO memberDTO = new lang.thegodofjava.Chapter12.study.MemberDTO("gildong","1234-1234","gildong@naver.com");
        System.out.println(memberDTO.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberDTO memberDTO)) return false;
        return Objects.equals(name, memberDTO.name) && Objects.equals(phone, memberDTO.phone) && Objects.equals(email, memberDTO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }

}
