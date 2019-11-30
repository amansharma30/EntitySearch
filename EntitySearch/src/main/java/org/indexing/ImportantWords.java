package org.indexing;
import java.io.Serializable;

public class ImportantWords implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String words[];

	public ImportantWords() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("word list is: {");
//		for (int i = 0; i < this.words.length; i++) {
//			builder.append(this.words[i] + ",");
//		}
//		builder.append("}");
//		return builder.toString();
		return "Important Words [words="
        + words+ "]"; 
	}


	public void setImportantWords(String[] words) {

		this.words = words;
	}
	
	public String[] getImportantWords() {

		return words;
	}
}