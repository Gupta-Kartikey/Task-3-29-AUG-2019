package task3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTask {

	public static void ques1() {
		int g = 0;
		int y = 0;
		int f = 0;
		String emails[] = { "abc@gmail.com", "abd@gmail.com", "abe@yahoo.com", "abf@yahoo.com", "abg@yahoo.com",
				"abh@fb.com", "abi@fb.com" };
		for (int i = 0; i < (emails.length); i++) {
			if (emails[i].indexOf("@gmail.com") > 0) {
				g++;
			} else if (emails[i].indexOf("@yahoo.com") > 0) {
				y++;
			} else if (emails[i].indexOf("@fb.com") > 0) {
				f++;
			}

		}
		System.out.println("gmail account are:- " + g);
		System.out.println("yahoo account are:- " + y);
		System.out.println("fb account are:- " + f);
	}

	public static void ques2() {
		int cs = 0, it = 0, me = 0, ce = 0;
		String rnos[] = { "12345", "34567", "56789", "78901", "34572", "78953", "12876", "12456", "56341" };

		for (int i = 0; i < rnos.length; i++) {
			if (rnos[i].startsWith("12")) {
				cs++;
			} else if (rnos[i].startsWith("34")) {
				it++;
			} else if (rnos[i].startsWith("56")) {
				me++;
			} else if (rnos[i].startsWith("78")) {
				ce++;
			}
		}
		System.out.println("Computer science students are:- " + cs);
		System.out.println("IT students are:- " + it);
		System.out.println("Mechanical students are:- " + me);
		System.out.println("Civil students are:- " + ce);
	}

	public static void ques3() {
		String s[] = { "bhopal", "agra", "mumbai", "chennai", "pune", "delhi" };

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length - 1; j++) {
				if (s[i].compareToIgnoreCase(s[j]) > 0) {
					String t = s[i];
					s[i] = s[j];
					s[j] = t;
				}
			}

		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	public static void ques4() {
		String s = "This is java , java is a good language i love java, i am notso good at java but will get better at java ";
		int java = 0, j = 0;
		for (int i = 0; j >= 0; i++) {
			if (s.indexOf("java") >= 0) {
				java++;
				j = s.indexOf("java", j + 1);
			}
		}
		System.out.println("No. of java is:- " + java);
	}

	public static void ques5() {
		String s = "abcvfdcba";
		int j = s.length();
		int k = j, flag = 0;
		for (int i = 0; (j / 2) > i; i++) {
			k--;
			if (s.charAt(i) == s.charAt(k)) {
			} else {
				flag++;
			}
		}
		if (flag > 0) {
			System.out.println("String is not pallandrom");
		} else {
			System.out.println("string is a pallandrom");
		}

	}

	public static void ques6() {
		StringBuffer sb = new StringBuffer("abffcba");
		if (sb.toString().equals(sb.reverse().toString())) {
			System.out.println("String is a pallandrom");
		} else
			System.out.println("String is not pallandrom");

	}

	public static void ques7() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int s = 0, c = 0, d = 0, sy = 0, sp = 0;
		for (int i = 0; str.length() > i; i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				s++;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				c++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				d++;
			} else if (str.charAt(i) == ' ') {
				sp++;
			} else
				sy++;
		}
		System.out.println("No. of Small Character:- " + s);
		System.out.println("No. of Capital Character:- " + c);
		System.out.println("No. of Digits:- " + d);
		System.out.println("No. of Spaces:- " + sp);
		System.out.println("No. of Symbol:- " + sy);

	}

	public static void ques8() {
		String s = "india,america,australia,africa,brazil";
		int index = -1;
		for (int i = 0; s.indexOf(",", index + 1) >= 0; i++) {

			String s1 = s.substring(index + 1, s.indexOf(",", index + 1));
			index = s.indexOf(",", index + 1);
			System.out.println(s1);
		}
		String s1 = s.substring(index + 1, s.length());
		System.out.println(s1);

	}

	public static void ques9() {
		StringBuffer s = new StringBuffer("abcgdh233743rw fjb45554357");

		for (int i = 0; s.length() > i; i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				s.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(s);
	}

	public static void ques10() {
		String s = "1.java,2.oracle,3.python,4.php,5.linux";
		StringTokenizer t = new StringTokenizer(s, ",");
		while (t.hasMoreTokens()) {
			String k = t.nextToken();
			System.out.println(k.substring(k.indexOf('.') + 1));
		}
	}

	public static void main(String[] args) {

		// ques1();
		// ques2();
		// ques3();
		// ques4();
		// ques5();
		// ques6();
		// ques7();
		// ques8();
		// ques9();
		// ques10();

	}

}
