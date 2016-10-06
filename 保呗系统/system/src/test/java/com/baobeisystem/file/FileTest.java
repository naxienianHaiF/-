package com.baobeisystem.file;

import java.io.IOException;

import org.junit.Test;

public class FileTest {

	@Test
	public void test() throws IOException{
		System.out.println(FileUtils.readFile("src/test/java/com/baobeisystem/file/protocol.txt"));
	}
}
