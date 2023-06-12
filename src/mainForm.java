import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField textIngresoNombre;
    private JButton ingresarPlatoButton;
    private JTextArea textAIngresoPlatos;
    private JButton QuemarDatosButton;
    private JTextField textIngresoPrecio;
    private JTextField textIngresoCalorias;
    private JTextField textIngresoPreparacion;
    private JButton buscarModifButton;
    private JButton modificarModifButton;
    private JTextField textoModifNombre;
    private JTextField textoModifPrecio;
    private JTextField textoModifCalorias;
    private JTextField textoModifPreparacion;
    private JTextArea textAModif;
    private JButton ButtonBuscarEliminar;
    private JTextField textNombreEliminar;
    private JTextArea textAEliminar;
    private JButton eliminarButton;
    private JComboBox comboBoxOrder;
    private JButton mostrarButton;
    private JTextArea textAMostrar;
    private JButton buscarButton;
    private JTextField textBuscarPlatoOrden;
    private Plato platoModificar;
    private Plato platoEliminar;
    private Menu m = new Menu();

    public mainForm() {

        ingresarPlatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textIngresoNombre.getText().isEmpty() && !textIngresoPrecio.getText().isEmpty() &&
                        !textIngresoCalorias.getText().isEmpty() && !textIngresoPreparacion.getText().isEmpty()){
                    Plato p2 = new Plato(textIngresoNombre.getText(), Double.parseDouble(textIngresoPrecio.getText()),
                            Double.parseDouble(textIngresoCalorias.getText()),
                            Integer.parseInt(textIngresoPreparacion.getText()));

                    m.agregarPlato(p2, textAIngresoPlatos);

                    textAIngresoPlatos.setText(p2.toString());
                }else{
                    textAIngresoPlatos.setText("Datos incompletos para el ingreso");
                }


            }
        });
        QuemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.quemarDatos(textAIngresoPlatos);
                QuemarDatosButton.setEnabled(false);

            }
        });
        buscarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                platoModificar = m.buscarPorNombre(textoModifNombre.getText());
                if(platoModificar!=null){
                    textAModif.setText(platoModificar.toString());
                    textoModifCalorias.setEditable(true);
                    textoModifPreparacion.setEditable(true);
                    textoModifPrecio.setEditable(true);
                }else{
                    textAModif.setText("No se encontro ese plato");
                }

            }
        });
        modificarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    if(!textoModifPrecio.getText().isEmpty()&&!textoModifCalorias.getText().isEmpty()&&
                    !textoModifPreparacion.getText().isEmpty()){
                        m.modificarPlato(platoModificar, Double.parseDouble(textoModifPrecio.getText()),
                                Double.parseDouble(textoModifCalorias.getText()),
                                Integer.parseInt(textoModifPreparacion.getText()));
                        textAModif.setText(platoModificar.toString());
                    }else{
                        textAModif.setText("Datos incompletos para la modificacion");
                    }


            }
        });
        ButtonBuscarEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                platoEliminar = m.buscarPorNombre(textNombreEliminar.getText());
                if(platoEliminar!=null){
                    textAEliminar.setText("Plato encontrado: \n" +platoEliminar.toString());
                }else{
                    textAEliminar.setText("No se encontro ese plato");
                }
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.eliminarPlato(platoEliminar, textAEliminar);
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    //Get mainPanel
    public JPanel getMainPanel() {
        return mainPanel;
    }
}
