package info.bliki.tools;

public class RegularExpressionsUtilities {

    public static void main(String[] args) {
        String data = "aaaaaaaa1111[01]22222bbbbbbbbbb";
        System.out.println("xxxx->" + data);
        String regex = "\\[[0-9]*\\]";
        data  = data .replaceAll(regex, "");
        System.out.println("data->" + data);

        String foo = "(x)()foo(x)()";
        String cleanFoo = foo.replaceAll("\\([^\\(]*\\)", "");
        System.out.println("cleanFoo->" + cleanFoo);
    }

}
