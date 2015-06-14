/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wikipedia.page_grabber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WikipediaPage_grabber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter writer = new PrintWriter("info2.txt", "UTF-8");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Link To WikiPediaPage");
		String s = br.readLine();
		
		Document doc = Jsoup.connect(s).get();
		
Elements paragraphs = doc.select("p");
for(Element p : paragraphs){
	
	writer.print(" /n");
	writer.print(p.text());
	//Writing and printing to file same time :P 
}
    
System.out.println("Done! ALl The Data Is Stored In Info File In Same Directory!");
}



       
	}



