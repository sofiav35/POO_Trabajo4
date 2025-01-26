package Persona;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private ListaPersonas lista;
    private Container contenedor;
    private JLabel nombre, apellidos, telefono, direccion;
    private JTextField campoNombre, campoApellidos, campoTelefono, campoDireccion;
    private JButton añadir, eliminar, borrarLista;
    private JList<String> listaNombres;
    private DefaultListModel<String> modelo;
    private JScrollPane scrollLista;

    public VentanaPrincipal() {
        lista = new ListaPersonas();
        inicio();
        setTitle("🌸 Lista de Personas 🌸");
        setSize(350, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Icono de la ventana (descomenta si tienes el archivo "icono.png")
        // setIconImage(new ImageIcon(getClass().getResource("/icono.png")).getImage());

        contenedor.setBackground(new Color(255, 240, 245)); // Fondo rosa pastel
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        Font fuenteCute = new Font("Comic Sans MS", Font.BOLD, 14);

        nombre = new JLabel("Nombre:");
        nombre.setBounds(20, 20, 135, 23);
        nombre.setFont(fuenteCute);

        campoNombre = new JTextField();
        campoNombre.setBounds(120, 20, 180, 23);
        campoNombre.setBorder(BorderFactory.createLineBorder(Color.PINK, 2));

        apellidos = new JLabel("Apellidos:");
        apellidos.setBounds(20, 50, 135, 23);
        apellidos.setFont(fuenteCute);

        campoApellidos = new JTextField();
        campoApellidos.setBounds(120, 50, 180, 23);
        campoApellidos.setBorder(BorderFactory.createLineBorder(Color.PINK, 2));

        telefono = new JLabel("Teléfono:");
        telefono.setBounds(20, 80, 135, 23);
        telefono.setFont(fuenteCute);

        campoTelefono = new JTextField();
        campoTelefono.setBounds(120, 80, 180, 23);
        campoTelefono.setBorder(BorderFactory.createLineBorder(Color.PINK, 2));

        direccion = new JLabel("Dirección:");
        direccion.setBounds(20, 110, 135, 23);
        direccion.setFont(fuenteCute);

        campoDireccion = new JTextField();
        campoDireccion.setBounds(120, 110, 180, 23);
        campoDireccion.setBorder(BorderFactory.createLineBorder(Color.PINK, 2));

        añadir = new JButton("➕ Añadir");
        añadir.setBounds(120, 150, 120, 30);
        añadir.setBackground(new Color(255, 182, 193));
        añadir.setForeground(Color.WHITE);
        añadir.setFont(fuenteCute);
        añadir.addActionListener(this);

        eliminar = new JButton("❌ Eliminar");
        eliminar.setBounds(20, 320, 120, 30);
        eliminar.setBackground(new Color(255, 182, 193));
        eliminar.setForeground(Color.WHITE);
        eliminar.setFont(fuenteCute);
        eliminar.addActionListener(this);

        borrarLista = new JButton("🗑️ Borrar Lista");
        borrarLista.setBounds(180, 320, 120, 30);
        borrarLista.setBackground(new Color(255, 182, 193));
        borrarLista.setForeground(Color.WHITE);
        borrarLista.setFont(fuenteCute);
        borrarLista.addActionListener(this);

        modelo = new DefaultListModel<>();
        listaNombres = new JList<>(modelo);
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        scrollLista = new JScrollPane(listaNombres);
        scrollLista.setBounds(20, 190, 280, 120);
        scrollLista.setBorder(BorderFactory.createLineBorder(Color.PINK, 2));

        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(telefono);
        contenedor.add(campoTelefono);
        contenedor.add(direccion);
        contenedor.add(campoDireccion);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == añadir) {
            añadirPersona();
        }
        if (evento.getSource() == eliminar) {
            eliminarNombre(listaNombres.getSelectedIndex());
        }
        if (evento.getSource() == borrarLista) {
            borrarLista();
        }
    }

    private void añadirPersona() {
        Persona p = new Persona(
                campoNombre.getText(),
                campoApellidos.getText(),
                campoTelefono.getText(),
                campoDireccion.getText()
        );

        lista.añadirPersona(p);

        String elemento = "🌸 " + campoNombre.getText() + " - " + campoApellidos.getText() +
                " 📞 " + campoTelefono.getText() + " 🏠 " + campoDireccion.getText();

        modelo.addElement(elemento);
        listaNombres.setModel(modelo);

        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
    }

    private void eliminarNombre(int indice) {
        if (indice >= 0) {
            modelo.remove(indice);
            lista.eliminarPersona(indice);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarLista() {
        lista.borrarLista();
        modelo.clear();
    }
}