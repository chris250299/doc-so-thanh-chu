import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String read = "";
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    read = "zero";
                    break;
                case 1:
                    read = "one";
                    break;
                case 2:
                    read = "two";
                    break;
                case 3:
                    read = "three";
                    break;
                case 4:
                    read = "four";
                    break;
                case 5:
                    read = "five";
                    break;
                case 6:
                    read = "six";
                    break;
                case 7:
                    read = "seven";
                    break;
                case 8:
                    read = "eight";
                    break;
                case 9:
                    read = "nine";
                    break;
                default:
                    read = "";

            }
            if (read != "") {
                System.out.printf("%d is %s", number, read);
            } else {
                System.out.println("Invalid Input");
            }
        } else if (number < 20) {
            if (number < 13) {
                switch (number) {
                    case 10:
                        read = "ten";
                        break;
                    case 11:
                        read = "eleven";
                        break;
                    case 12:
                        read = "twelve";
                        break;
                    default:
                        read = "";
                }
                if (read != "") {
                    System.out.printf("%d is %s", number, read);
                } else {
                    System.out.println("Invalid Input");
                }
            } else {
                String output = Integer.toString(number);
                String ones = output.substring(1, 2);
                switch (ones) {
                    case ("3"):
                        read = "third";
                        break;
                    case ("4"):
                        read = "four";
                        break;
                    case ("5"):
                        read = "fif";
                        break;
                    case ("6"):
                        read = "six";
                        break;
                    case ("7"):
                        read = "seven";
                        break;
                    case ("8"):
                        read = "eight";
                        break;
                    case ("9"):
                        read = "nine";
                        break;
                    default:
                        read = "";
                }
                if (read != "") {
                    System.out.println(number + " is " + read + "teen");
                } else {
                    System.out.println("Invalid Input");
                }
            }
        } else if (number >= 20 && number < 100) {
            String output = Integer.toString(number);
            String tens = output.substring(0, 1);
            String ones = output.substring(1, 2);
            switch (tens) {
                case ("2"):
                    read = "twenty";
                    break;
                case ("3"):
                    read = "thirty";
                    break;
                case ("4"):
                    read = "forty";
                    break;
                case ("5"):
                    read = "fifty";
                    break;
                case ("6"):
                    read = "sixty";
                    break;
                case ("7"):
                    read = "seventy";
                    break;
                case ("8"):
                    read = "eighty";
                    break;
                case ("9"):
                    read = "ninety";
                    break;
                default:
                    read = "";
            }
            switch (ones) {
                case ("0"):
                    read += "";
                    break;
                case ("1"):
                    read += " one";
                    break;
                case ("2"):
                    read += " two";
                    break;
                case ("3"):
                    read += " three";
                    break;
                case ("4"):
                    read += " four";
                    break;
                case ("5"):
                    read += " five";
                    break;
                case ("6"):
                    read += " six";
                    break;
                case ("7"):
                    read += " seven";
                    break;
                case ("8"):
                    read += " eight";
                    break;
                case ("9"):
                    read += " nine";
                    break;
                default:
                    read += "wrong";
            }
            if (read != "") {
                System.out.println(number + " is " + read);
            } else {
                System.out.println("Invalid Input");
            }
        } else if (number < 1000) {
            String output = Integer.toString(number);
            String hundreds = output.substring(0, 1);
            String tens = output.substring(1, 2);
            String ones = output.substring(2, 3);
            switch (hundreds) {
                case ("1"):
                    read = "one hundred";
                    break;
                case ("2"):
                    read = "two hundred";
                    break;
                case ("3"):
                    read = "three hundred";
                    break;
                case ("4"):
                    read = "four hundred";
                    break;
                case ("5"):
                    read = "five hundred";
                    break;
                case ("6"):
                    read = "six hundred";
                    break;
                case ("7"):
                    read = "seven hundred";
                    break;
                case ("8"):
                    read = "eight hundred";
                    break;
                case ("9"):
                    read = "nine hundred";

            }
            if (tens.equals("0")) {
                switch (ones) {
                    case ("0"):
                        read += "";
                        break;
                    case ("1"):
                        read += " and one";
                        break;
                    case ("2"):
                        read += " and two";
                        break;
                    case ("3"):
                        read += " and three";
                        break;
                    case ("4"):
                        read += " and four";
                        break;
                    case ("5"):
                        read += " and five";
                        break;
                    case ("6"):
                        read += " and six";
                        break;
                    case ("7"):
                        read += " and seven";
                        break;
                    case ("8"):
                        read += " and eight";
                        break;
                    case ("9"):
                        read += " and nine";
                        break;
                }
            } else if (tens.equals("1")) {
                switch (ones) {
                    case ("0"):
                        read += " and ten";
                        break;
                    case ("1"):
                        read += " and eleven";
                        break;
                    case ("2"):
                        read += " and twelve";
                        break;
                    case ("3"):
                        read += " thirteen";
                        break;
                    case ("4"):
                        read += " fourteen";
                        break;
                    case ("5"):
                        read += " fifteen";
                        break;
                    case ("6"):
                        read += " sixteen";
                        break;
                    case ("7"):
                        read += " seventeen";
                        break;
                    case ("8"):
                        read += " eighteen";
                        break;
                    case ("9"):
                        read += " nineteen";
                        break;
                }
            } else {
                switch (tens) {
                    case ("2"):
                        read += " twenty";
                        break;
                    case ("3"):
                        read += " thirty";
                        break;
                    case ("4"):
                        read += " forty";
                        break;
                    case ("5"):
                        read += " fifty";
                        break;
                    case ("6"):
                        read += " sixty";
                        break;
                    case ("7"):
                        read += " seventy";
                        break;
                    case ("8"):
                        read += " eighty";
                        break;
                    case ("9"):
                        read += " ninety";
                        break;
                }
                switch (ones) {
                    case ("0"):
                        read += "";
                        break;
                    case ("1"):
                        read += " one";
                        break;
                    case ("2"):
                        read += " two";
                        break;
                    case ("3"):
                        read += " three";
                        break;
                    case ("4"):
                        read += " four";
                        break;
                    case ("5"):
                        read += " five";
                        break;
                    case ("6"):
                        read += " six";
                        break;
                    case ("7"):
                        read += " seven";
                        break;
                    case ("8"):
                        read += " eight";
                        break;
                    case ("9"):
                        read += " nine";
                        break;

                }
            }
            System.out.println(number + " is " + read);
        }
    }
}

