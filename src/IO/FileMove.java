package IO;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;


public class FileMove {
	public static void main(String[] args) throws IOException {
		long t1 = System.currentTimeMillis();
		String path = "D:\\user1\\dmmgr\\wellifebatch\\exchange\\inbox\\fair_order\\todo";
		String path2 = "D:\\user1\\dmmgr\\wellifebatch\\exchange\\inbox\\fair_order\\bak";
		Path dir = Paths.get(path).toAbsolutePath();
		Path target = Paths.get(path2).normalize();
		List<String> fileNames = new ArrayList<>();
        Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
    		@Override
    		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    			if (file.toString().endsWith(".xls")) {// 如果檔案結尾為.xls
    				fileNames.add(file.normalize().toString());
    				moveFile(file,target);
    			}
    			return FileVisitResult.CONTINUE; // 繼續往下找
    		}
    	});
        long t2 = System.currentTimeMillis();
        System.out.println("END cost " + (t2-t1));
        for(String fileFullName : fileNames)
        {
        	out.println(fileFullName);
        }
	}
	
	public static void moveFile(Path source, Path target) throws IOException
	{
		if(Files.isDirectory(target))
		{
			target = Paths.get(target.normalize().toString() + "/" + source.getFileName());
		}
		Files.move(source, target);
	}
}
          