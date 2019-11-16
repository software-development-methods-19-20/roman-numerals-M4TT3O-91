package dssc.roman;

public class RomanNumeral {

    private int decimal;
    private String UNIT[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
    private String DEC[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX", "XC"};



    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        if (decimal>0) {
            return DEC[decimal/10%10] + UNIT[decimal%10];
        }else {
            return UNIT[0];

        }

        //return UNIT[this.decimal%100];

        /*if(this.decimal<=10){
            return UNIT[this.decimal];
        }else{
            return UNIT[1];*/
        }
}
