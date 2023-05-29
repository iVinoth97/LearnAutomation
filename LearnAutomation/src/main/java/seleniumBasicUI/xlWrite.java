package seleniumBasicUI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;  

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlWrite {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
				FileOutputStream file = new FileOutputStream ("D:\\WorkSpace\\Write.xlsx");
				
				XSSFWorkbook workbook= new XSSFWorkbook();
				XSSFSheet sheet=workbook.createSheet("Details");

				XSSFRow row=sheet.createRow(0);

				row.createCell(0).setCellValue("Vinoth");
				row.createCell(1).setCellValue("Kumar");
				row.createCell(2).setCellValue("27-09-1997");
				row.createCell(3).setCellValue("+91-8973704911");
				row.createCell(4).setCellValue(" "+new Date());
				
				//Date date = new Date();
				//System.out.println(date.toString());

				workbook.write(file);
				file.close();
				System.out.println("writing is completed");
				
			}

		
	}


