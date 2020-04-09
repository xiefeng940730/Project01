package cn.dwt.bean;

import com.sun.imageio.plugins.jpeg.JPEGStreamMetadataFormat;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author shkstart
 * @create 2020-04-09 10:46
 * 1. IDEA中代码模板所在的位置：settings-Editor-live Templates/Postfix Completion
 * 2. 常用模板
 */
public class TemplatesTest {
    //模板六：prsf可以生产private static final
    //变形prsf、psfi、psfs
    //模板一：psvm
    public static void main(String[] args) {
        /*//模板二：sout
        System.out.println("Hello Java");
        //变形：soutp（打印形参）、soutm（打印方法）、soutv（）、xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        int num=10;
        int num1=45;
        //打印变量
        System.out.println("num1 = " + num1);
        System.out.println(num);*/

        //模板三：fori
        String [] arrr=new String[]{"tom","jack","lili","lilei"};
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }
        System.out.println("--------------------------------------------------");
        //变形：iter
        for (String s : arrr) {
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------");
        //变形：itar
        for (int i = 0; i < arrr.length; i++) {
            String s = arrr[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        for (Object o : list) {
            System.out.println(o);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形xxx.nn      xxx。null
        if (list != null) {

        }

    }
}
