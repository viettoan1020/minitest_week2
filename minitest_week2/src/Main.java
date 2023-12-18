public class Main {
    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = {
                new ProgrammingBook(1, "Java Programming", 5.0, "Jeff Atwood", "Java", "Spring Boot"),
                new ProgrammingBook(2, "Ngôn Ngữ Lập Trình C Và C++", 8.3, "Ngô Trung Việt", "C&C++", "C"),
                new ProgrammingBook(3, "Learn Python the Hard Way", 10.0, "Zed A.Shaw", "Python", "Django"),
                new ProgrammingBook(4, "Eloquent Javascript", 7.8, "Marijin Haverbeke", "Javascript", "React"),
                new ProgrammingBook(5, "Ruby on Rails", 13.0, "Yukihiro Matz Matsumoto", "Ruby", "Rails"),
        };

        FictionBook[] fictionBooks = {
                new FictionBook(6, "Fahrenheit 451", 8.0, "By Ray Bradbury", "Historical Fiction"),
                new FictionBook(7, "The Paying Guests", 12.3, "Sarah Waters", "Thriller"),
                new FictionBook(8, "Jane Eyre", 7.4, "Charlotte Brontë", "Viễn tưởng 1"),
                new FictionBook(9, "Watership Down", 5.0, "Richard Adams", "Viễn tưởng 1"),
                new FictionBook(10, "The Adventures of Huckleberry Finn", 17.2, "Mark Twain", "Adventure"),
        };

        double totalCost = 0;
        for (Book book: programmingBooks) {
            totalCost += book.getPrice();
        }
        for (Book book: fictionBooks) {
            totalCost += book.getPrice();
        }

        int javaBookCount = 0;
        for (ProgrammingBook book : programmingBooks) {
            if ("Java".equals(book.getLanguage())) {
                javaBookCount++;
            }
        }

        int vienTuong1BookCount = 0;
        int cheapBookCount = 0;
        for (FictionBook book : fictionBooks) {
            if ("Viễn tưởng 1".equals(book.getCategory())) {
                vienTuong1BookCount++;
            }

            if (book.getPrice() < 100.0) {
                cheapBookCount++;
            }
        }
        System.out.println("Tổng tiền của 10 cuốn sách là : " + totalCost);
        System.out.println("Số sách có category là 'Viễn tưởng 1' : " + vienTuong1BookCount);
        System.out.println("Số sách Fiction có giá dưới 100 là : " + cheapBookCount);
    }
}