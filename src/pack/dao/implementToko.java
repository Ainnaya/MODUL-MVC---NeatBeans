package pack.dao;
import java.util.List;
import pack.model.m_toko;

public interface implementToko {
   public void TampilData(m_toko a);
   public void UbahData(m_toko a);
   public void SimpanData(m_toko a);
   public void HapusData(String kode);
   public List<m_toko> getCariKategori(String kategori);
   public List<m_toko> getAll();
}
