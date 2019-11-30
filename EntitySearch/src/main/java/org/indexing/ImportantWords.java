package org.indexing;

import java.io.Serializable;
import java.util.Set;

public class ImportantWords implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<String> words;

	public ImportantWords() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("word list is: ");
		
		builder.append(this.words);
	
		return builder.toString();
		
	}

	public void setImportantWords(Set<String> words) {

		this.words = words;
	}

	public Set<String> getImportantWords() {

		return words;
	}
}