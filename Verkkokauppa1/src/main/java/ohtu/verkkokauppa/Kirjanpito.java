
package ohtu.verkkokauppa;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kirjanpito implements KirjanpitoRajapinta {
    
    private ArrayList<String> tapahtumat;
    
    @Autowired
    public Kirjanpito(){
        tapahtumat = new ArrayList<>();
    }

    
    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    @Override
    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }       
}
