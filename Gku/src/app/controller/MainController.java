package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.Personajes;

public class MainController {

    @FXML
    private TextField txtNombre;

    @FXML
    private ComboBox<String> cbRaza;

    @FXML
    private TextField txtPoder;

    @FXML
    private TextField txtPlaneta;

    @FXML
    private TextField txtTecnica;

    @FXML
    private TextField txtEdad;

    @FXML
    private GridPane gridPersonajes;

    private int fila = 1;

    @FXML
    public void initialize() {

        cbRaza.getItems().addAll(
                "Saiyajin",
                "Humano",
                "Namekiano",
                "Androide",
                "Majin",
                "Freezer Race"
        );
    }

    @FXML
    private void agregarPersonaje() {

        try {

            String nombre = txtNombre.getText();
            String raza = cbRaza.getValue();
            String planeta = txtPlaneta.getText();
            String tecnica = txtTecnica.getText();

            int poder = Integer.parseInt(txtPoder.getText());
            int edad = Integer.parseInt(txtEdad.getText());

            if (nombre.isEmpty() || planeta.isEmpty() || tecnica.isEmpty() || raza == null) {
                mostrarError("Ningún campo puede estar vacío");
                return;
            }

            if (poder <= 0 || edad <= 0) {
                mostrarError("Edad y poder deben ser mayores que 0");
                return;
            }

            Personajes personaje = new Personajes(
                    nombre,
                    raza,
                    poder,
                    planeta,
                    tecnica,
                    edad
            );

            agregarAGrid(personaje);
            limpiarCampos();

        } catch (Exception e) {
            mostrarError("Poder y edad deben ser números");
        }
    }

    private void agregarAGrid(Personajes p) {

        gridPersonajes.add(new Label(p.getNombre()), 0, fila);
        gridPersonajes.add(new Label(p.getRaza()), 1, fila);
        gridPersonajes.add(new Label(String.valueOf(p.getNivelPoder())), 2, fila);
        gridPersonajes.add(new Label(p.getPlanetaOrigen()), 3, fila);
        gridPersonajes.add(new Label(p.getTecnicaEspecial()), 4, fila);
        gridPersonajes.add(new Label(String.valueOf(p.getEdad())), 5, fila);

        fila++;
    }

    private void limpiarCampos() {

        txtNombre.clear();
        txtPoder.clear();
        txtPlaneta.clear();
        txtTecnica.clear();
        txtEdad.clear();
        cbRaza.setValue(null);
    }

    private void mostrarError(String mensaje) {

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("Error");
        alert.setContentText(mensaje);
        alert.show();
    }
}