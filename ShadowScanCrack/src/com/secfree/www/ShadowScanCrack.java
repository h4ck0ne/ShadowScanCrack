package com.secfree.www;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Linux Shadow ÀëÏßÈõ¿ÚÁîÉ¨Ãè½Å±¾
 * @time 2017-11-17
 * @author www.secFree.com By Bearcat
 */
public class ShadowScanCrack {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("\n[*]                      Linux ShadowÀëÏßÈõ¿ÚÁîÉ¨Ãè½Å±¾");
			System.out.println("[*] Github:  https://github.com/iBearcat/ShadowScanCrack");
			System.out.println("[*]   Use:  java ShadowScan.jar john && /john-x.x.x/run/john ShadowPath PasswordList");
		} else {
			//john
			String john = args[0];
			//ShadowÎÄ¼þÂ·¾¶
			String shadowPath = args[1];
			//ÃÜÂë×Öµä
			String passwordList = args[2];
			File f = new File(shadowPath);
			if (f.isDirectory()) {
				File[] fs = f.listFiles();
				if (fs != null) {
					String command, line;
					Process process;
					InputStreamReader ir = null;
					LineNumberReader input;
					for (int i = 0; i < fs.length; i++) {
						System.out.println(" ¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª");
						System.out.println("|                               Loding...                                 |");
						System.out.println(" ¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª");
						System.out.println("[*] { ["+ ShadowScanCrack.time() +"] [Scan] [FileName:" + fs[i].getName()
									+ "] [No." + (i + 1) + "] }");
						try {
							command = john + " -w:" + passwordList + " " + shadowPath + fs[i].getName();
							process = Runtime.getRuntime().exec(command);
							ir = new InputStreamReader(process.getInputStream());
							input = new LineNumberReader(ir);
							while ((line = input.readLine()) != null) {
								System.out.println(line);
							}
							command = john + " --show " + fs[i];
							process = Runtime.getRuntime().exec(command);
							ir = new InputStreamReader(process.getInputStream());
							input = new LineNumberReader(ir);
							while ((line = input.readLine()) != null) {
								System.out.println(line);
							}
							System.out.println("[*] { [" + ShadowScanCrack.time() + "] [End] }");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	public static String time() {
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		return df.format(new Date());
	}
}