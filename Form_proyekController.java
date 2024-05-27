/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ui_sistemmanajemenproyek;

import db.DBHelper;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Form_proyekController implements Initializable {

    @FXML
    private Button btnAgt;

    @FXML
    private Button btnJdwl;

    @FXML
    private Button btnMainMenu;

    @FXML
    private Button btnTambah;

    @FXML
    private Button btnTgs;

    @FXML
    private Button btnTim;

    @FXML
    private TextField fldAnggaran;

    @FXML
    private TextField fldDeadline;

    @FXML
    private TextField fldId;

    @FXML
    private TextField fldNama;

    @FXML
    private TextArea fldTujuan;

    @FXML
    private Label lblUsername;

    @FXML
    void goDashboard(ActionEvent event) {

    }

    @FXML
    void goToFormAnggota(ActionEvent event) {

    }

    @FXML
    void goToFormJadwal(ActionEvent event) {

    }

    @FXML
    void goToFormTim(ActionEvent event) {

    }

    @FXML
    void goToFormTugas(ActionEvent event) {

    }
    
    @FXML
    void insertData(ActionEvent event) {
            if(event.getSource() == btnTambah){
                tambahData();
                showInfoDialog("Berhasil", "Berhasil menambah data");
            }
    }   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String username = InformasiSesi.getUsername();
        lblUsername.setText(username);
    } 
    
    private void tambahData(){
        String query = "INSERT INTO `daftar_proyek` VALUES ('" + fldId.getText() + "','" + fldNama.getText() + "','" + fldTujuan.getText() + "','" + fldDeadline.getText() + "','" + fldAnggaran.getText() + "')";
        update(query);
        
        fldId.clear();
        fldNama.clear();
        fldTujuan.clear();
        fldDeadline.clear();
        fldAnggaran.clear();
    }
    
    private void update(String query){
        Connection conn = DBHelper.getConnection();
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.createStatement();
            st.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    private void showInfoDialog(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
    
}
