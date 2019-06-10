package com.spring;

import java.io.File;

/**
 * Created by Enzo Cotter on 2019/1/9.
 */
public class IocTest {

    public static void main(String[] args) {
//        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File file) {
//                return file.isHidden();
//            }
//        });

        File[] hiddenFiles = new File(".").listFiles(File::isHidden);

    }
}
