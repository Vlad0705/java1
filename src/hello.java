/**
 * Created by nadezhda on 31.03.18.
 */
package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class hello {

    public static void main(String[] args) {
        String[] name;
        name = new String[20];
        name[0] = "Sam";
        name[1] = "Kate";
        name[2] = "Albert";
        name[3] = "Fred";
        name[4] = "Eric";
        name[5] = "Francis";
        name[6] = "Kevin";
        name[7] = "Natalie";
        name[8] = "Philip";
        name[9] = "Taylor";
        name[10] = "Zoe";
        name[11] = "Harry";
        name[12] = "Ron";
        name[13] = "Isabel";
        name[14] = "Helen";
        name[15] = "Harold";
        name[16] = "Adelina";
        name[17] = "Ashton";
        name[18] = "Brian";
        name[19] = "Carl";
        for (String namee : name) {
            System.out.println(namee);
        }
    }
}
    /* public static void main(String[] args) {
        ArrayList<String> surname=new ArrayList<String>();
        surname.add("Smith");
        surname.add("Johnson");
        surname.add("Williams");
        surname.add("Jones");
        surname.add("Brown");
        surname.add("Davies");
        surname.add("Miller");
        surname.add("Wilson");
        surname.add("Moore");
        surname.add("Taylor");
        for(String name:surname){
            System.out.println(name);
        }
        public static void main(String[] args) {
        HashSet<String> Patronymic= new HashSet<String>();
        Patronymic.add("Glebovna");
        Patronymic.add("Denisovich");
        Patronymic.add("Alekseyevna");
        Patronymic.add("Georgiyevich");
        Patronymic.add("Filippovich");
        Patronymic.add("Arsenyevna");
        Patronymic.add("Arturovich");
        Patronymic.add("Feliksovna");
        Patronymic.add("Eduardovna");
        Patronymic.add("Igorevich");
        Patronymic.add("Danilovna");
        Patronymic.add("Antonovna");
        Patronymic.add("Aleksandrovich");
        Patronymic.add("Borisovna");
        Patronymic.add("Anatolyevich");
        for(String name:Patronymic){
            System.out.println(name);
        }
        public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(30, 5);
        hashMap.put(45, 27);
        hashMap.put(27, 3);
        hashMap.put(18, 1);
        hashMap.put(55, 30);
        hashMap.put(36, 18);
        hashMap.put(33, 8);
        Set<Map.Entry<Integer, Integer>> set = hashMap.entrySet();
        for (Map.Entry<Integer, Integer> me : set) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        public static void main(String[] args) {
        int [] number1;
            number1= new int[10];
            number1[0]=4;
            number1[1]=9;
            number1[2]=0;
            number1[3]=2;
            number1[4]=5;
            number1[5]=1;
            number1[6]=8;
            number1[7]=3;
            number1[8]=11;
            number1[9]=16;
        int [] number2;
            number2=new int[7];
            number2[0]=14;
            number2[1]=10;
            number2[2]=6;
            number2[3]=7;
            number2[4]=43;
            number2[5]=3;
            number2[6]=7;
        for (int i = 0; i < 100; i++) {
    }
}


