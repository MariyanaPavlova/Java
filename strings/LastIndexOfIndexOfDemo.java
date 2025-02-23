package strings;

public class LastIndexOfIndexOfDemo {
    public static void main(String[] args) {
        String text = "Yam lyuti chushki";

        char c = text.charAt(4);
        System.out.println(c);

        int length = text.length();
        System.out.println(length);

        String name = "                    Zhulian Iliev               ";
        System.out.println(name);
        String zhuBezPalaski = name.trim();
        System.out.println(zhuBezPalaski);

        String lowerCaseZhu = zhuBezPalaski.toLowerCase();
        System.out.println(lowerCaseZhu);
        String upperCaseZhu = zhuBezPalaski.toUpperCase();
        System.out.println(upperCaseZhu);

        String otherText = "Today during Xmas the white beard man killed a person with whatever... the";
        int whiteBeardManIndex = otherText.indexOf("white beard man");
        System.out.println(whiteBeardManIndex);

        int whiteBeardMan1Index = otherText.lastIndexOf("killed");
        System.out.println(whiteBeardMan1Index);

        String substring = otherText.substring(whiteBeardManIndex, whiteBeardMan1Index);
        System.out.println(substring);

    }
}
