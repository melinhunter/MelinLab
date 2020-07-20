package IO;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
public class FileList {
	public static void main(String[] args) throws IOException {
		String path = "d:/user1/dmmgr/wellifebatch/exchange/inbox/pos_order/bak/";
		Path dir = Paths.get(path).toAbsolutePath();
        Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
    		@Override
    		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
    			if (file.toString().endsWith(".xls")) {// 如果檔案結尾為.xls
    				System.out.println(file.getFileName());
    			}
    			return FileVisitResult.CONTINUE; // 繼續往下找
    		}
    	});
        
        System.out.println("END");
	}
}
          