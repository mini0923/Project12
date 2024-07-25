package collection;

import java.util.ArrayList;

public class Quiz3 {

	//책번호와 제목을 멤버로 가지는 Book클래스를 만드세요
	//Book타입의 리스트를 생성하세요
	//리스트에 책 3권 추가하세요
	//리스트에 저장된 모든 책의 정보를 출력하세요
	//리스트의 모든 요소를 삭제하세요
	
	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<Book>();
		
		list.add(new Book(1, "둘리"));
		list.add(new Book(2, "또치"));
		list.add(new Book(3, "도우너"));
		
		for (int i =0; i< list.size(); i++) {
			Book book = list.get(i);
			System.out.println(book);
		}

			// 리스트 삭제
			list.clear();
			System.out.println(list);
		
		
		
	}

}

class Book <T>{
	
	int bookNum;
	String bookName;

	
	public Book(int bookNum, String bookName) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
	}
	
	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookName=" + bookName + "]";
	}


	private T book;
	

	public T getBook() {
		return book;
	}

	public void setBook(T book) {
		this.book = book;
	}
	
}
