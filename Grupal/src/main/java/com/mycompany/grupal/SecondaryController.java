package com.mycompany.grupal;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modelos.Alumno;

//VISTA PARA VER LA TABLA DE ALUMNADO LOS ALUMNOS
public class SecondaryController implements Initializable{

    @FXML
    private TableColumn<Alumno, String> cNombre;
    @FXML
    private TableColumn<Alumno, Date> cFecha;
    @FXML
    private TableColumn<Alumno, String> cTipo;
    @FXML
    private TableColumn<Alumno, Integer> cHoras;
    @FXML
    private TableColumn<Alumno, String> cActividad;
    @FXML
    private TableColumn<Alumno, String> cObservaciones;
    @FXML
    private Button btnDatos;
    @FXML
    private Button btnAñadir;
    @FXML
    private Button btnBorrar;
    @FXML
    private TableView<Alumno> tabla;

    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void switchToDatos(ActionEvent event) {
    }

    @FXML
    private void switchToAñadir(ActionEvent event) throws IOException {
        App.setRoot("AñadirAlumno");
    }

    @FXML
    private void borrar(ActionEvent event) {
    Alumno seleccion = tabla.getSelectionModel().getSelectedItem();
    tabla.getItems().remove(seleccion);
    
    }
//    Alumno a = new Alumno();
//    a.setNombre(txtNombre.getText());
//    
//    LocalDate LocalDate = txtFecha_nac.getValue();
//    Date date = date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
//    a.setFecha(date);    
    
    
    
//    txtNombre.setCellValueFactory( new PropertyValueFactory<>("nombre") )
//    txtApellido.setCellValueFactory( new PropertyValueFactory<>("apellido") )
//    txtEmail.setCellValueFactory( new PropertyValueFactory<>("nombre") )
//    txtContraseña.setCellValueFactory( new PropertyValueFactory<>("nombre") )
//    txtDNI.setCellValueFactory( new PropertyValueFactory<>("nombre") )
//    txtTelefono.setCellValueFactory( new PropertyValueFactory<>("nombre") )
//    txtHoradD.setCellValueFactory( new PropertyValueFactory<>("nombre") )
//    txtHorasF.setCellValueFactory( new PropertyValueFactory<>("nombre") )
//    txtFecha_nac.setCellValueFactory( new PropertyValueFactory<>("nombre") )

//    
//    
//    
    
}