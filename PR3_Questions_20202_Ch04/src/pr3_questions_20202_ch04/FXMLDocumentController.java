/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_questions_20202_ch04;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author khatib
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button buttonShow;
    @FXML
    private Button buttonAdd;
    @FXML
    private Button buttonUpdate;
    @FXML
    private Button buttonDelete;
    @FXML
    private Button buttonReset;
  
    @FXML
    private TableView<Student> TableView;
    @FXML
    private TextField TextFieldLD;
    @FXML
    private TextField TextFieldName;
    @FXML
    private TextField TextFieldMajor;
    @FXML
    private TextField TextFieldGrade;
    @FXML
    private TableColumn<Student, Integer> TCid;
    @FXML
    private TableColumn<Student, String> TCName;
    @FXML
    private TableColumn<Student, String> TCMajor;
    @FXML
    private TableColumn<Student, Double> TCGrade;
    
    Statement statement;
    @FXML
    private AnchorPane AnchorPane;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
         Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =
               DriverManager.
                getConnection("jdbc:mysql://127.0.0.1:3306/schools?serverTimezone=UTC",
                        "root", "root");
            this.statement = connection.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        TCid.setCellValueFactory(new PropertyValueFactory("id"));
        TCName.setCellValueFactory(new PropertyValueFactory("name"));
        TCMajor.setCellValueFactory(new PropertyValueFactory("major"));
        TCGrade.setCellValueFactory(new PropertyValueFactory("Grade"));

    }    

    @FXML
    private void buttonShowHandle(ActionEvent event) throws SQLException {
        ResultSet rs = this.statement.executeQuery("Select * From ٍStudent");
        TableView.getItems().clear();
        while(rs.next()){
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.getMajor(rs.getString("major"));
            student.setGrade(rs.getDouble("Grade"));
            TableView.getItems().add(student);
        }
    }

    @FXML
    private void buttonAddHandle(ActionEvent event) {
    }

    @FXML
    private void buttonUpdateHandle(ActionEvent event) {
    }

    @FXML
    private void buttonDeleteHandle(ActionEvent event) {
    }

    @FXML
    private void buttonResetHandle(ActionEvent event) {
    }
    
}
