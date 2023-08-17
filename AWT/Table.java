import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class Table {
    public static void main(String[] args) throws IOException {
        new TableOp();
    }
}

class TableOp extends Frame implements WindowListener, ActionListener {

    Label lb1, result, ans, error;
    TextField num;
    Button table, clearBtn;

    public TableOp() {
        this.setVisible(true);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("TABLE-OF-ANY-NUM");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter a number");
        this.add(lb1);
        lb1.setBounds(40, 80, 130, 30);

        num = new TextField();
        this.add(num);
        num.setBounds(190, 80, 140, 30);

        table = new Button("table");
        this.add(table);
        table.setBounds(44, 170, 70, 30);
        table.setBackground(Color.ORANGE);
        table.addActionListener(this);

        clearBtn = new Button("clear");
        this.add(clearBtn);
        clearBtn.setBounds(120, 170, 60, 30);
        clearBtn.setBackground(Color.LIGHT_GRAY);
        clearBtn.addActionListener(this);

        result = new Label("Result");
        result.setBounds(45, 220, 50, 30);
        this.add(result);
        result.setBackground(Color.white);

        ans = new Label();
        ans.setBounds(115, 220, 200, 300);
        this.add(ans);
        ans.setForeground(Color.black);

        error = new Label();
        error.setBounds(45, 300, 90, 30);
        this.add(error);
        error.setForeground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(num.getText());
        if (e.getSource() == table) {
            for (int i = 1; i <= 10; i++) {
                int tab = n * i;
                String s = n + " * " + i + " = ";
                ans.setText(String.valueOf(s + tab));
                System.out.println("");
            }
        } else if (e.getSource() == clearBtn) {
            num.setText("");
            ans.setText("");
            error.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
