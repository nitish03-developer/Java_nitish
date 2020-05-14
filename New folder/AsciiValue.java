public class AsciiValue {

    public static void main(String[] args) {

        char ch = 'a';
		char th= 'b';
        int ascii = ch;
		int v=th;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
		System.out.println("The ASCII value of " + th + " is: " + v);
    }
}