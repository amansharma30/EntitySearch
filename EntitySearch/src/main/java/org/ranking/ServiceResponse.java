package org.ranking;

import com.fasterxml.jackson.annotation.JsonProperty;

class ServiceResponse {

	 
	@JsonProperty
	String url;
	@JsonProperty
	String label;
	@JsonProperty
	double pagerank;

	ServiceResponse() {

	}

	ServiceResponse(String url, String label, double pagerank) {
		this.label = label;
		this.pagerank = pagerank;
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getPagerank() {
		return pagerank;
	}

	public void setPagerank(double pagerank) {
		this.pagerank = pagerank;
	}

}
