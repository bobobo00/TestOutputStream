package cn.io.study02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * �ļ��ֽ������
 *  1������Դ
 * 2��ѡ����
 * 3������  ��д��neirong
 * 4���ͷ���Դ
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
			byte[] datas=str.getBytes();//�ַ������ֽ����֣����룩
			os.write(datas,0,datas.length);
			os.flush();//ˢ�£���ֹ����������
			
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
