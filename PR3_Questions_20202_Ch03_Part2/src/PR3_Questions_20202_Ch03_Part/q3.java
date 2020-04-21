/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR3_Questions_20202_Ch03_Part;

import PR3_Questions_20202_Ch03_Part2.Student1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.security.MessageDigest;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.event.ActionEvent;

import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import javafx.stage.Stage;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author khatib
 */
public class q3 extends Application {

    Button signin;
    Button Exit;
    PasswordField Passwords;
    TextField User;
    Button Add;
    Button Add2;
    ListView<Student1> listV = new ListView<>();

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
        listV.setMaxSize(300, 250);
        primaryStage.setTitle("Login Page");
        Label label = new Label(" Welcome ");
        label.setFont(new Font("Cambria", 32));

        Label UserName = new Label("User Name : ");
        Label Password = new Label("Password  : ");

        User = new TextField();
        Passwords = new PasswordField();

        HBox hBoxUser = new HBox(5, UserName, User);
        hBoxUser.setAlignment(Pos.CENTER);
        HBox hBoxPass = new HBox(5, Password, Passwords);
        hBoxPass.setAlignment(Pos.CENTER);

        signin = new Button("sign in");
        signin.setStyle("-fx-background-color:DarkCyan");
        Exit = new Button("Exit");
        Exit.setStyle("-fx-background-color:DarkCyan");

        HBox hBox = new HBox(5, signin, Exit);
        hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-background-color:Gray  ");

        VBox vBox = new VBox(10, label, hBoxUser, hBoxPass, hBox);
        vBox.setAlignment(Pos.CENTER);
//        label.setContentDisplay(ContentDisplay.LEFT);
//        label.setAlignment(Pos.CENTER_LEFT);
        vBox.setStyle("-fx-background-color:Gray  ");

        String password = Passwords.getText();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter.printHexBinary(digest);

        Scene scene1 = new Scene(vBox, 300, 250);
        Stage Stage1 = new Stage();
        Stage1.setTitle("Login Page");
        Stage1.setScene(scene1);
        Stage1.show();
//*********************
        signin.setOnAction((ActionEvent event) -> {

            PrintWriter PW = null;
            try {
                String file = "src/PR3_Questions_20202_Ch03_Part/tet.txt";
                PW = new PrintWriter(new FileOutputStream(file, true));
                User us = new User(User.getText(), myHash);
                PW.print(us);
                User.clear();
                Passwords.clear();
                PW.flush();
                PW.close();
                Add = new Button("Add Student");
                Add.setStyle("-fx-background-color:DarkCyan");
                Button View = new Button("View Student");
                View.setStyle("-fx-background-color:DarkCyan");

                VBox vBox1 = new VBox(10, Add, View);
                vBox1.setStyle("-fx-background-color:Gray  ");

                vBox1.setAlignment(Pos.CENTER);
                Scene scene2 = new Scene(vBox1, 300, 250);
                Stage Stage2 = new Stage();
                Stage2.setTitle("Optione Page");
                Stage2.setScene(scene2);
                Stage2.show();
//****************************
                Add.setOnAction((ActionEvent EventHandlerl2) -> {

                    labe2 = new Label(" Student data ");

                    ID = new Label("id :   ");
                    ID1 = new TextField("");
                    hBoxID = new HBox(5, ID, ID1);

                    Name = new Label("Name : ");
                    Name1 = new TextField("");
                    hBoxName = new HBox(5, Name, Name1);

                    Major = new Label("Major  : ");
                    Major1 = new TextField("");
                    hBoxMajor = new HBox(5, Major, Major1);

                    Grade = new Label("Grade  : ");
                    Grade1 = new TextField("");
                    hBoxGrade = new HBox(5, Grade, Grade1);

                    Add2 = new Button("Add");
                    Reset = new Button("Reset");
                    Exit = new Button("Exit");
                    hBox1 = new HBox(3, Add2, Reset, Exit);
                    hBox1.setAlignment(Pos.CENTER_RIGHT);
                    vbox1 = new VBox(10, labe2, hBoxID, hBoxName, hBoxMajor, hBoxGrade, hBox1);
                    vbox1.setAlignment(Pos.CENTER);

                    vbox1.setStyle("-fx-background-color:Gray  ");
                   
                    Add2.setOnAction((ActionEvent e) -> {
                        
                        Student1 sa = new Student1(
                                Integer.parseInt(ID1.getText()),
                                Name1.getText(), Major1.getText(), Double.parseDouble(Grade1.getText()));
                        listV.getItems().add(sa);

                        listV.getItems().setAll(listV.getItems().sorted(
                                (Student1 o1, Student1 o2) -> -Double.compare(o1.getGrade(), o2.getGrade())));
                    });

                    Reset.setOnAction(r -> {
                        ID1.clear();
                        Name1.clear();
                        Major1.clear();
                        Grade1.clear();
                    });

                    Exit.setOnAction(e -> {
                        System.exit(0);
                    });

                    HBox hBox2 = new HBox(10, vbox1, listV);
                    hBox2.setAlignment(Pos.CENTER);
                    hBox2.setStyle("-fx-background-color:Gray  ");
                    Scene scene = new Scene(hBox2, 600, 400);
                    Stage stg = new Stage();
                    stg.setScene(scene);
                    stg.setTitle("Student Entry Page");
                    stg.show();

                });
            } catch (FileNotFoundException ex) {
                Logger.getLogger(q3.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                PW.close();
            }

        });
        Exit.setOnAction(e -> {
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
