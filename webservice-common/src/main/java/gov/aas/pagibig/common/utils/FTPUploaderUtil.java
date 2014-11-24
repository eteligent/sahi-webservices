package gov.aas.pagibig.common.utils;

import gov.aas.pagibig.common.exception.IISPException;	

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.SocketException;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public final class FTPUploaderUtil {
	
	private static final String HOST = "192.168.128.106";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "passw0rd";
	
	public static void uploadGL(File file,String fileName) throws SocketException, IOException, IISPException{
			FTPClient ftp = new FTPClient();
			ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
			ftp.connect(HOST);
			if(!isPositiveReply(ftp)){
				ftp.disconnect();
				throw new IISPException("Exception in connecting to the ftp server");
			}
			
			ftp.login(USERNAME, PASSWORD);
			if(!isPositiveReply(ftp)){
				ftp.disconnect();
				throw new IISPException("Invalid Login Credentials");
			}
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			ftp.enterLocalPassiveMode();
			
			//Uploading of file
			ftp.changeWorkingDirectory("/var/XXAPPS/XXGL_INTERFACE/HO/data");
			InputStream input = new FileInputStream(file);
			ftp.storeFile(fileName,input);
			if(!isPositiveReply(ftp)){
				ftp.disconnect();
				throw new IISPException("Error in uploading the file");
			}
			ftp.logout();
		
	}
	
	public static void uploadOtc(File file, String fileName) throws SocketException, IOException, IISPException{
		FTPClient ftp = new FTPClient();
		ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
		ftp.connect(HOST);
		if(!isPositiveReply(ftp)){
			ftp.disconnect();
			throw new IISPException("Exception in connecting to the ftp server");
		}
		
		ftp.login(USERNAME, PASSWORD);
		if(!isPositiveReply(ftp)){
			ftp.disconnect();
			throw new IISPException("Invalid Login Credentials");
		}
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		ftp.enterLocalPassiveMode();
		
		//Uploading of file
		ftp.changeWorkingDirectory("/var/XXAPPS/XXAP_INTERFACE/HO/data");
		InputStream input = new FileInputStream(file);
		ftp.storeFile(fileName,input);
		if(!isPositiveReply(ftp)){
			ftp.disconnect();
			throw new IISPException("Error in uploading the file");
		}
		ftp.logout();
	}
	
	public static void uploadRfp(File file, String fileName) throws SocketException, IOException, IISPException{
		FTPClient ftp = new FTPClient();
		ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
		ftp.connect(HOST);
		if(!isPositiveReply(ftp)){
			ftp.disconnect();
			throw new IISPException("Exception in connecting to the ftp server");
		}
		
		ftp.login(USERNAME, PASSWORD);
		if(!isPositiveReply(ftp)){
			ftp.disconnect();
			throw new IISPException("Invalid Login Credentials");
		}
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		ftp.enterLocalPassiveMode();
		
		//Uploading of file
		ftp.changeWorkingDirectory("/var/XXAPPS/XXAP_INTERFACE/Branch/data");
		InputStream input = new FileInputStream(file);
		ftp.storeFile(fileName,input);
		if(!isPositiveReply(ftp)){
			ftp.disconnect();
			throw new IISPException("Error in uploading the file");
		}
		ftp.logout();
	}
	private static boolean isPositiveReply(FTPClient ftp){
		int reply = ftp.getReplyCode();
		return FTPReply.isPositiveCompletion(reply);
	}
}