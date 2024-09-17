//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //palindrom




        Scanner scanner = new Scanner(System.in);

        // Wczytanie słowa od użytkownika
        System.out.print("Wprowadź słowo: ");
        String slowo = scanner.nextLine();

        // Zamknięcie obiektu Scanner
        scanner.close();

        // Sprawdzenie, czy słowo jest palindromem
        if (isPalindrom(slowo)) {
            System.out.println("Słowo jest palindromem.");
        } else {
            System.out.println("Słowo nie jest palindromem.");
        }
    }

    // Metoda sprawdzająca, czy dane słowo jest palindromem
    public static boolean isPalindrom(String slowo) {
        // Usunięcie białych znaków i przekształcenie do małych liter
        String cleanedWord = slowo.replaceAll("\\s+", "").toLowerCase();

        // Sprawdzenie, czy słowo jest równe swojemu odwróconemu wersji
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();

        return cleanedWord.equals(reversedWord);
        //najlbizszy palindrom





        // Utworzenie obiektu Scanner do wczytywania danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Wczytanie liczby od użytkownika
        System.out.print("Wprowadź liczbę: ");
        int liczba = scanner.nextInt();

        // Zamknięcie obiektu Scanner
        scanner.close();

        // Znalezienie najbliższej liczby palindromicznej
        int nearestPalindrome = findNearestPalindrome(liczba);

        // Wyświetlenie wyniku
        System.out.println("Najbliższa liczba palindromiczna to: " + nearestPalindrome);
    }

    // Metoda sprawdzająca, czy liczba jest palindromem
    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    // Metoda znajdująca najbliższą liczbę palindromiczną
    public static int findNearestPalindrome(int number) {
        int lower = number - 1;
        int higher = number + 1;

        // Szukanie palindromu w dół i w górę
        while (true) {
            if (isPalindrome(lower)) {
                return lower;
            }
            if (isPalindrome(higher)) {
                return higher;
            }
            lower--;
            higher++;
        }
        //szyfr cesara




        // Utworzenie obiektu Scanner do wczytywania danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Wczytanie słowa od użytkownika
        System.out.print("Wprowadź słowo do zaszyfrowania: ");
        String slowo = scanner.nextLine();

        // Zamknięcie obiektu Scanner
        scanner.close();

        // Szyfrowanie słowa
        String zaszyfrowaneSlowo = szyfrujCezara(slowo, 3);

        // Wyświetlenie zaszyfrowanego słowa
        System.out.println("Zaszyfrowane słowo: " + zaszyfrowaneSlowo);
    }

    // Metoda szyfrująca słowo szyfrem Cezara z danym kluczem
    public static String szyfrujCezara(String slowo, int klucz) {
        StringBuilder zaszyfrowane = new StringBuilder();

        // Przesunięcie każdej litery w alfabecie
        for (char znak : slowo.toCharArray()) {
            if (Character.isLetter(znak)) {
                char przesunietyZnak = przesunLitere(znak, klucz);
                zaszyfrowane.append(przesunietyZnak);
            } else {
                // Dodanie znaków nie będących literami bez zmian
                zaszyfrowane.append(znak);
            }
        }

        return zaszyfrowane.toString();
    }

    // Metoda przesuwająca literę o dany klucz
    public static char przesunLitere(char litera, int klucz) {
        if (Character.isUpperCase(litera)) {
            return (char) (((litera - 'A' + klucz) % 26) + 'A');
        } else if (Character.isLowerCase(litera)) {
            return (char) (((litera - 'a' + klucz) % 26) + 'a');
        } else {
            return litera;
        }
        //anagramy




        
        import java.util.Arrays;
import java.util.Scanner;

        public class AnagramChecker {
            public static void main(String[] args) {
                // Utworzenie obiektu Scanner do wczytywania danych od użytkownika
                Scanner scanner = new Scanner(System.in);

                // Wczytanie dwóch słów od użytkownika
                System.out.print("Wprowadź pierwsze słowo: ");
                String slowo1 = scanner.nextLine();
                System.out.print("Wprowadź drugie słowo: ");
                String slowo2 = scanner.nextLine();

                // Zamknięcie obiektu Scanner
                scanner.close();

                // Sprawdzenie, czy słowa są anagramami
                if (czyAnagramy(slowo1, slowo2)) {
                    System.out.println("Słowa są anagramami.");
                } else {
                    System.out.println("Słowa nie są anagramami.");
                }
            }

            // Metoda sprawdzająca, czy dwa słowa są anagramami
            public static boolean czyAnagramy(String slowo1, String slowo2) {
                // Usunięcie białych znaków i przekształcenie do małych liter
                String cleanedSlowo1 = slowo1.replaceAll("\\s+", "").toLowerCase();
                String cleanedSlowo2 = slowo2.replaceAll("\\s+", "").toLowerCase();

                // Sprawdzenie długości słów
                if (cleanedSlowo1.length() != cleanedSlowo2.length()) {
                    return false;
                }

                // Przekształcenie słów na tablice znaków
                char[] tablica1 = cleanedSlowo1.toCharArray();
                char[] tablica2 = cleanedSlowo2.toCharArray();

                // Posortowanie tablic znaków
                Arrays.sort(tablica1);
                Arrays.sort(tablica2);

                // Porównanie posortowanych tablic
                return Arrays.equals(tablica1, tablica2);
            }
        }
        //silnia





        import java.util.Scanner;

        public class FactorialDigitSum {
            public static void main(String[] args) {
                // Utworzenie obiektu Scanner do wczytywania danych od użytkownika
                Scanner scanner = new Scanner(System.in);

                // Wczytanie liczby od użytkownika
                System.out.print("Wprowadź liczbę: ");
                int liczba = scanner.nextInt();

                // Zamknięcie obiektu Scanner
                scanner.close();

                // Obliczenie sumy silni cyfr liczby
                int sumaSilni = obliczSumeSilniCyfr(liczba);

                // Wyświetlenie wyniku
                System.out.println("Suma silni cyfr liczby " + liczba + " wynosi: " + sumaSilni);
            }

            // Metoda obliczająca sumę silni cyfr liczby
            public static int obliczSumeSilniCyfr(int liczba) {
                int suma = 0;

                // Przechodzenie przez każdą cyfrę liczby
                while (liczba > 0) {
                    int cyfra = liczba % 10; // Pobranie ostatniej cyfry
                    suma += silnia(cyfra);   // Dodanie silni cyfry do sumy
                    liczba /= 10;            // Usunięcie ostatniej cyfry
                }

                return suma;
            }

            // Metoda obliczająca silnię danej liczby
            public static int silnia(int n) {
                if (n == 0 || n == 1) {
                    return 1;
                }
                int wynik = 1;
                for (int i = 2; i <= n; i++) {
                    wynik *= i;
                }
                return wynik;
            }
        }
//liczby pierwsze




        import java.util.Scanner;

        public class PrimeCheck {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Podaj liczbę: ");
                int number = scanner.nextInt();

                if (isPrime(number)) {
                    System.out.println(number + " jest liczbą pierwszą.");
                } else {
                    System.out.println(number + " nie jest liczbą pierwszą.");
                }
            }

            public static boolean isPrime(int number) {
                // Sprawdzenie, czy liczba jest mniejsza lub równa 1
                if (number <= 1) {
                    return false;
                }

                // Sprawdzanie dzielników od 2 do pierwiastka z liczby
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
//haslo




        import java.security.SecureRandom;

        public class RandomPasswordGenerator {
            private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
            private static final String DIGITS = "0123456789";
            private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?";
            private static final String ALL_CHARACTERS = UPPERCASE_LETTERS + LOWERCASE_LETTERS + DIGITS + SPECIAL_CHARACTERS;

            private static final int PASSWORD_LENGTH = 20;

            public static void main(String[] args) {
                String password = generatePassword(PASSWORD_LENGTH);
                System.out.println("Wygenerowane hasło: " + password);
            }

            public static String generatePassword(int length) {
                SecureRandom random = new SecureRandom();
                StringBuilder password = new StringBuilder(length);

                // Dodaj przynajmniej jeden znak z każdej kategorii
                password.append(UPPERCASE_LETTERS.charAt(random.nextInt(UPPERCASE_LETTERS.length())));
                password.append(LOWERCASE_LETTERS.charAt(random.nextInt(LOWERCASE_LETTERS.length())));
                password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
                password.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

                // Wypełnij resztę hasła losowymi znakami
                for (int i = 4; i < length; i++) {
                    password.append(ALL_CHARACTERS.charAt(random.nextInt(ALL_CHARACTERS.length())));
                }

                // Przetasuj znaki, aby nie było przewidywalnej struktury
                return shuffleString(password.toString());
            }

            private static String shuffleString(String input) {
                char[] characters = input.toCharArray();
                SecureRandom random = new SecureRandom();
                for (int i = 0; i < characters.length; i++) {
                    int randomIndex = random.nextInt(characters.length);
                    char temp = characters[i];
                    characters[i] = characters[randomIndex];
                    characters[randomIndex] = temp;
                }
                return new String(characters);
            }
        }
        // Deklaracja tablicy 10 liczb rzeczywistych
        int[] tablica = new int[10];

        // Wypełnianie tablicy pierwiastkami kwadratowymi jej indeksów
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = (int) Math.sqrt(i);
        }
        // Wyświetlenie wartości w tablicy
        for (int value : tablica) {
            System.out.println(value);
        }
        //fibonacci




        // Deklaracja i inicjalizacja tablicy na liczby Fibonacciego
        int[] fibonacci = new int[40];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Wypełnienie tablicy liczbami ciągu Fibonacciego
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Wczytanie liczby od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();

        // Wyszukiwanie najbliższej liczby Fibonacciego przy użyciu wyszukiwania binarnego
        int closestFib = findClosestFibonacci(fibonacci, number);

        System.out.println("Najbliższa liczba Fibonacciego do podanej liczby " + number + " to: " + closestFib);
    }

    // Funkcja do znajdowania najbliższej liczby Fibonacciego przy użyciu algorytmu wyszukiwania binarnego
    public static int findClosestFibonacci(int[] fibonacci, int target) {
        int left = 0;
        int right = fibonacci.length - 1;

        // Algorytm wyszukiwania binarnego
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (fibonacci[mid] == target) {
                return fibonacci[mid]; // Dokładne dopasowanie
            }

            if (fibonacci[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Jeżeli nie znaleziono dokładnej liczby, zwróć najbliższą
        // Sprawdzenie czy lewa czy prawa strona jest bliższa
        if (left >= fibonacci.length) {
            return fibonacci[right];
        }
        if (right < 0) {
            return fibonacci[left];
        }

        // Zwróć bliższą liczbę
        if (Math.abs(fibonacci[left] - target) < Math.abs(fibonacci[right] - target)) {
            return fibonacci[left];
        } else {
            return fibonacci[right];
        }
        //losowe liczby segregowanie





        // Deklaracja tablicy liczb całkowitych
        int[] liczby = new int[100];
        Random random = new Random();

        // Wypełnianie tablicy liczbami losowymi z zakresu od 1 do 100
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = random.nextInt(100) + 1; // Liczby od 1 do 100
        }

        // Deklaracja kolekcji parzystych i nieparzystych liczb
        List<Integer> parzyste = new ArrayList<>();
        List<Integer> nieparzyste = new ArrayList<>();

        // Deklaracja zestawu (Set) do przechowywania unikalnych liczb
        Set<Integer> unikalneLiczby = new HashSet<>();

        // Wypełnianie kolekcji parzystymi i nieparzystymi liczbami
        for (int liczba : liczby) {
            if (liczba % 2 == 0) {
                parzyste.add(liczba);
            } else {
                nieparzyste.add(liczba);
            }

            // Dodawanie liczby do zestawu unikalnych liczb
            unikalneLiczby.add(liczba);
        }

        // Wyświetlanie wyników
        System.out.println("Liczby parzyste: " + parzyste);
        System.out.println("Liczby nieparzyste: " + nieparzyste);
        System.out.println("Liczba różnych wylosowanych liczb: " + unikalneLiczby.size());
        //mediana




        // Deklaracja tablicy liczb całkowitych (100 liczb losowych z zakresu 1-100)
        int[] liczby = new int[100];
        Random random = new Random();

        // Wypełnianie tablicy liczbami losowymi
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = random.nextInt(100) + 1; // Liczby od 1 do 100
        }

        // Sortowanie tablicy
        Arrays.sort(liczby);
        System.out.println("Posortowana tablica: " + Arrays.toString(liczby));

        // Znalezienie mediany
        double mediana = znajdzMediane(liczby);
        System.out.println("Mediana: " + mediana);

        // Znalezienie dominanty
        int dominanta = znajdzDominante(liczby);
        System.out.println("Dominanta: " + dominanta);

        // Obliczenie średniej
        double srednia = znajdzSrednia(liczby);
        System.out.println("Średnia: " + srednia);
    }

    // Funkcja do znalezienia mediany
    public static double znajdzMediane(int[] liczby) {
        int n = liczby.length;
        if (n % 2 == 0) {
            // Jeśli liczba elementów jest parzysta, zwróć średnią dwóch środkowych elementów
            return (liczby[n / 2 - 1] + liczby[n / 2]) / 2.0;
        } else {
            // Jeśli liczba elementów jest nieparzysta, zwróć środkowy element
            return liczby[n / 2];
        }
    }

    // Funkcja do znalezienia dominanty
    public static int znajdzDominante(int[] liczby) {
        // Mapa przechowująca liczbę wystąpień każdej liczby
        Map<Integer, Integer> licznik = new HashMap<>();

        // Liczenie wystąpień każdej liczby
        for (int liczba : liczby) {
            licznik.put(liczba, licznik.getOrDefault(liczba, 0) + 1);
        }

        // Znalezienie liczby o największej liczbie wystąpień
        int dominanta = liczby[0];
        int maxWystapien = 0;
        for (Map.Entry<Integer, Integer> entry : licznik.entrySet()) {
            if (entry.getValue() > maxWystapien) {
                maxWystapien = entry.getValue();
                dominanta = entry.getKey();
            }
        }

        return dominanta;
    }

    // Funkcja do znalezienia średniej
    public static double znajdzSrednia(int[] liczby) {
        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }
        return (double) suma / liczby.length;
        //sito erastotenesa



        
        // Maksymalna liczba (1000)
        int max = 1000;

        // Wygenerowanie tablicy liczb pierwszych przy użyciu Sita Eratostenesa
        List<Integer> liczbyPierwsze = sitoEratostenesa(max);

        // Wczytanie zakresu x i y od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość x (większe od 0): ");
        int x = scanner.nextInt();

        System.out.print("Podaj wartość y (mniejsze od 1000): ");
        int y = scanner.nextInt();

        // Sprawdzenie poprawności zakresu
        if (x <= 0 || y >= 1000 || x > y) {
            System.out.println("Podano niepoprawny zakres. x musi być większe od 0, a y mniejsze niż 1000, oraz x <= y.");
            return;
        }

        // Wyświetlenie liczb pierwszych z zakresu x do y
        System.out.println("Liczby pierwsze z zakresu od " + x + " do " + y + ":");
        for (int liczba : liczbyPierwsze) {
            if (liczba >= x && liczba <= y) {
                System.out.print(liczba + " ");
            }
        }
    }

    // Metoda do generowania liczb pierwszych przy użyciu Sita Eratostenesa
    public static List<Integer> sitoEratostenesa(int max) {
        boolean[] czyPierwsza = new boolean[max + 1]; // Tablica do oznaczania liczb
        List<Integer> liczbyPierwsze = new ArrayList<>(); // Lista na liczby pierwsze

        // Inicjalizowanie wszystkich liczb jako potencjalnie pierwsze
        for (int i = 2; i <= max; i++) {
            czyPierwsza[i] = true;
        }

        // Algorytm Sita Eratostenesa
        for (int i = 2; i * i <= max; i++) {
            if (czyPierwsza[i]) {
                // Oznaczanie wielokrotności liczby i jako niepierwszych
                for (int j = i * i; j <= max; j += i) {
                    czyPierwsza[j] = false;
                }
            }
        }

        // Zbieranie liczb pierwszych do listy
        for (int i = 2; i <= max; i++) {
            if (czyPierwsza[i]) {
                liczbyPierwsze.add(i);
            }
        }

        return liczbyPierwsze;

    }
}
