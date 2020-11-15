package Task_4;

import java.util.ArrayList;
import java.util.List;

public class StringFunctionMain {
    public static void main(String[] args) {


        char[] chars = {'a', 'b', 'c', 'd', 'l', 'p'};
        String s = new String(chars, 1, 3);
        System.out.println(s.length());
        System.out.println(s);
        System.out.println("-----------------");

        byte[] ascii = {65, 66, 67, 68, 69};
        String s1 = new String(ascii);
        String s2 = new String(ascii, 2, 3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("-----------------");

        String s3 = new String("abc");
        String s4 = "abc";
        System.out.println(s3.intern().equals(s4));
        System.out.println("-----------------");

        System.out.println("adsad" + 2 * 2 + 2);
        System.out.println("-----------------");

        char ch = "asd".charAt(1);
        System.out.println(ch);
        ch = "asd".charAt(2);
        System.out.println(ch);
        System.out.println("-----------------");

        String s5 = "ArmeniaAndArtsakh";
        int findex = 3;
        int lindex = 8;
        char[] buf = new char[lindex - findex];
        s5.getChars(findex, lindex, buf, 0);
        System.out.println(buf);
        System.out.println("-----------------");

        int start = 2;
        int end = 5;
        byte[] buf1 = new byte[end - start];
        s5.getBytes(start, end, buf1, 0);
        for (int i = 0; i < buf1.length; i++) {
            System.out.println(buf1[i]);
        }
        char[] s6 = s5.toCharArray();
        System.out.println(s6[5]);
        System.out.println("-----------------");

        int[] x = {5};
        List<Integer> l = new ArrayList<>();
        l.add(5);
        System.out.println(x[0] == l.get(0));
        System.out.println("-----------------");

        char a = 'a';
        String b = "a";
        System.out.println(a == b.charAt(0));
        System.out.println("-----------------");

        String s7 = "Abcd";
        String s8 = "abcd";
        String s9 = "Abcd";
        String s10 = "abcd";
        System.out.println(s7.equals(s8));
        System.out.println(s7.equals(s9));
        System.out.println(s8.equals(s10));
        System.out.println(s7.equalsIgnoreCase(s9));
        System.out.println("-----------------");


        String s11 = "abcDEFgrt";
        String s12 = "asxacDEfklj";
        System.out.println(s11.regionMatches(true, 2, s12, 4, 4));
        System.out.println("-----------------");


        String s13 = "Foobar";
        System.out.println(s13.endsWith("bar"));
        System.out.println(s13.startsWith("Foo"));
        System.out.println(s13.startsWith("Fbar"));
        System.out.println(s13.startsWith("bar", 3));
        System.out.println("-----------------");


        String s14 = "abdc";
        String s15 = "abcd";
        System.out.println(s14.compareTo(s15));
        System.out.println("-----------------");

        String[] z = {"hi", "armenia", "hay", "HAY", "hello", "world", "win"};
        for (int i = 0; i < z.length; i++) {
            for (int j = i + 1; j < z.length; j++) {
                if (z[j].compareTo(z[i]) < 0) {
                    String temp = z[j];
                    z[j] = z[i];
                    z[i] = temp;

                }
            }
            System.out.println(z[i]);
        }
        System.out.println("-----------------");


        String s16 = "I am a table aty boxk u tvse exatv";
        System.out.println(s16.indexOf('t', 8));
        System.out.println(s16.lastIndexOf('t', 10));
        System.out.println("-----------------");

        String org = "This is a text. This is a too";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;

        do {
            System.out.println(org);
            i = org.indexOf(search);
            System.out.println(i);
            if (i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }
        } while (i != -1);
        System.out.println("-----------------------");


        String s17 = "one";
        String s18 = "two";
        System.out.println(s17.concat(s18));
        System.out.println("-----------------------");


        String s19 = "Hello" .replace( 'l', 'w');
        System.out.println(s19);
        String t = "eww";
        String t1 = "eee";
        s19 = s19.replace(t,t1);
        System.out.println(s19);
        System.out.println("-----------------------");


        String s20 = "    sds dsa   ";
        System.out.println(s20);
        System.out.println(s20.trim());
        System.out.println("-----------------------");


        int i1 = 21;
        String s21 = String.valueOf(i1);
        System.out.println(s21);
        String s22 = "22";
        int i2 = Integer.valueOf(s22);
        System.out.println(i2);
        System.out.println("-----------------------");


        String s23 = "AddVdsfDD";
        System.out.println(s23.toLowerCase());
        System.out.println(s23.toUpperCase());
        System.out.println("-----------------------");


        String s24 = String.join(": ", "Firtsname is", "Arpi");
        System.out.println(s24);
        System.out.println("-----------------------");


        String s25 = "ADAS SDSA ASD ASF";
        String[] s26 = s25.split("A");
        for(int p = 0; p < s26.length; p++){
            System.out.println(s26[p]);
        }
        System.out.println("-----------------------");


        StringBuffer s27 = new StringBuffer("Hello");
        System.out.println(s27.length());
        System.out.println(s27.capacity());
        s27.setLength(2);
        System.out.println(s27);
        System.out.println("-----------------------");


        StringBuffer s28 = new StringBuffer("Armenians");
        System.out.println(s28);
        s28.setCharAt(3,'a');
        s28.setLength(4);
        System.out.println(s28);
        System.out.println("-----------------------");


        StringBuffer s29 = new StringBuffer("Axlcxl");
        char[] ch1 = new char[3 - 1];
        s29.getChars(1,3, ch1,0);
        System.out.println(ch1);
        System.out.println("-----------------------");


        StringBuffer s30 = new StringBuffer("Artsakh");
        s30.append(" is ").append(" Armenia ").append("!");
        System.out.println(s30);
        System.out.println("-----------------------");


        StringBuffer s31 =new StringBuffer("I java");
        s31.insert(2,"like ");
        System.out.println(s31);
        System.out.println("-----------------------");


        StringBuffer s32 = new StringBuffer("Office");
        System.out.println(s32.reverse());
        System.out.println("-----------------------");


        StringBuffer s33 = new StringBuffer("Abovyan");
        System.out.println(s33.deleteCharAt(6));
        System.out.println(s33.delete(3,6));



    }
}
