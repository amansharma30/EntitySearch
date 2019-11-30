package org.indexing;

public class DocumentFile {

	private String content;

	public DocumentFile(String text) {
		this.content = text;
	}

	public String getText() {
		return content;
	}

	public void setText(String text) {
		this.content = text;
	}

}
