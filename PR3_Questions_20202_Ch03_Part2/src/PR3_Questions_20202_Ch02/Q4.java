/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR3_Questions_20202_Ch02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.xml.bind.DatatypeConverter;
import sun.security.util.Password;

/**
 *
 * @author khatib
 */
public class Q4 extends Application {

    Button signin;
    Button Exit;
    PasswordField Passwords;
    TextField User;
    Button Add;
    Button Add2;
    ListView<String> listV;
    Label labe2;

    Label ID;
    TextField ID1;
    HBox hBoxID;

    Label Name;
    TextField Name1;
    HBox hBoxName;

    Label Major;
    TextField Major1;
    HBox hBoxMajor;

    Label Grade;
    TextField Grade1;
    HBox hBoxGrade;

    Button Reset;
    HBox hBox1;

    VBox vbox1;

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("Login Page");
        Label label = new Label(" Welcome ");
        label.setFont(new Font("Cambria", 32));

        Label UserName = new Label("User Name : ");
        Label Password = new Label("Password  : ");

        User = new TextField();
        Passwords = new PasswordField();

        HBox hBoxUser = new HBox(UserName, User);
        HBox hBoxPass = new HBox(Password, Passwords);

        signin = new Button("sign in");
        signin.setStyle("-fx-background-color:DarkCyan");
        Exit = new Button("Exit");
        Exit.setStyle("-fx-background-color:DarkCyan");

        EventHandler<ActionEvent> EventHandlerl = null;
        signin.setOnAction(EventHandlerl);

        HBox hBox = new HBox(signin, Exit);
        hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-background-color:Gray  ");

        VBox vBox = new VBox(label, hBoxUser, hBoxPass, hBox);
        vBox.setAlignment(Pos.CENTER);
        label.setContentDisplay(ContentDisplay.LEFT);
        label.setAlignment(Pos.CENTER_LEFT);
        vBox.setStyle("-fx-background-color:Gray  ");

        Scene scene1 = new Scene(vBox, 300, 250);
        Stage Stage1 = new Stage();
        Stage1.setTitle("Login Page");
        Stage1.setScene(scene1);
        Stage1.show();

        String password = Passwords.getText();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter.printHexBinary(digest);

//*********************
        signin.setOnAction(event -> {

            PrintWriter PW = null;
            try {
                String file = "src/Q4FX/Q4.txt";
                PW = new PrintWriter(new FileOutputStream(file, true));
                User us = new User(User.getText(), myHash);
                PW.print(us);
                User.clear();
                Passwords.clear();
                PW.flush();
                PW.close();
                Button Add = new Button("Add Student");
                Add.setStyle("-fx-background-color:DarkCyan");
                Button View = new Button("View Student");
                View.setStyle("-fx-background-color:DarkCyan");

                VBox vBox1 = new VBox(Add, View);
                vBox1.setStyle("-fx-background-color:Gray  ");

                vBox1.setAlignment(Pos.CENTER);
                Scene scene2 = new Scene(vBox1, 300, 250);
                Stage Stage2 = new Stage();
                Stage2.setTitle("Optione Page");
                Stage2.setScene(scene2);
                Stage2.show();
//****************************
                Add.setOnAction(EventHandlerl2 -> {
                    labe2 = new Label(" Student data ");

                    ID = new Label("id :   ");
                    ID1 = new TextField();
                    hBoxID = new HBox(ID, ID1);

                    Name = new Label("Name : ");
                    Name1 = new TextField();
                    hBoxName = new HBox(Name, Name1);

                    Major = new Label("Major  : ");
                    Major1 = new TextField();
                    hBoxMajor = new HBox(Major, Major1);

                    Grade = new Label("Grade  : ");
                    Grade1 = new TextField();
                    hBoxGrade = new HBox(Grade, Grade1);

                    Add2 = new Button("Add");
                    Reset = new Button("Reset");
                    Exit = new Button("Exit");
                    hBox1 = new HBox(Add2, Reset, Exit);

                    vbox1 = new VBox(labe2, hBoxID, hBoxName, hBoxMajor, hBoxGrade, hBox1);
                    vbox1.setAlignment(Pos.CENTER_LEFT);

                    vbox1.setStyle("-fx-background-color:Gray  ");

                    Scene scene3 = new Scene(vbox1, 230, 230);
                    Stage Stage3 = new Stage();
                    primaryStage.setScene(scene3);
                    primaryStage.setTitle("Student Entry Page");
                    primaryStage.show();

                    //************
                    Add2.setOnAction((ActionEvent e) -> {
                        Label labe2 = new Label(" Student data ");

                        ID = new Label("id :   ");
                        ID1 = new TextField();
                        hBoxID = new HBox(ID, ID1);

                        Name = new Label("Name : ");
                        Name1 = new TextField();
                        hBoxName = new HBox(Name, Name1);

                        Major = new Label("Major  : ");
                        Major1 = new TextField();
                        hBoxMajor = new HBox(Major, Major1);

                        Grade = new Label("Grade  : ");
                        Grade1 = new TextField();
                        hBoxGrade = new HBox(Grade, Grade1);

                        Add2 = new Button("Add");
                        Reset = new Button("Reset");
                        Exit = new Button("Exit");
                        hBox1 = new HBox(Add2, Reset, Exit);

                        VBox vbox1 = new VBox( labe2,hBoxID, hBoxName, hBoxMajor, hBoxGrade, hBox1);
                        vbox1.setAlignment(Pos.CENTER_LEFT);

                        ListView listV = new ListView();
                    Student ss=new Student();
                        ss.setID(Integer.parseInt(ID1.getText()));
                        ss.setName(Name1.getText());
                        ss.setMajor(Major1.getText());
                        // ل  parseDouble  تحول من سترنج الى دبل 
                        // وفي منها للانتجر ولكل واحد 
//                        ss.setGrade(Double.parseDouble(Grade1.getText()));
//                        listV.getItems().add(ss);
//                        listV.getItems().setAll(listV.getItems().sorted(
//                                (Student o1, Student o2) -> -Double.compare(o1.getGrade(), o1.getGrade())));

                        
          
                        HBox hBox2 = new HBox(vbox1, listV);
                        hBox2.setStyle("-fx-background-color:Gray  ");

                        Scene scene = new Scene(hBox2, 400, 400);
                        primaryStage.setScene(scene);
                        primaryStage.setTitle("Student Entry Page");
                        primaryStage.show();

                        
                               
             });
                });

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Q4.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                PW.close();
            }

        });
        Exit.setOnAction(event -> {
            System.exit(0);
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
