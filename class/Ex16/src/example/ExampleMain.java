package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleMain {
    public static void main(String[] args) {
        List<Member> list1 = Arrays.asList(
                new Member("1", "defaultName01", 30),
                new Member("2", "defaultName02",20),
                new Member("3", "defaultName03", 10));

        ArrayList<Member> list2 = new ArrayList<>();
        for(Member member : list1) {
            if(member.getAge() < 35) {
                list2.add(member);
            }
        }

        for (Member member : list2) {
            System.out.println(member);
        }
    }
}
