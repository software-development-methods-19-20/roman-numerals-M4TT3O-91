package dssc.roman;

public class RomanNumeral {

    private int decimal;
    private String Unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
   // private String Decimal[]={};

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        if(this.decimal<=10){
            return Unit[this.decimal];
        }else{
            return Unit[1];
        }

        /*switch(this.decimal) {
            case 1:
            case 2:
            case 3:
                return "I".repeat(decimal);
            case 5:
                return "V";
            case 10:
                return "X";

            default:
                return "";
        }*/

        /*if (this.decimal == 0) {
            return "";
        } else {
            return "I".repeat(decimal);
        }*/
    }
}
