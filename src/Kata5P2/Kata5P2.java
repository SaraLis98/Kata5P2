
package Kata5P2;

import Kata5P2.model.*;

import java.io.IOException;
import java.util.List;
import Kata5P2.view.HistogramDisplay;
import Kata5P2.view.MailHistogramBuilder;
import Kata5P2.view.MailListReader;

public class Kata5P2 {

    private static List<String> listMails;
    private static Histogram histograma;
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
   
     public static void input() throws IOException{
        MailListReader bd = new MailListReader();
        listMails = bd.read("jdbc:sqlite:Kata5.db", "email");
    }
    
    public static void process(){
        MailHistogramBuilder builded = new MailHistogramBuilder();
        histograma = builded.build(listMails);

    }
    
    public static void output(){
        new HistogramDisplay(histograma).execute();
    }
}