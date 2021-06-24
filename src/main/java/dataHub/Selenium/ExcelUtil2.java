package dataHub.Selenium;

import java.util.List;

public class ExcelUtil2 {
	
	
	
	Excelutil  excelUtil2 = new Excelutil() ;
	
	  public List<String> readData(String exposerType) {
        List<String> values = null;
        if (exposerType.equals("No Exposure"))
            values = excelUtil2.getCellsValue(7, 10, 2, 5);
        else if (exposerType.equals("Low Exposure"))
            values = excelUtil2.getCellsValue(5, 8, 11, 0);
        else if (exposerType.equals("High Exposure"))
            values = excelUtil2.getCellsValue(5, 14, 17, 0);
        else if (exposerType.equals("Verified Positive"))
            values = excelUtil2.getCellsValue(5, 20, 23, 0);
        else if (exposerType.equals("Where is my code"))
            values = excelUtil2.getCellsValue(5, 26, 27, 0);
        else if (exposerType.equals("Where is my Vaccine"))
            values = excelUtil2.getCellsValue(5, 32, 35, 0);

        return values;
    }
	
	public static void main(String[] args) {
		
		
	}

}
