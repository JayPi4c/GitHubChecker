package com.JayPi4c;

public class GitHubAssetsObject {
	private String url;
	private int id;
	private String node_id;
	private String name;
	private String label;
	private GitHubAuthorObject uploader;
	private String content_type;
	private String state;
	private int size;
	private int download_count;
	private String created_at;
	private String updated_at;
	private String browser_download_url;

	public String getNode_id() {
		return node_id;
	}

	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDownload_count() {
		return download_count;
	}

	public void setDownload_count(int download_count) {
		this.download_count = download_count;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrowser_download_url() {
		return browser_download_url;
	}

	public void setBrowser_download_url(String browser_download_url) {
		this.browser_download_url = browser_download_url;
	}

	public GitHubAuthorObject getUploader() {
		return uploader;
	}

	public void setUploader(GitHubAuthorObject uploader) {
		this.uploader = uploader;
	}
}
