public class ConvertStringToInt {
    public static void main(String[] args) {
        System.out.println("Hi , This is more code in QA Branch");
        //Converting String into int using Integer.parseInt()


        String s="200";
        System.out.println("String= "+s);
        System.out.println(s+500);

//200100

        int i=Integer.parseInt(s);

        System.out.println("Integer= "+i);
        System.out.println(i+500);

        //200+100
        //300








//converting String into Integer using Integer.valueOf() method
        System.out.println("converting String into Integer using Integer.valueOf() method");
        String s2="300";
        System.out.println(s2+500);
        Integer i2=Integer.valueOf(s2);
        System.out.println(i2);
        System.out.println(i2+500);



    }
}
