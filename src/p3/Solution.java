package p3;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) {
    	String s = "<a href=\"test\">Spaceship</a> </a>";
    	String str[] = s.split("/a");
    	System.out.println(str[0]);
    	System.out.println(str[1]);
    	System.out.println(str[2]);
    }
}