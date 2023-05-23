public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;
    private final int ESTIMATE_PRICE = 3;
    public String keySearchWord;


    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }

    public String printIsBig() {
        if (isBig()) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    public void searchKeySearch(String newKeySearchWord) {
        this.keySearchWord = newKeySearchWord;
    }

    public boolean matches(String word) {
        if (this.title.contains(word) || author.name.contains(word) || author.patronymic.contains(word)
                ||author.surname.contains(word)) {
            return true;
        } else {
            return false;
        }
    }

    public String printMatches() {
        if (matches(keySearchWord)) {
            return "Присутствует";
        } else {
            return "Отсутствует";
        }
    }

    public final int calculateEstimatePrice() {
        double result = pages * ESTIMATE_PRICE * Math.sqrt(author.rating);
        result = (int) Math.floor(result);
        if (result >= 250) {
            return (int) result;
        } else {
            return 250;
        }
    }

}
