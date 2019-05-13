package com.JayPi4c;

import java.util.ArrayList;

public class GitHubObject {
	private String url;
	private String assets_url;
	private String upload_url;
	private String html_url;
	private int id;
	private String node_id;
	private String tag_name;
	private String target_commitish;
	private String name;
	private String draft;
	private GitHubAuthorObject author;
	private boolean prerelease;
	private String created_at;
	private String published_at;
	private ArrayList<GitHubAssetsObject> assets;
	private String tarball_url;
	private String zipball_url;
	private String body;

	public String getDraft() {
		return draft;
	}

	public void setDraft(String draft) {
		this.draft = draft;
	}

	public GitHubAuthorObject getAuthor() {
		return author;
	}

	public void setAuthor(GitHubAuthorObject author) {
		this.author = author;
	}

	public String getTarget_commitish() {
		return target_commitish;
	}

	public void setTarget_commitish(String target_commitish) {
		this.target_commitish = target_commitish;
	}

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAssets_url() {
		return assets_url;
	}

	public void setAssets_url(String assets_url) {
		this.assets_url = assets_url;
	}

	public String getUpload_url() {
		return upload_url;
	}

	public void setUpload_url(String upload_url) {
		this.upload_url = upload_url;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNode_id() {
		return node_id;
	}

	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}

	public ArrayList<GitHubAssetsObject> getAssets() {
		return assets;
	}

	public void setAssets(ArrayList<GitHubAssetsObject> assets) {
		this.assets = assets;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPrerelease() {
		return prerelease;
	}

	public void setPrerelease(boolean prerelease) {
		this.prerelease = prerelease;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getPublished_at() {
		return published_at;
	}

	public void setPublished_at(String published_at) {
		this.published_at = published_at;
	}

	public String getTarball_url() {
		return tarball_url;
	}

	public void setTarball_url(String tarball_url) {
		this.tarball_url = tarball_url;
	}

	public String getZipball_url() {
		return zipball_url;
	}

	public void setZipball_url(String zipball_url) {
		this.zipball_url = zipball_url;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
