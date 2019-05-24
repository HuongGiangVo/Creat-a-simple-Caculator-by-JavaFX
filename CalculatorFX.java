/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorfx;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Pham
 */
public class CalculatorFX extends Application implements EventHandler<ActionEvent>{
    //parametter to keep the value enter    
    private TextField result;
    private long number1 = 0;
    private String operator ="";
    private boolean start = true;
    private Model model = new Model();    
 
       
    @Override
    public void start(Stage primaryStage) {
       
        primaryStage.setTitle("JavaFX Calculator");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
         
        result = new TextField();
        result.setAlignment(Pos.CENTER_RIGHT);
        grid.add(result,0,0,5,1);        
        
        Button buttonSeven = new Button("7");
        
        HBox hbBtn7 = new HBox(10);
        hbBtn7.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn7.getChildren().add(buttonSeven);
        grid.add(hbBtn7, 1,1);
        buttonSeven.setPrefSize(50, 20);         
        buttonSeven.setOnAction(this);

        Button buttonEight = new Button("8");
        HBox hbBtn8 = new HBox(10);
        hbBtn8.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn8.getChildren().add(buttonEight);
        grid.add(hbBtn8, 2,1);
        buttonEight.setPrefSize(50, 20);
        buttonEight.setOnAction(this);
                
        Button buttonNine = new Button("9");
        HBox hbBtn9 = new HBox(10);
        hbBtn9.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn9.getChildren().add(buttonNine);
        grid.add(hbBtn9,3,1);
        buttonNine.setPrefSize(50, 20);
        buttonNine.setOnAction(this);
        
        Button buttonAdd = new Button("+");
        HBox hbBtnA = new HBox(10);
        hbBtnA.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnA.getChildren().add(buttonAdd);
        grid.add(hbBtnA,4,1);
        buttonAdd.setPrefSize(50, 20);
        buttonAdd.setOnAction(this);
        
        Button buttonFour = new Button("4");
        HBox hbBtn4 = new HBox(10);
        hbBtn4.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn4.getChildren().add(buttonFour);
        grid.add(hbBtn4, 1,2);
        buttonFour.setPrefSize(50, 20);
        buttonFour.setOnAction(this);        

        Button buttonFive = new Button("5");
        HBox hbBtn5 = new HBox(10);
        hbBtn5.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn5.getChildren().add(buttonFive);
        grid.add(hbBtn5, 2,2);
        buttonFive.setPrefSize(50, 20);
        buttonFive.setOnAction(this);
        
        Button buttonSix = new Button("6");
        HBox hbBtn6= new HBox(10);
        hbBtn6.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn6.getChildren().add(buttonSix );
        grid.add(hbBtn6,3,2);
        buttonSix.setPrefSize(50, 20);
        buttonSix.setOnAction(this);
        
        Button buttonSub = new Button("-");
        HBox hbBtnS = new HBox(10);
        hbBtnS.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnS.getChildren().add(buttonSub);
        grid.add(hbBtnS,4,2);
        buttonSub.setPrefSize(50, 20);
        buttonSub.setOnAction(this);
        
        Button buttonOne = new Button("1");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn1.getChildren().add(buttonOne);
        grid.add(hbBtn1, 1,3);
        buttonOne.setPrefSize(50, 20);
        buttonOne.setOnAction(this);

        Button buttonTwo = new Button("2");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn2.getChildren().add(buttonTwo);
        grid.add(hbBtn2, 2,3);
        buttonTwo.setPrefSize(50, 20);
        buttonTwo.setOnAction(this);
        
        Button buttonThree = new Button("3");
        HBox hbBtn3= new HBox(10);
        hbBtn3.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn3.getChildren().add(buttonThree );
        grid.add(hbBtn3,3,3);
        buttonThree.setPrefSize(50, 20);
        buttonThree.setOnAction(this);
        
        Button buttonM = new Button("*");
        HBox hbBtnM = new HBox(10);
        hbBtnM.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnM.getChildren().add(buttonM);
        grid.add(hbBtnM,4,3);
        buttonM.setPrefSize(50, 20);
        buttonM.setOnAction(this);        

        Button buttonC = new Button("C");
        HBox hbBtnC = new HBox(10);
        hbBtnC.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnC.getChildren().add(buttonC);
        grid.add(hbBtnC, 1,4);
        buttonC.setPrefSize(50, 20);
        buttonC.setOnAction(this);
        
        Button buttonZ = new Button("0");
        HBox hbBtnZ= new HBox(10);
        hbBtnZ.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnZ.getChildren().add(buttonZ );
        grid.add(hbBtnZ,2,4);
        buttonZ.setPrefSize(50, 20);
        buttonZ.setOnAction(this);
        
        Button buttonE = new Button("=");
        HBox hbBtnE = new HBox(10);
        hbBtnE.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnE.getChildren().add(buttonE);
        grid.add(hbBtnE,3,4);
        buttonE.setPrefSize(50, 20);
        buttonE.setOnAction(this);
        
        Button buttonD = new Button("/");
        HBox hbBtnD = new HBox(10);
        hbBtnD.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnD.getChildren().add(buttonD);
        grid.add(hbBtnD, 4,4);
        buttonD.setPrefSize(50, 20);
        buttonD.setOnAction(this);
        
        Scene scene = new Scene(grid,300,200);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        String value =((Button)event.getSource()).getText();
        switch(value)
        {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
                processNumbers(event);
                break;    
            case "+":
            case "-":
            case "*":
            case "/":
            case "=":
                processOperators(event);
                 break;  
            default:
                reset();
                 break;  
        }
    }
    
    public void processNumbers(ActionEvent event){
        if(start){
            result.setText("");
            start = false;
        }
        String value =((Button)event.getSource()).getText();
        result.setText(result.getText()+value);        
    }
    
    public void processOperators(ActionEvent event){
        String value =((Button)event.getSource()).getText();
        if(!value.equals("=")){
            if(!operator.isEmpty())
                return;
            operator = value;
            number1 = Long.parseLong(result.getText());
            result.setText("");
        }
        else{
            if(operator.isEmpty())
                return;
            long number2 = Long.parseLong(result.getText());
            float output = model.calculate(number1, number2, operator);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }
    
    public void reset() {
        result.setText("");
        operator = "";
        start = true;
    }
    
}
