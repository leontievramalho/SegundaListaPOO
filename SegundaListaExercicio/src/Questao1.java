public class Questao1 {
    public static void main(String[] args){
        System.out.println(dateFormat(18, 2, 2023));
        System.out.println("Teste com data que não existe: ");
        System.out.println(dateFormat(30, 2,2023));
    }
    public static String dateFormat(int day, int month, int year){
        if(month>12||month<1||day>31||day<1||((month == 4 || month == 6 || month == 9 || month == 11)&&day>30)||
                (month == 2 && day > 28)||year<1)
            return "Data inválida.";
        String dayFormat = day + " de ";
        String monthFormat = null;
        switch (month){
            case 1 -> monthFormat = "Janeiro";
            case 2 -> monthFormat = "Fevereiro";
            case 3 -> monthFormat = "Março";
            case 4 -> monthFormat = "Abril";
            case 5 -> monthFormat = "Maio";
            case 6 -> monthFormat = "Junho";
            case 7 -> monthFormat = "Julho";
            case 8 -> monthFormat = "Agosto";
            case 9 -> monthFormat = "Setembro";
            case 10 -> monthFormat = "Outubro";
            case 11 -> monthFormat = "Novembro";
            case 12 -> monthFormat = "Dezembro";
        }
        String yearFormat = " de " + year;
        return dayFormat + monthFormat + yearFormat;
    }
}
