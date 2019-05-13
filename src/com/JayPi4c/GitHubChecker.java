package com.JayPi4c;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GitHubChecker {
	private String owner;
	private String repoName;
	private String tag;
	private final String URL_PREFIX = "https://api.github.com/repos/";
	private final String URL_POSTFIX = "/releases";

	public GitHubChecker(String owner, String repoName, String tag) {
		this.owner = owner;
		this.repoName = repoName;
		this.tag = tag;
	}

	public GitHubChecker(String owner, String repoName) {
		this.owner = owner;
		this.repoName = repoName;
		this.tag = null;
	}

	/**
	 * Diese Funktion ist da, um zu überprüfen, ob die entsprechende Klasse auch
	 * wirklich die Annotation benutzt, damit die Funktion auch richtig
	 * funktionieren kann.
	 * 
	 * @param c
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean isValid(Class c) {
		return c.isAnnotationPresent(Tag.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String getTag(Class c) throws TagException {
		if (isValid(c))
			return ((Tag) c.getAnnotation(Tag.class)).tag();
		throw new TagException("Die angegebene Klasse hat keine Tag-Annotation.");
	}

	public boolean hasNewTag() {
		if (tag == null)
			throw new TagException(
					"Dem GitHubChecker wurde kein Tag übergeben, mit dem überprüft werden kann, ob ein neuer Release vorliegt.\nLösung: Übergebe im Konstruktor eine Tag-Version oder rufe diese Funktion mit einem Tag auf.");
		return (!getLatestRelease().getTag_name().equals(tag));
	}

	public boolean hasNewTag(String tag) {
		return (!getLatestRelease().getTag_name().equals(tag));
	}

	/**
	 * gibt die Informationen über den neuesten Relaease zurück
	 * 
	 * @return
	 */
	public GitHubObject getLatestRelease() {
		try (InputStreamReader reader = new InputStreamReader(
				new URL(URL_PREFIX + owner + "/" + repoName + URL_POSTFIX).openStream(), Charset.forName("UTF-8"));) {
			Gson gson = new GsonBuilder().create();
			GitHubObject objs[] = gson.fromJson(reader, GitHubObject[].class);
			return objs[0];
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * gibt alle Releases als Array zurück
	 * 
	 * @return
	 */
	public GitHubObject[] getReleases() {
		try (InputStreamReader reader = new InputStreamReader(
				new URL(URL_PREFIX + owner + "/" + repoName + URL_POSTFIX).openStream(), Charset.forName("UTF-8"));) {
			Gson gson = new GsonBuilder().create();
			GitHubObject objs[] = gson.fromJson(reader, GitHubObject[].class);
			return objs;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void downloadLatestVersion(String location) {
		downloadLatestVersion(new File(location));
	}

	/**
	 * läd den neuesten Release der GitHub-Seite herunter und speichert diese in der
	 * übergebenen Datei
	 * 
	 * @param f
	 */
	public void downloadLatestVersion(File f) {
		GitHubObject gho = getLatestRelease();
		String url = gho.getAssets().get(0).getBrowser_download_url();
		try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
				FileOutputStream fos = new FileOutputStream(f)) {
			byte dataBuffer[] = new byte[1024];
			int bytesRead;
			while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1)
				fos.write(dataBuffer, 0, bytesRead);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// -------------------------- Getters-Setters -------------------------- //

	public String getOwner() {
		return owner;
	}

	public String getRepoName() {
		return repoName;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return this.tag;
	}
}
