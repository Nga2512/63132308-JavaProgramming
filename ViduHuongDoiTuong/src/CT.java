import java.util.ArrayList; 
public class CT {

	public static void main(String[] args) {
		// Khai bao danh sach san pham
		ArrayList<SanPham> dsSanPham;
		//xin mới
		dsSanPham = new ArrayList<SanPham>();
		//Nhập 3 sản phẩm 
		SanPham sp1 = new SanPham(0,"Bút","Dụng cụ học tập","b.jpn");
		SanPham sp2 = new SanPham(1,"Thước","Dụng cụ học tập","t.pjn");
		SanPham sp3 = new SanPham(2,"Vở","Dụng cụ học tập","v.pnj");
		//Them vào danh sách
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		for (SanPham x: dsSanPham)
			System.out.println(x.toString());
	}
}
