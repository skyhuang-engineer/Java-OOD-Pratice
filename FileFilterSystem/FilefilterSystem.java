import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FilefilterSystem {

    public List<File> filter(List<File> files, FileFilter fileFilter) { // singe condition filter
        List<File> fileList = new ArrayList<>();
        if (files == null || files.size() == 0) {
            return fileList;
        }

        for (File each : files) {
            if (fileFilter.filter(each)) {
                fileList.add(each);
            }
        }
        return fileList;
    }

    public List<File> filter(List<File> files, FilterTreeNode root) {
        List<File> fileList = new LinkedList<>();
        if (files == null || files.size() == 0) {
            return fileList;
        }
        for (File f : files) {
            if (root.eval(f)) {
                fileList.add(f);
            }
        }

        return fileList;
    }
    private static void printFiles(List<File> files) {
        for (File file : files) {
            System.out.println(file);
        }
    }

    public static void main(String[] args) {
        FilefilterSystem fileFilterSystem = new FilefilterSystem();

        File a = new File(500, "Andyjpg16", "jpg", "Andy");
        File b = new File(200, "Britsjpg17", "jpg", "Brits");
        File c = new File(500, "Collintxt15", "txt", "Collin");
        File d = new File(300, "Divapdf20", "pdf", "Diva");

        List<File> files = Arrays.asList(a, b, c, d);

        // test single file filter
        System.out.println("--------------test single file filter------------------");
        FilterParameter fileParam = FilterParameter.createFromSize(500);
        FilterbySize sizeFilter = new FilterbySize(fileParam);
//
        List<File> res1 = fileFilterSystem.filter(files, sizeFilter);
        FilefilterSystem.printFiles(res1);

        // test file filter printFilescombo
        System.out.println("\n--------------test file filter combo------------------");
        AndFilterTreeOperator andOptr = new AndFilterTreeOperator();
        OrFilterTreeOperator orOptr = new OrFilterTreeOperator();

        FilterParameter fileParamSize500 = FilterParameter.createFromSize(500);
        FilterbySize sizeFilter500 = new FilterbySize(fileParamSize500);
        FileFilter creatorFilterAndy = new FilterbyCreator(FilterParameter.createFromCreator("Andy"));
        FilterbyType typeFilter = new FilterbyType(FilterParameter.createFromType("pdf"));

        FilterTreeNode node3 = new FilterTreeNode(sizeFilter500);
        FilterTreeNode node4 = new FilterTreeNode(creatorFilterAndy);
        FilterTreeNode node1 = new FilterTreeNode(andOptr, node3, node4);
        FilterTreeNode node2 = new FilterTreeNode(typeFilter);

        FilterTreeNode root = new FilterTreeNode(orOptr, node1, node2);

        List<File> res2 = fileFilterSystem.filter(files, root);
        fileFilterSystem.printFiles(res2);
    }



}
