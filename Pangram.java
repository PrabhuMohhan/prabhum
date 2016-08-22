public class Pangram
{
    public static void main(String[] args) {
        if (isPanagramString("The quick ")) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }

        if (isPanagramString("The  fox ")) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }

    public static boolean isPanagramString(String s) {
        s = s.toLowerCase();
        int count = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (!s.contains(String.valueOf(c))) {
                return false;
            }
            count++;
        }
        return count == 26;
    }
}