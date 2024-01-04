package lang.thegodofjava.Chapter13.study;

import lang.thegodofjava.Chapter13.study.model.MemberDTO;

public interface MemberManager {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
