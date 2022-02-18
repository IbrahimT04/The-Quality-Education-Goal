/* 
                        _________________________________
                              (Summative) Assignment
                        ---------------------------------
                                By: Ibrahim Tariq
*/
package grade11summative.tariq;
    
    // Import statement for MessageBox.
    import static javax.swing.JOptionPane.showMessageDialog;

public class RatingFrame extends javax.swing.JFrame {
        
        // Declairation of variables and arrays:
        //(This needs to be done here so these can be used in many different methods easly.)
        int buttonEnterClicked = 0;
        // Array for questions:
        String [] Questions = {"<html>Question 1: What did you like about this program?<html/>",
                "<html>Question 2: What can be improved in this program?<html/>",
                "<html>Question 3: What other things could be added to make the program better?<html/>",
                "<html>Question 4: Any other suggestions or comments you would like to add?<html/>",
                "<html>Thank you for answering our questions. Press the 'Finish' button the close the program.<html/>"};
        // Array for user's answers:
        String [] ReviewAnswers = new String [4];
        // Array for questions and answers in order:
        String [] Final = new String [4];
    
    /**
     * Creates new form RatingFrame
     */
    public RatingFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RBorder = new javax.swing.JPanel();
        RBackground = new javax.swing.JDesktopPane();
        lblInst = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblQuestions = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        txtRatingAnswers = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RBorder.setBackground(new java.awt.Color(0, 0, 0));

        RBackground.setBackground(new java.awt.Color(153, 153, 153));

        lblInst.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        lblInst.setForeground(new java.awt.Color(0, 255, 255));
        lblInst.setText("<html>What did you think of this program. Please answer the following review question. Fill in the white space and press the \"Enter\" button to answer the question. After answering the questions press the \"Finish\" button.<html/>");

        lblTitle.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Rating / Reviews");

        lblQuestions.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblQuestions.setForeground(new java.awt.Color(0, 255, 255));
        lblQuestions.setText("Question 1: What did you like about this program?");

        btnEnter.setBackground(new java.awt.Color(0, 0, 0));
        btnEnter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(0, 255, 255));
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        txtRatingAnswers.setBackground(new java.awt.Color(204, 204, 204));
        txtRatingAnswers.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N

        btnExit.setBackground(new java.awt.Color(0, 0, 204));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnExit.setText("EXIT:");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnRefresh.setForeground(new java.awt.Color(0, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        RBackground.setLayer(lblInst, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RBackground.setLayer(lblTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RBackground.setLayer(lblQuestions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RBackground.setLayer(btnEnter, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RBackground.setLayer(txtRatingAnswers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RBackground.setLayer(btnExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RBackground.setLayer(btnRefresh, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout RBackgroundLayout = new javax.swing.GroupLayout(RBackground);
        RBackground.setLayout(RBackgroundLayout);
        RBackgroundLayout.setHorizontalGroup(
            RBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RBackgroundLayout.createSequentialGroup()
                .addGroup(RBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblQuestions, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                            .addGroup(RBackgroundLayout.createSequentialGroup()
                                .addComponent(txtRatingAnswers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnter))))
                    .addGroup(RBackgroundLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(RBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RBackgroundLayout.setVerticalGroup(
            RBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRatingAnswers, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout RBorderLayout = new javax.swing.GroupLayout(RBorder);
        RBorder.setLayout(RBorderLayout);
        RBorderLayout.setHorizontalGroup(
            RBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RBackground)
                .addContainerGap())
        );
        RBorderLayout.setVerticalGroup(
            RBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RBackground)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(716, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // The "Enter" button is pressed:
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
            
            if (buttonEnterClicked < 4) // Runs if the "Enter" button has been pressed less than three times:
            {
                // Displays the next question. (Question 1 to 2, 2 to 3 etc...)
                lblQuestions.setText(Questions[buttonEnterClicked + 1]);
            }
            else {
                // Displays the last element of the questions array: (Farewell Statement)
                lblQuestions.setText(Questions[4]);
            }

            if (buttonEnterClicked < 4) // Runs if the "Enter" button has been pressed less than three times:
            {
                // Collects information from text field:
                ReviewAnswers[buttonEnterClicked] = txtRatingAnswers.getText();
            }
            
            // Makes an array to store questions and the user's answers for each review question.(In order)
            for (int i = 0; i <= 3; i++)
                {
                   Final[i] = (Questions[i] + "\n Answer: " + ReviewAnswers[i]);
                }

            if (buttonEnterClicked >= 3){ // Outputs the questions and the user's answers for them.So the user can self-check his answers:
            
                showMessageDialog(this,"Just to make sure you wrote your answers correctly. \n "
                        + "If they are not right click the retry button."); 

                for (int j = 0; j <= 3; j++) // Loop for showing user all the review questions and their answers.
                {
                   showMessageDialog(this,Final[j]);
                   
                }
                
            }
            // Counter for the number of times the "Enter" button is pressed:
            buttonEnterClicked += 1;
            // Clears the text space:
            txtRatingAnswers.setText("");
    }//GEN-LAST:event_btnEnterActionPerformed

    // The "EXIT:" button is pressed:
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        // Shows farewell message:
        showMessageDialog(this,"Thank you for using our program. \n Have a nice day.");

        // Closes the program:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    
    // The "Refresh" button is pressed:
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
        // Re-opens the program:
        RatingFrame rating = new RatingFrame();
        rating.setVisible(true);

    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RatingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RatingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RatingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RatingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RatingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane RBackground;
    private javax.swing.JPanel RBorder;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel lblInst;
    private javax.swing.JLabel lblQuestions;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtRatingAnswers;
    // End of variables declaration//GEN-END:variables
}
