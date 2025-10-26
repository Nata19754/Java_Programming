import java.util.Scanner;

public class DemoBlankets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Data for Blanket:");
        Blanket b = new Blanket();
        System.out.println(b);

        while (true) {
            System.out.print("Enter material >> ");
            String mat = in.nextLine().trim();
            if (mat.equalsIgnoreCase("Q") || mat.equalsIgnoreCase("quit")) break;
            b.setMaterial(mat);
            System.out.println(b);

            System.out.print("Enter size >> ");
            String sz = in.nextLine().trim();
            if (sz.equalsIgnoreCase("Q") || sz.equalsIgnoreCase("quit")) break;
            b.setSize(sz);
            System.out.println(b);

            System.out.print("Enter color >> ");
            b.setColor(in.nextLine().trim());
            System.out.println(b);

            System.out.print("Enter material or Q to quit >> ");
            String next = in.nextLine().trim();
            if (next.equalsIgnoreCase("Q") || next.equalsIgnoreCase("quit")) break;
            b.setMaterial(next);
            System.out.println(b);
        }

        System.out.println("\nData for Electric Blanket:");
        ElectricBlanket eb = new ElectricBlanket();
        System.out.println(eb);

        while (true) {
            System.out.print("Enter material >> ");
            String mat = in.nextLine().trim();
            if (mat.equalsIgnoreCase("Q") || mat.equalsIgnoreCase("quit")) break;
            eb.setMaterial(mat);
            System.out.println(eb);

            System.out.print("Enter size >> ");
            String sz = in.nextLine().trim();
            if (sz.equalsIgnoreCase("Q") || sz.equalsIgnoreCase("quit")) break;
            eb.setSize(sz);
            System.out.println(eb);

            System.out.print("Enter color >> ");
            eb.setColor(in.nextLine().trim());
            System.out.println(eb);

            System.out.print("Enter heat setting (1-5) >> ");
            try {
                int s = Integer.parseInt(in.nextLine().trim());
                eb.setSettings(s);
            } catch (NumberFormatException e) {
                eb.setSettings(1);
            }
            System.out.println(eb);

            System.out.print("Automatic shutoff (yes/no) >> ");
            String yn = in.nextLine().trim();
            eb.setHasAutoShutoff(yn.equalsIgnoreCase("yes") || yn.equalsIgnoreCase("y"));
            System.out.println(eb);

            System.out.print("Enter material or Q to quit >> ");
            String next = in.nextLine().trim();
            if (next.equalsIgnoreCase("Q") || next.equalsIgnoreCase("quit")) break;
            eb.setMaterial(next);
            System.out.println(eb);
        }

        in.close();
    }
}
