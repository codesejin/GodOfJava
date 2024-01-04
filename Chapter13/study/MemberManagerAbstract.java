package lang.thegodofjava.Chapter13.study;

import lang.thegodofjava.Chapter13.study.model.MemberDTO;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDTO member);

    public void printLog(String data) {
        System.out.println("Data="+data);
    }
}
