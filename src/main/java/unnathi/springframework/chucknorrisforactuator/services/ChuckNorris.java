package unnathi.springframework.chucknorrisforactuator.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChuckNorris {

   public String getRandomJoke(){
       ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
       return chuckNorrisQuotes.getRandomQuote();
   }

}
