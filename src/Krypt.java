
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Krypt {

    public static void main (){
        View theView = new View();
        Model theModel = new Model();
        Controller theController = new Controller(theView,theModel);
    //    theView.setVisible(true);
    }
}

class Model {
// ta emot och beräkna
    private String message;
    private String key;
    private String crypt;
    /**ta emot fil eller text*/
    public void setMessage(String message) {
        this.message = message;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getCrypt() {
        return crypt;
    }

    public void cryptString() {
    private String expandKey(String key)
    }
    /**läsa fil eller text*/

    while (key.length() < message.length()){
        key = expandKey(key);
    }

    /**fil/text ^ key*/
    int fileOutput = fileInput^Key;
    /**spara output*/



}
class View {
    private JPanel panel;
    private JTextField message;
    private JTextField key;
    private JTextField crypt;
    private JButton cryptButton;


}
class Controller {
    Model model;
    View view;

}