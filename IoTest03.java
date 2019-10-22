package cn.io.study02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 文件字节输出流
 *  1，创建源
 * 2，选择流
 * 3，操作  ：写出neirong
 * 4，释放资源
 * @author dell
 *
 */

public class IoTest03 {
	public static void main(String[] args) {
		File src=new File("dest.txt");
		OutputStream os=null;
		try {
			os=new FileOutputStream(src,true);
			String str="hello     words";
			byte[] datas=str.getBytes();//字符串到字节数字（编码）
			os.write(datas,0,datas.length);
			os.flush();//刷新，防止出现阻塞。
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
