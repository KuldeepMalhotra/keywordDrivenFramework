package keywordDrivenFramework;

import org.apache.logging.log4j.*;

public class DriverScript {

	static Logger log = LogManager.getLogger(DriverScript.class);
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String spath = "/Users/Malhotra/Documents/keywords.xls";
		ExcelUtils.setExcelFile(spath, "Sheet1");
		
		log.info("File Opened form path" + spath);
		
		for (int iRow=1; iRow<=8; iRow++)
		{
			String sActionKeyword = ExcelUtils.getCellData(iRow, 0);
			if (sActionKeyword.equals("openBrowser")) {
				ActionKeywords.openBrowser();
				
			}
			
			else
				if (sActionKeyword.equals("navigateToURL")) 
					ActionKeywords.navigateToURL();
			
				else
					if (sActionKeyword.equals("inputUserName"))
						ActionKeywords.inputUserName();
			
					else
						if (sActionKeyword.equals("inputPassword"))
							ActionKeywords.inputPassword();
			
						else
							
						if (sActionKeyword.equals("clickToLogin"))
							ActionKeywords.clickToLogin();
			
						else
							if (sActionKeyword.equals("clickToMenu"))
								ActionKeywords.clickToMenu();
			
							else
								if (sActionKeyword.equals("clickToLogout"))
									ActionKeywords.clickToLogout();
			
								else
									if (sActionKeyword.equals("closeBrowser"))
										ActionKeywords.closeBrowser();
		}
	}

}
