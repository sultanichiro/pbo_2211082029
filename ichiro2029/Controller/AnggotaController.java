/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ichiro2029.Controller;
import firman270423.model.*;
import firman270423.view.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author ASUS iD
 */
public class AnggotaController{
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController(FormAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm(){
        formAnggota.getTxtKodeAnggota().setText("");
        formAnggota.getTxtNamaAnggota().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    public void isiCboJenisKelamin(){
        formAnggota.getCboJenisKelamin().removeAllItems();
        formAnggota.getCboJenisKelamin().addItem("L");
        formAnggota.getCboJenisKelamin().addItem("P");
    }
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Insert Ok");
    }
    public void updateAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = new Anggota();
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
        anggotaDao.update(index, anggota);
        JOptionPane.showMessageDialog(formAnggota, "Update Ok");
    }
    public void getAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if (anggota != null){
            formAnggota.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
            formAnggota.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            formAnggota.getCboJenisKelamin().setSelectedItem(anggota.getJenisKelamin());
        }
    }
    public void delete(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formAnggota,"Delete Ok");
    }
    public void tampil(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAllAnggota();
        for(Anggota anggota1 : list){
            Object row[] = {
                anggota1.getKodeAnggota(),
                anggota1.getNamaAnggota(),
                anggota1.getAlamat(),
                anggota1.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }
    }
}