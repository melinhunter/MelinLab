package IO;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
public class FileList2 {
	public static void main(String[] args) throws IOException {
		long t1 = System.currentTimeMillis();
		String path = "d:/user1/dmmgr/wellifebatch/exchange/inbox/pos_order/bak/";
		File folder = new File(path);
		File[] files = folder.listFiles();                                
        //String path = folder.getAbsolutePath();
        for (int i = 0; i < files.length; i++)
        {
        	File file = files[i];
        	System.out.println(file.getName());
        }
        long t2 = System.currentTimeMillis();
        System.out.println("END cost " + (t2-t1));
	}
}
          