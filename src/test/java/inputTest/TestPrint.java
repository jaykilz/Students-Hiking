/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputTest;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 *
 * @author ALPS
 */
public class TestPrint {

    public static void main(String[] args) {
        try ( RandomAccessFile raf = new RandomAccessFile("data/students.csv", "rw");  FileChannel channel = raf.getChannel();  FileLock lock = channel.tryLock()) {

            if (lock != null) {
                // Thao tác với file
                System.out.println("Đã lock file");
            } else {
                System.out.println("File đang được dùng bởi chương trình khác");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
