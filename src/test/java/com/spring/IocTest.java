package com.spring;

import com.jiagouedu.inter.BufferedReaderProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Enzo Cotter on 2019/1/9.
 */
public class IocTest {

    public static List<String> filter(List<String> lists, Predicate<String> pre) {

        List<String> nonEmptyList = new ArrayList<String>();
        for(String str: lists) {
            if(pre.test(str)) {
                nonEmptyList.add(str);
            }
        }
        return nonEmptyList;
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("src\\test\\java\\com\\spring\\test.txt"));
        return p.process(br);
    }

    public static void main(String[] args) {
        /*String line = "";
        try {
//            line = processFile((BufferedReader br) -> br.readLine());
            line = processFile((BufferedReader br) -> br.readLine() + " " + br.readLine());
            System.out.println("文件的内容: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        List<String> lists = Arrays.asList("yangcan","china", "", "123");
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> li = filter(lists, nonEmptyStringPredicate);
        System.out.println(li);
    }

}
