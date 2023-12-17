import java.util.Objects;

public class Lab7 {

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        HashSet<String> set3 = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            String number = Integer.toString(i);
            set1.add(number);
            if(i <= 7){
                set2.add(number);
            }
            if(i <= 10 && i >=5){
                set3.add(number);
            }
        }

        System.out.println();
        System.out.println("Set1 : " + set1.showSet());
        System.out.println("Set2 : " + set2.showSet());
        System.out.println("Set3 : " + set3.showSet());
        System.out.println();
        System.out.println("Set1 contains All Set2 ? : " + set1.containsAll(set2));
        System.out.println("Set1 contains All Set3 ? : " + set1.containsAll(set3));
        System.out.println("Set2 contains All Set1 ? : " + set2.containsAll(set1));
        System.out.println("Set2 contains All Set3 ? : " + set2.containsAll(set3));
        System.out.println("Set3 contains All Set1 ? : " + set3.containsAll(set1));
        System.out.println("Set3 contains All Set2 ? : " + set3.containsAll(set2));

        System.out.println();
        set1.addAll(set2);
        System.out.println("Set1 addAll Set2 ");
        System.out.println("Now Set1 is : " + set1.showSet());
        System.out.println("Now Set2 is : " + set2.showSet());
        System.out.println("Now Set3 is : " + set3.showSet());
        System.out.println();
        set2.addAll(set3);
        System.out.println("Set2 addAll Set3 ");
        System.out.println("Now Set1 is : " + set1.showSet());
        System.out.println("Now Set2 is : " + set2.showSet());
        System.out.println("Now Set3 is : " + set3.showSet());


        System.out.println();
        set2.removeAll(set3);
        System.out.println("Set2 removeAll Set3 ");
        System.out.println("Now Set1 is : " + set1.showSet());
        System.out.println("Now Set2 is : " + set2.showSet());
        System.out.println("Now Set3 is : " + set3.showSet());
        System.out.println();
        set1.retainAll(set2);
        System.out.println("Set1 retainAll Set2 ");
        System.out.println("Now Set1 is : " + set1.showSet());
        System.out.println("Now Set2 is : " + set2.showSet());
        System.out.println("Now Set3 is : " + set3.showSet());
        System.out.println();
        set3.retainAll(set2);
        System.out.println("Set3 retainAll Set2 ");
        System.out.println("Now Set1 is : " + set1.showSet());
        System.out.println("Now Set2 is : " + set2.showSet());
        System.out.println("Now Set3 is : " + set3.showSet());
        System.out.println();
    }
}
