package lesson2.task4;

import java.util.Arrays;

public class TwoString {


    public static void main(String[] args) {
        String a = "world";
        String b = "hello";
        String result = "";
        char[] list1 = a.toCharArray();
        Arrays.sort(list1);
        // String.valueOf(list1[i]);
        // char[] list2 = b.toCharArray();
        for (char ch : list1) {
            if (result.contains(String.valueOf(ch)))
                continue;
            if (b.contains(String.valueOf(ch)))
                result += ch;


        }
        System.out.println(result);
    }
}


   /*  for (int i = 0; i < list1.length; i++) {
            if (result.contains(String.valueOf(list1[i])))
                continue;

            if(b.contains(String.valueOf(list2[])))

        }
       */