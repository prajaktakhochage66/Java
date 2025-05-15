package Exp5;

public class Member {
    private final String name;
    private final int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayMemberDetails() {
        System.out.println("\n--- Member Details ---");
        System.out.println("Name      : " + name);
        System.out.println("Member ID : " + memberId);
    }
}
