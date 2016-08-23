
public class Cameel {


public static void main(String[] args) {
    String start = "THIS_IS_A_TEST";
    StringBuffer sb = new StringBuffer();
    for (String s : start.split("_")) {
        sb.append(Character.toLowerCase(s.charAt(0)));
        if (s.length() > 1) {
            sb.append(s.substring(1, s.length()).toLowerCase());
        }
    }
    System.out.println(sb);
}


}
