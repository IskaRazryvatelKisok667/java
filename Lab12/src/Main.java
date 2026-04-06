import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1. Длина строки");
            System.out.println("2. Верхний/нижний регистр");
            System.out.println("3. Количество слов");
            System.out.println("4. Разворот слов");
            System.out.println("5. Поиск слова");
            System.out.println("6. Замена слова");
            System.out.println("7. Палиндром");
            System.out.println("8. Сравнение строк");
            System.out.println("9. Разделение строки");
            System.out.println("10. Гласные и согласные");
            System.out.println("11. Удалить пробелы");
            System.out.println("12. Самое длинное слово");
            System.out.println("13. Символы без пробелов");
            System.out.println("14. startsWith");
            System.out.println("15. endsWith");
            System.out.println("16. Полный разворот строки");
            System.out.println("17. Удалить цифры");
            System.out.println("18. Заменить гласные на *");
            System.out.println("19. Частота символов");
            System.out.println("20. Только цифры");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            if (choice == 0) break;

            System.out.println("Введите строку:");
            String input = scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Длина: " + input.length());
                    break;

                case 2:
                    System.out.println(input.toUpperCase());
                    System.out.println(input.toLowerCase());
                    break;

                case 3:
                    String[] words = input.trim().split("\\s+");
                    System.out.println("Слов: " + words.length);
                    break;

                case 4:
                    for (String word : input.split("\\s+")) {
                        System.out.print(new StringBuilder(word).reverse() + " ");
                    }
                    break;

                case 5:
                    System.out.println("Введите слово для поиска:");
                    String find = scanner.nextLine();
                    System.out.println(input.contains(find) ? "Найдено" : "Не найдено");
                    break;

                case 6:
                    System.out.println("Что заменить:");
                    String oldWord = scanner.nextLine();
                    System.out.println("На что заменить:");
                    String newWord = scanner.nextLine();
                    System.out.println(input.replace(oldWord, newWord));
                    break;

                case 7:
                    String reversed = new StringBuilder(input).reverse().toString();
                    System.out.println(input.equalsIgnoreCase(reversed) ? "Палиндром" : "Не палиндром");
                    break;

                case 8:
                    System.out.println("Введите вторую строку:");
                    String second = scanner.nextLine();
                    System.out.println(input.equals(second) ? "Равны" : "Не равны");
                    break;

                case 9:
                    String[] parts = input.split(",");
                    for (String part : parts) {
                        System.out.println(part);
                    }
                    break;

                case 10:
                    int vowels = 0, consonants = 0;
                    String s = input.toLowerCase();

                    for (char c : s.toCharArray()) {
                        if ("aeiouаеёиоуыэюя".indexOf(c) != -1) vowels++;
                        else if (Character.isLetter(c)) consonants++;
                    }

                    System.out.println("Гласные: " + vowels);
                    System.out.println("Согласные: " + consonants);
                    break;

                case 11:
                    System.out.println(input.replace(" ", ""));
                    break;

                case 12:
                    String longest = "";
                    for (String w : input.split("\\s+")) {
                        if (w.length() > longest.length()) longest = w;
                    }
                    System.out.println("Самое длинное: " + longest);
                    break;

                case 13:
                    System.out.println("Символов без пробелов: " + input.replace(" ", "").length());
                    break;

                case 14:
                    System.out.println("Введите начало:");
                    String start = scanner.nextLine();
                    System.out.println(input.startsWith(start));
                    break;

                case 15:
                    System.out.println("Введите символ/окончание:");
                    String end = scanner.nextLine();
                    System.out.println(input.endsWith(end));
                    break;

                case 16:
                    System.out.println(new StringBuilder(input).reverse());
                    break;

                case 17:
                    System.out.println(input.replaceAll("\\d", ""));
                    break;

                case 18:
                    System.out.println(input.replaceAll("[aeiouаеёиоуыэюя]", "*"));
                    break;

                case 19:
                    Map<Character, Integer> map = new HashMap<>();
                    for (char c : input.toCharArray()) {
                        map.put(c, map.getOrDefault(c, 0) + 1);
                    }
                    System.out.println(map);
                    break;

                case 20:
                    System.out.println(input.matches("\\d+") ? "Только цифры" : "Есть другие символы");
                    break;

                default:
                    System.out.println("Ошибка выбора");
            }
        }

        System.out.println("Программа завершена");
    }
}