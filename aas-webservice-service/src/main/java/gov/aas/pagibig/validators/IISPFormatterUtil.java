package gov.aas.pagibig.validators;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

public final class IISPFormatterUtil {
	
	private static String GL_FORMAT = "dd-MMM-yyyy";
	
	public static String formatDate(Date date, String format){
		return new SimpleDateFormat(format).format(date);
	}
	
	public static String toGLDate(XMLGregorianCalendar xmlGregorianCalendar){
		if(xmlGregorianCalendar == null){
			return "";
		}else{
			Date date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			return new SimpleDateFormat(GL_FORMAT).format(date);
		}
	}
	
	public static String replaceNullWithBlank(String input){
		return input == null ? "" : input;
	}
	
	public static String replaceNullBigDecimalWithBlank(BigDecimal input){
		return input == null ? "" : input.toString();
	}
	
	public static Object replaceZeroIntegerWithBlank(int input){
		return input == 0 ? "" : input;
	}
	
	public static String getGLDateToday(){
		return new SimpleDateFormat(GL_FORMAT).format(new Date());
	}
	
}
