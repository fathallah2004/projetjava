//a change tous
/*
import Pack.DatabaseConnection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import static Pack.User.LoginUser.loginTextField;


public class rentCar extends JFrame implements ActionListener {
    JButton backButton = new JButton("Go Back");
    JButton rentbutton = new JButton("Rent");
    JTable tblData = new JTable();
    JLabel label = new JLabel("Enter Date (YYYY-MM-DD): ");
    JTextField dateField = new JTextField(10);
    DefaultTableModel model;

    public () {
        super("Cars");
        setSize(1100, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JScrollPane sp = new JScrollPane(tblData);
        sp.setBounds(50, 50, 1000, 450);
        add(sp);

        backButton.setBounds(50, 520, 150, 30);
        backButton.addActionListener(this);
        add(backButton);
        rentbutton.setBounds(900, 520, 150, 30);
        rentbutton.addActionListener(this);
        add(rentbutton);
        label.setBounds(500, 520, 150, 30);
        dateField.setBounds(650, 520, 150, 30);
        add(label);
        add(dateField);

        Connection con = DatabaseConnection.getConnection();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Cars");
            ResultSetMetaData rsmd = rs.getMetaData();
            model = (DefaultTableModel) tblData.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 1; i <= cols; i++) {
                colName[i - 1] = rsmd.getColumnName(i);
            }
            model.setColumnIdentifiers(colName);
            while (rs.next()) {
                Object[] rowData = new Object[cols];
                for (int i = 1; i <= cols; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            new AdminInterface();
            dispose();
        }
        else if(e.getSource() == rentbutton){
            String date = dateField.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(date);
                int row=tblData.getSelectedRow();
                if(row==-1){
                    JOptionPane.showMessageDialog(this, "Please select a car to rent");
                }
                else{
                    String carid = tblData.getValueAt(row, 0).toString();
                    Connection con = DatabaseConnection.getConnection();
                    try {
                        String loginS=loginTextField.getText();
                        LocalDate currentDate = LocalDate.now();
                        Statement stmt = con.createStatement();
                        stmt.executeUpdate("UPDATE Cars SET status='Rented' WHERE mat='"+carid+"'");
                        stmt.executeUpdate("INSERT INTO Rents (loginUser,mat, rentDate,returnDate) VALUES ('"+loginS+"','"+carid+"','"+currentDate+"','"+date+"')");
                        JOptionPane.showMessageDialog(this, "Car rented successfully");
                        dispose();
                        new showCars();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    dispose();
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this,"Invalid Date! Please use the format YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}*/