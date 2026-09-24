public class prog121 {
    public static void main(String args[]) {
        String command = "UURRDDLL";
        int x = 0;
        int y = 0;
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == 'U') {
                y += 1;
            } else if (c == 'R') {
                x += 1;
            } else if (c == 'D') {
                y -= 1;
            } else if (c == 'L') {
                x -= 1;
            }
        }

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        int value = Math.abs(x) + Math.abs(y);
        System.out.println("ManHatten Distance -> " + value);
    }
}
