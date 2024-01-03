package lang.thegodofjava.Chapter12.study;

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
        MemberDTO memberDTO = new MemberDTO("gildong","1234-1234","gildong@naver.com");
        System.out.println(memberDTO.toString());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof MemberDTO memberDTO)) return false;
//        return Objects.equals(name, memberDTO.name) && Objects.equals(phone, memberDTO.phone) && Objects.equals(email, memberDTO.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, phone, email);
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass())  return false;

        MemberDTO other = (MemberDTO) obj;

        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;

        if (phone == null) {
            if (other.phone != null) return false;
        } else if (!phone.equals(other.phone)) return false;

        if (email == null) {
            if (other.email != null) return false;
        } else if (!email.equals(other.email)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (((name == null)) ? 0 : name.hashCode());
        result = prime * result + (((phone == null)) ? 0 : phone.hashCode());
        result = prime * result + (((email == null)) ? 0 : email.hashCode());
        return result;
    }
}
