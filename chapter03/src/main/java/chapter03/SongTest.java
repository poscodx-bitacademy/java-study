package chapter03;

public class SongTest {

	public static void main(String[] args) {
		Song song1 = new Song("좋은날", "아이유", "Real", "이민수", 3, 2010);
//		song1.setTitle("좋은날");
//		song1.setArtist("아이유");
//		song1.setAlbum("Real");
//		song1.setComposer("이민수");
//		song1.setTrack(3);
//		song1.setYear(2010);
		song1.show();
		
		Song song2 = new Song("Ditto", "New Jeans");
		song2.show();
	}

}
