import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		//Khai báo danh sách sản phẩm
		ArrayList<SanPham> dsSanPham;
		//Xin mới
		dsSanPham =new ArrayList<SanPham>();
		
		//danh sasch san pham
		SanPham sp1= new SanPham(0, "Cơm", "Thức ăn", null);
		SanPham sp2= new SanPham(1, "Kem", "Ăn vặt", null);
		SanPham sp3= new SanPham(2, "Coca", "Nước giải khát", null);
		
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		for (int i=0;i<dsSanPham.size();i++) {
			System.out.println(dsSanPham.get(i).toString());
		}
	}

}
