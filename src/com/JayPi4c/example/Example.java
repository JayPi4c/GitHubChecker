package com.JayPi4c.example;

import java.io.File;

import com.JayPi4c.GitHubChecker;
import com.JayPi4c.Tag;

@Tag(tag = "v0.0.1")
public class Example {

	public static void main(String args[]) {
		GitHubChecker gc = new GitHubChecker("JayPi4c", "Polynomial-Regression", GitHubChecker.getTag(Example.class));
		boolean b;
		System.out.println("Update available: " + (b = gc.hasNewTag()));
		if (b)
			gc.downloadLatestVersion(new File("/home/jaypi4c/Schreibtisch/Programm.jar"));
	}

}
