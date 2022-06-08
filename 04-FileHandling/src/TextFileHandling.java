import java.io.File;
import java.io.IOException;

public class TextFileHandling {
    public static void main(String[] args) {
        File file = new File("/Users/pavitra.m/Downloads/simple-org-chart/readme.txt");

        System.out.println("File exists() --> " + file.exists());
        System.out.println("File canRead() --> " + file.canRead());
        System.out.println("File canWrite() --> " + file.canWrite());
        System.out.println("File getName() --> " + file.getName());
        System.out.println("File getParent() --> " + file.getParent());
        System.out.println("File getAbsolutePath() --> " + file.getAbsolutePath());
        System.out.println("File getAbsoluteFile() --> " + file.getAbsoluteFile());
        System.out.println("File isFile() --> " + file.isFile());
        System.out.println("File isDirectory() --> " + file.isDirectory());

        File file2 = new File("/Users/pavitra.m/Documents/Week 4");
        String[] files = file2.list();
        if (files != null) {
            for (String fileEach : files) {
                System.out.println(fileEach);
            }
        } else {
            System.out.println("No files found");
        }

        File filenew = null;
        try {
            filenew = new File("/Users/pavitra.m/Downloads/aaa.txt");
            filenew.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        filenew.delete();

        System.out.println(file.mkdir());

    }
}
