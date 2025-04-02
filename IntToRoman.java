public class IntToRoman {
    public static void main(String[] args) {

        int num = 2222;

        // String m[] = { "", "M", "MM", "MMM" };
        // String c[] = { "",  "C",  "CC",  "CCC",  "CD",
        //                "D", "DC", "DCC", "DCCC", "CM" };
        // String x[] = { "",  "X",  "XX",  "XXX",  "XL",
        //                "L", "LX", "LXX", "LXXX", "XC" };
        // String i[] = { "",  "I",  "II",  "III",  "IV",
        //                "V", "VI", "VII", "VIII", "IX" };

        // String thousands = m[num / 1000];
        // String hundreds = c[(num % 1000)/100];
        // String tens = x[(num % 100)/10];
        // String ones = i[num % 10];

        // String ans = thousands + hundreds + tens + ones;

        // System.out.println(ans);

        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < value.length && num > 0; i++) {
            while (num >= value[i]) {
                romanNumeral.append(roman[i]);
                num -= value[i];
            }
        }
        System.out.println(romanNumeral.toString());
    }
}