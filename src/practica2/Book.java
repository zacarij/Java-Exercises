
package practica2;

public class Book {
    
    private String bookName;
    private String editor;
    private String writer;
    
    public Book (String bookName){
        this (bookName,"Not known","Not known");
    }
    
    
    public Book (String bookName,String editor,String writer){
        this.bookName = bookName;
        this.editor = editor;
        this.writer = writer;
    }
    
     public String getEditor() {
        return editor;
    }

    public String getWriter() {
        return writer;
    }
    public String getBookName() {
        return bookName;
    }
    
}
