import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Будь ласка, вкажіть підрядок для пошуку як перший аргумент командного рядка.");
            return;
        }

        String substring = args[0];
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine() && lines.size() < 100) {
            String line = scanner.nextLine();
            // Перевірка на довжину рядка не більше 255 символів
            if (line.length() <= 255) {
                lines.add(line);
            } else {
                System.out.println("Рядок перевищує 255 символів і не буде доданий.");
            }
        }

        // Тут можна виконати операції з прочитаними рядками
        for (String line : lines) {
            System.out.println(line);
        }
    }
}



