package org.indexing;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

public class ImportantWords implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonbProperty("words")
	public String words[];

	public ImportantWords() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("word list is: {");
		for (int i = 0; i < this.words.length; i++) {
			builder.append(this.words[i] + ",");
		}
		builder.append("}");
		return builder.toString();
	}

	@JsonbCreator
	public ImportantWords(@JsonbProperty("words") String[] words) {

		this.words = words;
	}
}