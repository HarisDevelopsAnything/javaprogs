import javax.swing.*;
import java.awt.event.*;
public class Notepad {
    public static void main(String[] args) {
        JFrame mainWindow= new JFrame("Jarpad");   
        mainWindow.setBounds(100, 100, 450, 350);
        JTextArea mainTextArea= new JTextArea();
        JScrollPane mainTextHolder= new JScrollPane(mainTextArea);
        JMenuBar topBar= new JMenuBar();
        JMenu fileMenu= new JMenu("File");
        JMenuItem newOption= new JMenuItem("New...");
        JMenu saveMenu= new JMenu("Save");
        JMenuItem saveOption= new JMenuItem("Save");
        JMenuItem saveAsOption= new JMenuItem("Save as");
        JMenu viewMenu= new JMenu("View");
        JCheckBoxMenuItem wordWrap= new JCheckBoxMenuItem("Word wrap", false);
        JFileChooser saveDialog= new JFileChooser();
        wordWrap.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(wordWrap.getState())
                mainTextArea.setLineWrap(true);
                else
                mainTextArea.setLineWrap(false);
            };
        });
        saveAsOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                saveDialog.showSaveDialog(mainWindow);
            }
        });
        viewMenu.add(wordWrap);
        saveMenu.add(saveOption);
        saveMenu.add(saveAsOption);
        fileMenu.add(newOption);
        fileMenu.add(saveMenu);
        topBar.add(fileMenu);
        topBar.add(viewMenu);
        mainWindow.setJMenuBar(topBar);
        mainWindow.add(mainTextHolder);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
