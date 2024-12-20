package com.javaextra.day03;

public class BookDto {
    private int bookId;
    private String bookName;
    private String publisher;
    private int price;

    public String toString() {
        return String.format("[BookDto - bookId: %d, bookName: %s, publisher: %s, price: %,d]",
                bookId, bookName, publisher, price);
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //public BookDto(int bookId, String bookName,String publisher, int price){}


}

class BookService {
    public void proc(BookDto bookDto) {
        System.out.println(bookDto);
    }
}


class BookDtoTest {
    public static void main(String[] args) {

        BookDto bookDto = new BookDto();
        bookDto.setBookName("책제목");
        bookDto.setPublisher("출판사명");
        bookDto.setPrice(15000);
        bookDto.setBookId(3);

        //String d = bookDto.toString();
        BookService service = new BookService();
        service.proc(bookDto);
        // System.out.println(bookDto);


    }
}
