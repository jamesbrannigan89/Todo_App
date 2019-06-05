package NotePad;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.*;

public class Notepad  extends  JFrame {

    private static final long serialVersionUID = 1L;
    JFrame frame;
    JMenuBar menuBar;
    JMenu file;
    JMenu edit;
    JMenuItem open, newFile, save, exit;
    JMenuItem undo, paste, selectAll;
    JMenu format;
    JMenu help;
    JFileChooser fileChooser;
    JTextArea textArea;
    Clipboard clip;


    Notepad() {

        frame = new JFrame("Note Pad App");
        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        help = new JMenu("Help");

        newFile = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        undo = new JMenuItem("Undo                 Ctrl+Z");
        paste = new JMenuItem("Paste                Ctrl+V");
        selectAll = new JMenuItem("Select All       Ctrl+A ");
        textArea = new JTextArea();
        fileChooser = new JFileChooser();
        menuBar = new JMenuBar();

        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.add(textArea);
        file.add(open);
        file.add(newFile);
        file.add(save);
        file.add(exit);
        edit.add(exit);
        edit.add(undo);
        edit.add(selectAll);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        menuBar.add(help);

        frame.setJMenuBar(menuBar);
    }


    class OpenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(frame)) {

                File file = fileChooser.getSelectedFile();
                textArea.setText("");
                Scanner in = null;

                try {
                    in = new Scanner(file);
                    while (in.hasNext()) {
                        String line = in.nextLine();
                        textArea.append(line + "\n");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    in.close();

                }
            }
        }

    }




}






