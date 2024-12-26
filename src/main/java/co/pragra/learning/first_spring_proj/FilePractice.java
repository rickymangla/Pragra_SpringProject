package co.pragra.learning.first_spring_proj;

import java.io.*;
import java.util.Scanner;

//public class FilePractice {
//
//    public static void main(String[] args) {
//        File f = null;
//        try {
//            f = new File("D:\\Pragra_Java_Material\\test.txt");
//            if (f.createNewFile()) {
//                System.out.println("file created successfully");
//            } else {
//                System.out.println("file exist already");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        if (f.exists()) {
//            System.out.println("file name is: " + f.getName());
//            System.out.println("file location is: " + f.getAbsolutePath());
//            System.out.println("file writable is: " + f.canWrite());
//            System.out.println("file readable is: " + f.canRead());
//            System.out.println("file size is: " + f.length());
//            System.out.println("file deleted is: " + f.delete());
//        } else {
//            System.out.println("file does not exist");
//        }
//
//
//    }
//}

class FileWritePractice {
    public static void main(String[] args) {
        File f1 = null;
        FileWriter f = null;
        FileReader fr = null;
        try {
            f = new FileWriter("D:\\Pragra_Java_Material\\test1.txt");
            f.write("this is for testing purpose");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                f.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            fr = new FileReader("D:\\Pragra_Java_Material\\test1.txt");
            int c;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                System.out.print(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        f1 = new File("D:\\Pragra_Java_Material\\test1.txt");
        if (f1.exists()) {
            System.out.println("\n" + f1.delete());
        }
    }
}

class DirectoryPractice {
    public static void main(String[] args) {

        //  InputStreamReader cin = null;
//        Scanner sc = null;
//        try {
//            //   cin = new InputStreamReader(System.in);
//            sc = new Scanner(System.in);
//            // System.out.println("Enter character q to quit");
//            char c;
//            do {
//                System.out.println("Enter character q to quit");
//                // c = (char) cin.read();
//                c = sc.next().charAt(0);
//                System.out.println(c);
//            }
//            while (c != 'q');
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                sc.close();
//                //cin.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

                File f = null;
                FileInputStream fis = null;
                FileOutputStream fos = null;
                FileWriter fw = null;
                try {
                    f = new File("D:\\Pragra_Java_Material\\test.txt");
                    fw = new FileWriter(f);
                    fw.write("this is sample file for testing only");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        fw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                try {
                    fis = new FileInputStream("D:\\Pragra_Java_Material\\test.txt");
                    fos = new FileOutputStream("D:\\Pragra_Java_Material\\test1.txt");
                    int c;
                    while ((c = fis.read()) != -1) {
                        fos.write(c);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        fis.close();
                        fos.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }


//                try {
//                    f=new File("D:\\Pragra_Java_Material\\test.txt");
//                    fw = new FileWriter(f);
//                  //  fis = new FileInputStream(f);
//                  //  fos = new FileOutputStream("D:\\Pragra_Java_Material\\test1.txt");
//                    try {
//                        fw.write("this is for testing purpose only");
//                        fis = new FileInputStream(f);
//                        int c;
//                        while ((c = fis.read()) != -1) {
//                            fos.write(c);
//                        }
//
//                    } finally {
//                        fw.close();
//                        fis.close();
//                        fos.close();
//                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }


        //        File f4 = new File("/tmp/user/java/bin");
        //        boolean mkdirs = f4.mkdirs();
        //        System.out.println(mkdirs);


        //        if(f4.exists()) {
        //            System.out.println("f4.delete() = " + f4.delete());
        //        }

        //        String dirPath = "/tmp/user/java/bin";
        //        File f = new File(dirPath);
        //        System.out.println(f.mkdirs());
        //        File f1 = new File(dirPath);
        //        System.out.println(f1.exists());
        //        File f2 = new File("/tmp/user/java/bin/test");
        //        System.out.println(f2.mkdir());
        //        File f3 = new File("/tmp/user/java/bin/test/test1.txt");
        //        System.out.println("f3.createNewFile() = " + f3.createNewFile());
        //
        //        File f4 = new File("/tmp/user/java/bin");
        //
        ////        String paths[] = f4.list();
        ////        for (String path : paths) {
        ////            System.out.println(path);
        ////        }
        //
        //        if(f4.exists()) {
        //            System.out.println("f4.delete() = " + f4.delete());
        //        }


    }
}
