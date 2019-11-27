package TrabajoFinal;

import TP8.Vehiculos;
import com.sun.deploy.uitoolkit.ToolkitStore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimerPanel extends JPanel {
    private String titulo;
    private int tam;
    private int cont=0;
    public PrimerPanel() {
        boolean seguir=dialogos();
        if (seguir==true){/**para que continue o no*/
            etiquetas();
            cajasdeTexto();
            botones();
        }else{

        }
    }
    public String getTituloCompleto() {
        return titulo;
    }

    public void setTitulo1(String titulo1) {
        this.titulo = titulo;
    }
    private boolean dialogos(){/**Para que no continue si no ingresa o si cancela la ventana*/
            titulo = "Examen de " + JOptionPane.showInputDialog("Ingrese nombre de la Materia");
            tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidadad de preguntas"));
            return true;
    }

    private void etiquetas() {

        JLabel etiqueta1 = new JLabel();
        JLabel etiqueta2 = new JLabel();
        JLabel etiqueta3 = new JLabel();

        etiqueta3.setText(getTituloCompleto());
        etiqueta3.setBounds(75,10 ,500,20);
        add(etiqueta3);

        etiqueta1.setText("Ingrese Pregunta: ");
        etiqueta1.setBounds(10,50,500,20);
        add(etiqueta1);

        etiqueta2.setText("Ingrese Respuesta: ");
        etiqueta2.setBounds(10,110,500,20);
        add(etiqueta2);
    }
    private void cajasdeTexto(){
        JTextField text1= new JTextField();
        JTextField text2= new JTextField();
        text1.setBounds(10,80,200,23);
        add(text1);
        text2.setBounds(10,140,100,23);
        add(text2);
    }

    private void botones(){
        JButton boton1=new JButton();
        JButton boton2=new JButton();

        boton1.setBounds(10,300,100,30);
        boton1.setText("Guardar");
        add(boton1);
        boton2.setBounds(150,300,100,30);
        boton2.setText("Finalizar");
        add(boton2);

        boton2.addActionListener(new CreadorDeVentnas());

    }
    private class CreadorDeVentnas implements ActionListener {
        private int c = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            c++;
            if (c > 1) {/**Para que aparezca solo una ventana nueva*/
                return;
            }
            JframeNuevo ventanaNueva = new JframeNuevo();
            ventanaNueva.setVisible(true);
        }
    }
}
