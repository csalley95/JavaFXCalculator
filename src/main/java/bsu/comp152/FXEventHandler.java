package bsu.comp152;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXEventHandler {
    @FXML
    private TextField numbers;
    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;

    int firstNumber;
    String operation;

    @FXML
    public void numberClicked(ActionEvent event){
        var numberPressed = ((Button)event.getSource()).getText();  //tells us which button is pressed
        var currentNum = numbers.getText();
        currentNum = currentNum + numberPressed;
        numbers.setText(currentNum);
    }

    public void operatorClicked(ActionEvent event){
        var numberAsText = numbers.getText(); //takes the number from earlier
        firstNumber = Integer.parseInt(numberAsText);   //turns a string into a integer
        numbers.clear();    //clears the text field for the next number
        operation = ((Button)event.getSource()).getText();
    }

    public void calculate(ActionEvent event){
        var currentNumberAsText= numbers.getText();
        var currentNumber = Integer.parseInt(currentNumberAsText);
        switch(operation){
            case "+":
                var result = firstNumber + currentNumber;
                numbers.setText(""+result);
                break;
            case"-":
                result = firstNumber - currentNumber;
                numbers.setText(""+result);
                break;
            case"*":
                result = firstNumber * currentNumber;
                numbers.setText(""+result);
                break;
            case"/":
                result = firstNumber / currentNumber;
                numbers.setText(""+result);
                break;
        }
    }

    @FXML
    public void clear(ActionEvent event){
        firstNumber = 0;
        operation = "";
        numbers.clear();
    }
}
