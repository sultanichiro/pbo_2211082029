/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ichiro2029.model;

import java.util.List;

/**
 *
 * @author ASUS iD
 */
public interface PeminjamanDao {
    void save(Peminjaman peminjaman);
    void update(int index, Peminjaman peminjaman);
    void delete (int index);
    Peminjaman getPeminjaman(int index);
    public List<Peminjaman> getAllPeminjaman();
}
