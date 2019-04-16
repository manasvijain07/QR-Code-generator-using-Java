import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;


public class Qr_Code {

	public static void main(String[] args)throws Exception
	{
		String details = "";
		System.out.println("Enter the string : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		details = sc.nextLine();
		
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
		File f =new File("E:\\man-projects\\qr_code.jpg");
		@SuppressWarnings("resource")
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(out.toByteArray());
		fos.flush();

	}

}
