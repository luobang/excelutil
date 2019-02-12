package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;
import com.sargeraswang.util.ExcelUtil.ExcelLogs;
import com.sargeraswang.util.ExcelUtil.ExcelUtil;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// importXlsx();
		importXls();
	}

	public static void importXlsx() throws FileNotFoundException {
		File f = new File("src/resources/test.xlsx");
		InputStream inputStream = new FileInputStream(f);

		ExcelLogs logs = new ExcelLogs();
		Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs, 0);

		for (Map m : importExcel) {
			System.out.println(m);
		}
	}

	public static void importXls() throws FileNotFoundException {
		File f = new File("src/resources/test.xls");
		InputStream inputStream = new FileInputStream(f);

		ExcelLogs logs = new ExcelLogs();
		Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, null, logs, 0);

		for (Map m : importExcel) {
			System.out.println(m);
		}
	}
}
