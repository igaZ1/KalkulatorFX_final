/**
 * Sample Skeleton for 'calculator.fxml' Controller Class
 */

package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class KalkulatorController {

    double w = 0;
    String op;
    boolean isOP = false;
    boolean isDot = false;
    boolean wasEq = false;

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btn8"
    private Button btn8; // Value injected by FXMLLoader

    @FXML // fx:id="btnPlus"
    private Button btnPlus; // Value injected by FXMLLoader

    @FXML // fx:id="btnMin"
    private Button btnMin; // Value injected by FXMLLoader

    @FXML // fx:id="btnMult"
    private Button btnMult; // Value injected by FXMLLoader

    @FXML // fx:id="btn3"
    private Button btn3; // Value injected by FXMLLoader

    @FXML // fx:id="btnZnak"
    private Button btnZnak; // Value injected by FXMLLoader

    @FXML // fx:id="btnProc"
    private Button btnProc; // Value injected by FXMLLoader

    @FXML // fx:id="btnDot"
    private Button btnDot; // Value injected by FXMLLoader

    @FXML // fx:id="btn9"
    private Button btn9; // Value injected by FXMLLoader

    @FXML // fx:id="btn6"
    private Button btn6; // Value injected by FXMLLoader

    @FXML // fx:id="btnDiv"
    private Button btnDiv; // Value injected by FXMLLoader

    @FXML // fx:id="btnEq"
    private Button btnEq; // Value injected by FXMLLoader

    @FXML // fx:id="btn7"
    private Button btn7; // Value injected by FXMLLoader

    @FXML // fx:id="btn5"
    private Button btn5; // Value injected by FXMLLoader

    @FXML // fx:id="btn4"
    private Button btn4; // Value injected by FXMLLoader

    @FXML // fx:id="btn1"
    private Button btn1; // Value injected by FXMLLoader

    @FXML // fx:id="btn2"
    private Button btn2; // Value injected by FXMLLoader

    @FXML // fx:id="btn0"
    private Button btn0; // Value injected by FXMLLoader

    @FXML // fx:id="btnC"
    private Button btnC; // Value injected by FXMLLoader

    @FXML // fx:id="display"
    private TextField display; // Value injected by FXMLLoader

    @FXML
    void onButtonClick(ActionEvent event) {
        Button button = (Button) (event.getSource());
        Kalkulator kalkulator = new Kalkulator();
        double temp;



        if (button == btnC){
            display.clear();
            w=0;
            isDot=false;
            isOP = false;
            op = "";
            wasEq=false;

        }
        else if (button == btnPlus){
            temp = Double.valueOf(display.getText());
            if (isOP==true){
                double w2 = kalkulator.oblicz(getW(), op, temp);
                setW(w2);
            } else if (isOP==false){
                setW(temp);
            }

            op = "+";
            isOP = true;
            display.clear();
            isDot=false;
            wasEq=false;

        }
        else if (button == btnMin){
            temp = Double.valueOf(display.getText());
            if (isOP==true){
                double w2 = kalkulator.oblicz(getW(), op, temp);
                setW(w2);
            } else if (isOP==false){
                setW(temp);
            }

            op = "-";
            isOP = true;
            display.clear();
            isDot=false;
            wasEq=false;

        }
        else if (button == btnMult){
            temp = Double.valueOf(display.getText());
            if (isOP==true){
                double w2 = kalkulator.oblicz(getW(), op, temp);
                setW(w2);
            } else if (isOP==false){
                setW(temp);
            }

            op = "*";
            isOP = true;
            display.clear();
            isDot=false;
            wasEq=false;

        }
        else if (button == btnDiv){
            temp = Double.valueOf(display.getText());
            if (isOP==true){
                double w2 = kalkulator.oblicz(getW(), op, temp);
                setW(w2);
            } else if (isOP==false){
                setW(temp);
            }

            op = "/";
            isOP = true;
            display.clear();
            isDot=false;
            wasEq=false;

        }
        else if (button == btnZnak){
            temp = Double.valueOf(display.getText());
            if (isOP==true){
                double w2 = kalkulator.oblicz(getW(), op, temp);
                setW(-w2);
            } else if (isOP==false){
                setW(-temp);
            }

            op = "";
            isOP = false;
            display.setText(String.valueOf(getW()));
            isDot=false;
            wasEq=false;

        }
        else if (button == btnProc){
            temp = Double.valueOf(display.getText());
            if (isOP==true){
                if (op=="+"  ||  op=="-") {
                    double tp = w*temp/100;
                    double w2 = kalkulator.oblicz(w, op, tp);
                    setW(w2);
                } else {
                    double tp = temp/100;
                    double w2 = kalkulator.oblicz(w, op, tp);
                    setW(w2);
                }
            } else if (isOP==false){
                setW(temp/100);
            }

            op = "";
            isOP = false;
            display.setText(String.valueOf(getW()));
            isDot=false;


            if (w%1==0){
                isDot=false;
            }
            else isDot=true;
            wasEq=false;

        }
        else if (button == btnEq){
            temp = Double.valueOf(display.getText());
            if (isOP==true){
                double w2 = kalkulator.oblicz(getW(), op, temp);
                setW(w2);
            } else if (isOP==false){
                setW(temp);
            }

            display.setText(String.valueOf(getW()));
            isOP = false;

            if (w%1==0){
            isDot=false;
            }
            else isDot=true;

            wasEq = true;


        }
        else if (button == btnDot){
            if(isDot==false){
                String label = button.getText();
                System.out.println(label);
                String text = display.getText();
                text = text + "\n" + label;
                display.setText(text);
                isDot=true;
            }else {System.out.println("Error. Jest juz kropka");}
            wasEq=false;

        }
        else if (button == btn0){
            if(w==0 && isDot==false) {
                display.setText("0");
                System.out.println("Error. Jest juz 1 zero");
            }
            else if(String.valueOf(w)!="0") {
                String label = button.getText();
                System.out.println(label);
                String text = display.getText();
                text = text + "\n" + label;
                display.setText(text);
                isDot=true;

                }
            wasEq=false;

        }
        else{
            if (wasEq==true){
                display.clear();
                wasEq=false;
            }
            String label = button.getText();
            System.out.println(label);
            String text = display.getText();
            text = text + "\n" + label;
            display.setText(text);
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btn8 != null : "fx:id=\"btn8\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnPlus != null : "fx:id=\"btnPlus\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnMin != null : "fx:id=\"btnMin\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnMult != null : "fx:id=\"btnMult\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn3 != null : "fx:id=\"btn3\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnZnak != null : "fx:id=\"btnZnak\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnProc != null : "fx:id=\"btnProc\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnDot != null : "fx:id=\"btnDot\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn9 != null : "fx:id=\"btn9\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn6 != null : "fx:id=\"btn6\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnDiv != null : "fx:id=\"btnDiv\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnEq != null : "fx:id=\"btnEq\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn7 != null : "fx:id=\"btn7\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn5 != null : "fx:id=\"btn5\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn4 != null : "fx:id=\"btn4\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn1 != null : "fx:id=\"btn1\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn2 != null : "fx:id=\"btn2\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btn0 != null : "fx:id=\"btn0\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnC != null : "fx:id=\"btnC\" was not injected: check your FXML file 'calculator.fxml'.";
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'calculator.fxml'.";

    }
}
