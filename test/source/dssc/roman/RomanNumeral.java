package dssc.roman;

public class RomanNumeral {

    private int decimal;
    private String UNIT[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
    private String DOZEN[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX", "XC"};
    private String UNDREDS[] ={"","C","CC","CCC","CD","D","DC","DCC","DCCC", "CM"};
    private String THOUSANDS[] ={"","M","MM","MMM"};


    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        if (decimal>=0 && decimal<4000) {
            return THOUSANDS[decimal/1000]+UNDREDS[(decimal%1000)/100]+DOZEN[(decimal%100)/10] + UNIT[decimal%10];
        }else{
            return "Il numero deve essere minore di 3999";

        }
    }
}
