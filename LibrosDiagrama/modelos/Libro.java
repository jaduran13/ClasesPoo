package modelos;


/**
 * @author jadg1
 * @version 1.0
 * @created 13-nov.-2022 18:55:01
 */
public class Libro {

	private String isbn;
	private String title;
	private int editionNumber;
	private String copyright;
	public Autor m_Autor;

	public Libro(){

	}

	public void finalize() throws Throwable {

	}
}//end Libro