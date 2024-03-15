import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LineCount {
    int count;
    int index;

    LineCount(int count, int index) {
        this.count = count;
        this.index = index;
    }
}

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

        for (String line : lines) {
            int count = 0;
            for (int i = 0; i <= line.length() - substring.length(); i++) {
                if (line.startsWith(substring, i)) {
                    count++;
                    i += substring.length() - 1; // Переміщуємо індекс, щоб уникнути перетину входжень
                }
            }
            System.out.println("Рядок: " + line);
            System.out.println("Кількість входжень підрядка \"" + substring + "\": " + count);
        }
    }
}


        for (LineCount lc : counts) {
            System.out.println(lc.count + " " + lc.index);
        }
    }
}
