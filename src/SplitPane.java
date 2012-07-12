/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/12/12
 * Time: 10:17 AM
 * To change this template use File | Settings | File Templates.
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;



public class SplitPane extends JPanel
        implements ListSelectionListener {
    String iname;
    public JLabel picture;
    public JList list;
    public JSplitPane splitPane;
    public Font f = new Font("Times New roman" , Font.BOLD , 20);
    public String[] bookname = { "abc", "def", "pqr", "xyz"};
    public SplitPane() {

        //Create the list of images and put it in a scroll pane.

        list = new JList(bookname);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);

        JScrollPane listScrollPane = new JScrollPane(list);

        picture = new JLabel();
        picture.setFont(f);
        picture.setHorizontalAlignment(JLabel.CENTER);

        JScrollPane pictureScrollPane = new JScrollPane(picture);

        //Create a split pane with the two scroll panes in it.
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                listScrollPane, pictureScrollPane);
                splitPane.setDividerLocation(150);


        //Provide a preferred size for the split pane.
        splitPane.setPreferredSize(new Dimension(400, 400));
        iname=bookname[list.getSelectedIndex()];
        //System .out.println("image name " + iname);
    }

    //Listens to the list
    public void valueChanged(ListSelectionEvent e) {
        JList list = (JList)e.getSource();
        iname=bookname[list.getSelectedIndex()];

    }
    public String sndvalue()
    {
        return iname;
    }



}


