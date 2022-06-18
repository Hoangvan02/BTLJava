
import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.Date;


public class SachDAO {
  private ArrayList<Sach> list = new ArrayList<>();
  private int currentIndex = -1;
  private Object date_format;
  public void first(){
      if(currentIndex>0){
          currentIndex =0;
      }
  }
  public void previous(){
      if(currentIndex>0){
          currentIndex--;
      }
  }
  public void next(){
    if(currentIndex < list.size() -1){
          currentIndex++;
      }
  }
  public void last(){
      currentIndex = list.size()-1;
  }
  public int getCurrentSachIndex(){
      return currentIndex;
  }
  public Sach getCurrentSach(){
      if(list.size()==0)
          return null;
      return list.get(currentIndex);
  }
  public Sach getSach(){
      if(list.size()==0){
          return null;
      }
      return list.get(currentIndex);
  }
  public String getCurrentSachInfo(){
      return "Record "+(currentIndex+1)+" of "+ list.size();
  }
  public void update(Sach s1){
      Sach existS1 = findSach(s1.getMaSach());
      boolean flag = false;
      if(existS1!=null){
          existS1.setGia(s1.getGia());
          existS1.setMaSach(s1.getMaSach());
          existS1.setTenSach(s1.getTenSach());
          existS1.setTacGia(s1.getTacGia());
          existS1.setNgayNhap(s1.getNgayNhap());
          existS1.setNamXB(s1.getNamXB());
          existS1.setNhaXB(s1.getNhaXB());
          existS1.setSoLuong(s1.getSoLuong());
          flag = true;
      }
      return;
  }
  public void  renderToTable( DefaultTableModel tblModel){
      tblModel.setRowCount(0);
      for (Sach s1 : list){
          Object[] row = new Object[]{
          s1.getMaSach(),
          s1.getTenSach(),
          s1.getTacGia(),
          s1.getNamXB(),
          s1.getNhaXB(),
          s1.getNgayNhap(),
          s1.getSoLuong(),
          s1.getGia()
          };
          tblModel.addRow(row);
      }
  }
  public void add(Sach s1){
      list.add(s1);
  }
  public Sach findSach(String maSach){
      for (Sach sach : list){
          if(sach.getMaSach().equals(maSach)){
              return sach;
          }
      }
      return null;
  }
  public boolean deteSach(String maSach){
      for(Sach sach: list){
          if(sach.getMaSach().equals(maSach)){
              list.remove(sach);
              return true;
          }
      }
      return false;
  }

}
