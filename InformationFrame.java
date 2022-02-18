/* 
                        _________________________________
                              (Summative) Assignment
                        ---------------------------------
                                By: Ibrahim Tariq
*/
package grade11summative.tariq;

public class InformationFrame extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form InformationFrame
     */
    public InformationFrame() {
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

        IBackground = new javax.swing.JDesktopPane();
        lblITitle = new javax.swing.JLabel();
        ScrollInfoTextArea = new javax.swing.JScrollPane();
        InfoTextArea = new javax.swing.JTextArea();

        IBackground.setBackground(new java.awt.Color(102, 102, 102));

        lblITitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblITitle.setForeground(new java.awt.Color(0, 255, 255));
        lblITitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblITitle.setText("Information about Quality Education");

        ScrollInfoTextArea.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        InfoTextArea.setEditable(false);
        InfoTextArea.setBackground(new java.awt.Color(33, 113, 149));
        InfoTextArea.setColumns(20);
        InfoTextArea.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        InfoTextArea.setForeground(new java.awt.Color(15, 247, 255));
        InfoTextArea.setRows(5);
        InfoTextArea.setText("   Overview:\nAround the world millions of children and adults do not recieve proper\neducation. Some of those who recieve proper education have to go\nthrough other obsticles like racism, bullying, poverty and limited \nresources etc... and do not get to finish their full education because \nof these obsticles.\n\n   Right now:\n- Remote learning remains out of reach for (500 million) students.\n- School closures keep (90%) students out of school.\n- Over (200 million) children will be out of school in 2030.\n- School completion rate in poor countries is (79%) in the rich sector and\n(34%) in the poor sector.\n- Only 65% of primary schools have basic handwatching facilities.\n\n   History:\nIn June 1992, in Rio de Janeiro, Brazil, more than 178 countries made\nan action plan called Agenda 21, its purpose was to build a global\npartnership to improve human lives and protect the environment.\n\nAgenda 21 later lead to the making of the 17 SDG's\n\n   The quality education goal:\nThe \"Quality Education\" goal is the forth goal out of the seventeen goals\ncreated by the UN in 2015 to make the world a better place. This goal is\nabout making full education fair and easily accessible for everyone \naround the world by 2030. ");
        InfoTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ScrollInfoTextArea.setViewportView(InfoTextArea);

        IBackground.setLayer(lblITitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        IBackground.setLayer(ScrollInfoTextArea, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout IBackgroundLayout = new javax.swing.GroupLayout(IBackground);
        IBackground.setLayout(IBackgroundLayout);
        IBackgroundLayout.setHorizontalGroup(
            IBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblITitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addComponent(ScrollInfoTextArea))
                .addContainerGap())
        );
        IBackgroundLayout.setVerticalGroup(
            IBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblITitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(ScrollInfoTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IBackground)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IBackground, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setBounds(0, 0, 580, 334);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane IBackground;
    private javax.swing.JTextArea InfoTextArea;
    private javax.swing.JScrollPane ScrollInfoTextArea;
    private javax.swing.JLabel lblITitle;
    // End of variables declaration//GEN-END:variables
}
