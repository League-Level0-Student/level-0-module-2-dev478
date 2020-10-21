package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotto {
public static void main(String[] args) {
	int number0 = 0;
	Random ran = new Random();
	number0 = ran.nextInt(100);
	int number1 = 0;
	number1 = ran.nextInt(100);
	int number2 = 0;
	number2 = ran.nextInt(100);
	int number3 = 0;
	number3 = ran.nextInt(100);
	int number4 = 0;
	number4 = ran.nextInt(100);
	int number5 = 0;
	number5 = ran.nextInt(100);
	JOptionPane.showMessageDialog(null,"Your numbers are: " + number0+", "+number1+", "+number2+", "+number3+", "+number4+", "+number5 + ".\nThe lottery numbers for today are 2, 4, 6, 20, 99 and 100.");
}
}
