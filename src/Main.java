public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Михайлович", "Достоевский", 5);
        Author author2 = new Author("Александр", "Сергеевич", "Пушкин", 5);

        Book book1 = new Book("Сон смешного человека", 1877,author1, 356);
        Book book2 = new Book("Медный Всадник", 1837, author2, 64);

        String keySearchWord = "Достоевский";

        book1.searchKeySearch(keySearchWord);
        System.out.println("\n-----------------------------");
        System.out.println("Ключевое слово '" + keySearchWord + "';");
        System.out.println("Название книги                    :    " + book1.title);
        System.out.println("Является ли большой               :    " + book1.printIsBig());
        System.out.println("Результат поиска ключевого слова  :    " + book1.printMatches());
        System.out.println("Оценка стоимости книги            :    " + book1.calculateEstimatePrice());

        book2.searchKeySearch(keySearchWord);
        System.out.println("-----------------------------");
        System.out.println("Ключевое слово '" + keySearchWord + "';");
        System.out.println("Название книги                    :    " + book2.title);
        System.out.println("Является ли большой               :    " + book2.printIsBig());
        System.out.println("Результат поиска ключевого слова  :    " + book2.printMatches());
        System.out.println("Оценка стоимости книги            :    " + book2.calculateEstimatePrice());
    }
}