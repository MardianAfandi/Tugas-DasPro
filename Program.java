import java.util.Scanner;

public class Program
{
	public static void main(String []args)
	{
		//untuk nim H1051171059
		String nama;
		nama = "Mardian Afandi";
		String Fakultas;
		Fakultas = "Matematika dan Ilmu Pengetahuan Alam";
		String Jurusan;
		Jurusan = "Sistem Komputer";
		String asal;
		asal = "Sintang";
		String Alamat_Sekarang;
		Alamat_Sekarang = "Desa Kapur";
		String Tanggal_Lahir;
		Tanggal_Lahir = "09 Maret 2000";
		
		
		//untuk nim A1011031001
		String nama2;
		nama2 = "Marlina Halus, S.H.";
		String Fakultas2;
		Fakultas2 = "Hukum";
		String Jurusan2;
		Jurusan2 = "Ilmu Hukum";
		String asal2;
		asal2 = "Sintang";
		String Alamat_Sekarang2;
		Alamat_Sekarang2 = "Desa Kapur";
		String Tanggal_Lahir2;
		Tanggal_Lahir2 = "4 April 1985";
		
		
		
		System.out.println ("		SIMALUM UNIVERSITAS TANJUNGPURA			");
		System.out.println ("===================================================================");
		System.out.print("Masukkan NIM Anda : ");
		
		Scanner nim = new Scanner(System.in);
		String NIM;
		NIM = nim.next();
		
		
		if(NIM.equals("H1051171059")){
			System.out.println("Nama		  : " + nama);
			System.out.println("Fakultas	  : " + Fakultas);
			System.out.println("Jurusan		  : " + Jurusan);
			System.out.println("Asal		  : " + asal);
			System.out.println("Alamat Sekarang	  : " + Alamat_Sekarang);
			System.out.println("Tanggal Lahir	  : " + Tanggal_Lahir);
		}
		else if(NIM.equals("A1011031001")){
			System.out.println("Nama		  : " + nama2);
			System.out.println("Fakultas	  : " + Fakultas2);
			System.out.println("Jurusan		  : " + Jurusan2);
			System.out.println("Asal		  : " + asal2);
			System.out.println("Alamat Sekarang	  : " + Alamat_Sekarang2);
			System.out.println("Tanggal Lahir	  : " + Tanggal_Lahir2);
		}
		else{
			System.out.println("Maaf Data Mahasiswa Tidak Ditemukan");
			System.out.println("Terima Kasih");
		}
	}
}