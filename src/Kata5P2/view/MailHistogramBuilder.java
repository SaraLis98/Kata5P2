
package Kata5P2.view;

import java.util.List;
import Kata5P2.model.Histogram;
import Kata5P2.model.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> build (List <Mail> lista){
            Histogram<String> histogram = new Histogram <>();
            for (Mail mail : lista) {
                histogram.increment(mail.getDomain());            
            }
            return histogram;        
    }
}
