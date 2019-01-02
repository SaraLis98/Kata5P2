
package Kata5P2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import Kata5P2.model.Histogram;
import Kata5P2.model.Mail;
import Kata5P2.view.HistogramDisplay;
import Kata5P2.view.MailHistogramBuilder;
import Kata5P2.view.MailListReader;

public class Kata5P2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName;
        fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram <String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    } 
}
