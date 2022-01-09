/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myswingworker;

import javax.swing.JTextArea;
import javax.swing.SwingWorker;

public class MySwingWorker extends SwingWorker<String, String> {

    private JTextArea jTextArea1;
    private int start, end;

    public MySwingWorker(JTextArea jTextArea1, int start, int end) {
        this.jTextArea1 = jTextArea1;
        this.start = start;
        this.end = end;
    }

    @Override
    protected String doInBackground() throws Exception {
        jTextArea1.append("swing worker\n");
        for (int a = start; a <= end; a++) {
            setProgress(a);
            Thread.sleep(500);
        }
        return "hello";
    }

    @Override
    protected void done() {
        super.done(); //To change body of generated methods, choose Tools | Templates.
        jTextArea1.append("\n");
        jTextArea1.append("swing worker done\n");
    }

}
