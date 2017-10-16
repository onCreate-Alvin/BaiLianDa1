package servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManager {

	public static void copyFile(String srcpath,String destpath){
		try{
		FileInputStream fis = new FileInputStream(srcpath);
		FileOutputStream fos = new FileOutputStream(destpath);
		byte[] b = new byte[1024];
		int len = -1;
		while ( (len=fis.read(b))!=-1 ) {
		fos.write(b,0,len);
		}
		fis.close();
		fos.close();
		}catch (Exception e) {
		}
	}
	
	public static void saveFile(String path,String txt){		
		try{
		File file = new File(path);
		   if (!file.exists()) {
		    file.createNewFile();
		   }

		   FileWriter fw = new FileWriter(file.getAbsoluteFile());
		   BufferedWriter bw = new BufferedWriter(fw);
		   bw.write(txt);
		   bw.close();
		   fw.close();
		}catch (Exception e) {
		}
	}
	public static String loadFile(String path){
		 StringBuilder result = new StringBuilder();
	        try{
	        	File file = new File(path);
	 		   if (!file.exists()) {
	 		    file.createNewFile();
	 		   }
	            BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()));//构造一个BufferedReader类来读取文件
	            String s = null;
	            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
	                result.append("\r\n"+s);
	            }
	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return result.toString();
	}
}
