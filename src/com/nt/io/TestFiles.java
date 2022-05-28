package com.nt.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFiles {
	void m1() throws IOException {
		FileOutputStream fos=new FileOutputStream("D:\\file\\doc.txt");
		String s="this is vijay";
		byte[] d=s.getBytes();
		fos.write(d);
		System.out.println("data is saved");
		System.out.println("------------");
		FileInputStream fis=new FileInputStream("D:\\file\\doc.txt");
		BufferedReader reader=new BufferedReader (new InputStreamReader(fis));
	String z;
		while((z=reader.readLine())!=null){
			System.out.println(z);
			
		}
		fos.close();
		reader.close();
	}
		void m2() throws Exception {
			FileReader re=new FileReader("D:\\file\\doc.txt");
			int e;
			while((e=re.read())!=-1) {
				System.out.println(e);
			}
			re.close();
			
		}
		void m3() throws Exception {
			int v=5;
			String s="java";
			double f=25.5;
			float g=56.3f;
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\file\\doc1.txt"));
			dos.writeInt(v);
			dos.writeUTF(s);			
			dos.writeDouble(f);
			dos.writeFloat(g);
			System.out.println("data is saved");
			System.out.println("----------------");
			DataInputStream dis=new DataInputStream(new FileInputStream("D:\\file\\doc1.txt"));
			System.out.println(dis.readInt());
			System.out.println (dis.readUTF());
			System.out.println(dis.readDouble());
			System.out.println(dis.readFloat());
			System.out.println("data is retrieved");
			dis.close();
			dos.close();
		}

	public static void main(String[] args) throws Exception {
		TestFiles ts=new TestFiles();
		ts.m1();
		ts.m2();
		ts.m3();
		

	}

}
