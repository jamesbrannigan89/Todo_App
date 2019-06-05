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
    JMenuItem open, newFile,save, exit;
    JMenuItem undo,paste, selectAll ;
    JMenu format;
    JMenu help;
    JFileChooser fileChooser;
    JTextArea textArea;
    Clipboard clip ;



}
