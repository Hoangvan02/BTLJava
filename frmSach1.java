
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.List;
import java.util.ArrayList;
import  java.sql.*;
import javax.swing.JFrame;

public class frmSach1 extends javax.swing.JFrame {

    SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");
    private DefaultTableModel tblModel=null;
    private SachDAO sachDAO= new SachDAO();
    private boolean isEditMode = false;
    public frmSach1() {
        initComponents();
        setLocationRelativeTo(null);
        initTable();

    }
    public void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new Object[]{"Mã Sách","Tên Sách","Tác Giả","Năm XB","Nhà XB","Ngày Nhâp","Số Lượng","Giá Bán"});
        tblSach.setModel(tblModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMaSach = new javax.swing.JTextField();
        txtNgayNhap = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtTacGia = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtNamXB = new javax.swing.JTextField();
        txtNhaXB = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblSatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("QUẢN LÝ THÔNG TIN SÁCH");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tên Sách");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Mã Sách");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tác Giả");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Số Lượng");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Ngày nhập");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Giá Bán");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Nhà XB");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Năm XB");

        txtMaSach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSachActionPerformed(evt);
            }
        });

        txtNgayNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTenSach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTacGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNamXB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNhaXB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNhaXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNhaXBActionPerformed(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setText("TÌM KIẾM");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLuu.setText("LƯU");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Tác Giả", "Năm XB", "Nhà XB", "Ngày Nhập", "Số Lượng", "Giá Bán"
            }
        ));
        jScrollPane1.setViewportView(tblSach);

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("THOÁT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit))
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(txtTenSach)
                                    .addComponent(txtMaSach)
                                    .addComponent(txtNamXB))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSoLuong))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(txtNhaXB)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnFirst)
                                .addGap(62, 62, 62)
                                .addComponent(btnBack)
                                .addGap(38, 38, 38)
                                .addComponent(btnNext)
                                .addGap(31, 31, 31)
                                .addComponent(btnLast)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSatus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(114, 114, 114))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong)
                    .addComponent(btnLuu))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNhaXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFirst)
                        .addComponent(btnBack)
                        .addComponent(btnNext)
                        .addComponent(btnLast)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachActionPerformed

    private void txtNhaXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNhaXBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNhaXBActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        sachDAO.previous();
        lblSatus.setText(sachDAO.getCurrentSachInfo());
        Sach s1= sachDAO.getCurrentSach();
        fillSachToFrom(s1);  
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
        
    }//GEN-LAST:event_btnExitActionPerformed

    public void resetFrom(){
        	txtMaSach.setText("");
		txtTenSach.setText("");
		txtTacGia.setText("");
		txtNamXB.setText("");
		txtNhaXB.setText("");
		txtNgayNhap.setText("");
		txtGia.setText("");
		txtSoLuong.setText("");
		txtMaSach.requestFocus();
                
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
            resetFrom();
            isEditMode=false;
    }//GEN-LAST:event_btnResetActionPerformed

    public frmSach1(JButton btnBack, JButton btnExit, JButton btnFirst, JButton btnLast, JButton btnLuu, JButton btnNext, JButton btnReset, JButton btnTim, JButton btnXoa, JLabel jLabel1, JLabel jLabel10, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel7, JLabel jLabel8, JLabel jLabel9, JScrollPane jScrollPane1, JSeparator jSeparator1, JTable tbSach, JTextField txtGia, JTextField txtMaSach, JTextField txtNamXB, JTextField txtNgayNhap, JTextField txtNhaXB, JTextField txtSoLuong, JTextField txtTacGia, JTextField txtTenSach) throws HeadlessException {
        this.btnBack = btnBack;
        this.btnExit = btnExit;
        this.btnFirst = btnFirst;
        this.btnLast = btnLast;
        this.btnLuu = btnLuu;
        this.btnNext = btnNext;
        this.jLabel1 = jLabel1;
        this.jLabel10 = jLabel10;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel7 = jLabel7;
        this.jLabel8 = jLabel8;
        this.jLabel9 = jLabel9;
        this.jScrollPane1 = jScrollPane1;
        this.jSeparator1 = jSeparator1;
        this.tblSach = tbSach;
        this.txtGia = txtGia;
        this.txtMaSach = txtMaSach;
        this.txtNamXB = txtNamXB;
        this.txtNgayNhap = txtNgayNhap;
        this.txtNhaXB = txtNhaXB;
        this.txtSoLuong = txtSoLuong;
        this.txtTacGia = txtTacGia;
        this.txtTenSach = txtTenSach;
    }

    public Sach getModel() throws ParseException{
        Sach s1 = new Sach();
        s1.setMaSach(txtMaSach.getText().trim());
        s1.setGia(Double.parseDouble(txtGia.getText().trim()));
        s1.setNamXB(Integer.parseInt(txtNamXB.getText().trim()));
        s1.setNgayNhap(date_format.parse(txtNgayNhap.getText().trim()));
        s1.setNhaXB(txtNhaXB.getText().trim());
        s1.setSoLuong(Integer.parseInt(txtSoLuong.getText().trim()));
        s1.setTacGia(txtTacGia.getText().trim());
        s1.setTenSach(txtTenSach.getText().trim());
        return s1;
    }
    public boolean checkValidateForm(){
        if (txtGia.getText().isEmpty()|| txtMaSach.getText().isEmpty()||txtNamXB.getText().isEmpty()
                || txtNgayNhap.getText().isEmpty() || txtNhaXB.getText().isEmpty() || txtSoLuong.getText().isEmpty()
                || txtTacGia.getText().isEmpty() || txtTenSach.getText().isEmpty()){
            return false;
        }
        return true;
    }
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if(!checkValidateForm()){
            JOptionPane.showMessageDialog(this, "Ban chua nhap du thong tin");
        }else{
            try {
                Sach s1 = new Sach();
                s1.setMaSach(txtMaSach.getText().trim());
                s1.setGia(Double.parseDouble(txtGia.getText().trim()));
                s1.setNamXB(Integer.parseInt(txtNamXB.getText().trim()));
                s1.setNgayNhap(date_format.parse(txtNgayNhap.getText().trim()));
                s1.setNhaXB(txtNhaXB.getText().trim());
                s1.setSoLuong(Integer.parseInt(txtSoLuong.getText().trim()));
                s1.setTacGia(txtTacGia.getText().trim());
                s1.setTenSach(txtTenSach.getText().trim());
//                sachDAO.add(s1);
                if(isEditMode){
                    if(sachDAO.findSach(s1.getMaSach())== null){
                        JOptionPane.showMessageDialog(this, "Thông tin sách không tồn tại");
                        return;
                    }
                    sachDAO.update(s1);
                }else{
                    if(sachDAO.findSach(s1.getMaSach())!= null){
                        JOptionPane.showMessageDialog(this, "Thông tin sách đã tồn tại");
                        return;
                    }  
                    sachDAO.add(s1);
                }
                resetFrom();
                sachDAO.renderToTable(tblModel);
                JOptionPane.showMessageDialog(this,"Thong tin sách đã được lưu!");
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: "+e.getMessage());
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        
                try {
                        Sach s1 =sachDAO.findSach(txtMaSach.getText());
                        if(s1 !=null){
                                fillSachToFrom(s1);
                            }else{
                                JOptionPane.showMessageDialog(this, "Thông tin sách không tồn tại");
                            }
                    }catch(Exception e){
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(this, "Error: "+e.getMessage());
                        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void fillSachToFrom(Sach s1) {
        isEditMode=true;
        txtMaSach.setText(s1.getMaSach());
        txtGia.setText(""+s1.getGia());
        txtNamXB.setText(""+s1.getNamXB());
        txtNgayNhap.setText(""+s1.getNgayNhap());
        txtNhaXB.setText(s1.getNhaXB());
        txtSoLuong.setText(""+s1.getSoLuong());
        txtTacGia.setText(s1.getTacGia());
        txtTenSach.setText(s1.getTenSach());
    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
          try{
           boolean isOk = sachDAO.deteSach(txtMaSach.getText());
           if(isOk){
               sachDAO.renderToTable(tblModel);
               JOptionPane.showMessageDialog(this, "Đã xóa thông tin sách");
           }else
               JOptionPane.showMessageDialog(this,"Thông tin sách không tồn tại");
       }catch (Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(this, "Error: "+e.getMessage());
       }
        resetFrom();  
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        sachDAO.first();
        lblSatus.setText(sachDAO.getCurrentSachInfo());
        Sach s1= sachDAO.getCurrentSach();
        fillSachToFrom(s1);  
       
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        sachDAO.next();
        lblSatus.setText(sachDAO.getCurrentSachInfo());
        Sach s1= sachDAO.getCurrentSach();
        fillSachToFrom(s1);  
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        sachDAO.last();
        lblSatus.setText(sachDAO.getCurrentSachInfo());
        Sach s1= sachDAO.getCurrentSach();
        fillSachToFrom(s1);
    }//GEN-LAST:event_btnLastActionPerformed

    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSach1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSatus;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNamXB;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtNhaXB;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}
