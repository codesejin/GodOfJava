package lang.thegodofjava.Chapter13.study;

import lang.thegodofjava.Chapter13.study.model.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void main(String[] args) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }

    private void checkDTO() {
        System.out.println(dto);
//        dto=new MemberDTO();
        dto.name = "sejin";
        System.out.println(dto);
    }
}
