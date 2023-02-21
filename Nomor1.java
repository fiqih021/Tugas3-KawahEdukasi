import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nomor1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean isEmail,isDate1, isDate2, isIp = false;

        final String email = "^[A-Za-z0-9+_.-]+@(.+)$";
        final String date1 = "^(29-02-(2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26])))$"
        +"|^(((0[1-9]|1[0-9]|2[0-8])-02-(19|2[0-9])[0-9]{2}))$"
        +"|^((0[1-9]|[12][0-9]|3[01])-(0[13578]|10|12)-((19|2[0-9])[0-9]{2}))$" 
        +"|^((0[1-9]|[12][0-9]|30)-(0[469]|11)-((19|2[0-9])[0-9]{2}))$";
        final String date2 = "^(Senin|Selasa|Rabu|Kamis|Jumat|Sabtu|Ahad),\\s(Januari|Februari|Maret|April|Mei|Juni|Juli|Agustus|September|Oktober|November|Desember)\\s\\d{2}$";
        final String ip = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        String string = in.nextLine();
        
        isEmail = Pattern.matches(email, string);
        isDate1 = Pattern.matches(date1, string);
        isDate2 = Pattern.matches(date2, string);
        isIp = Pattern.matches(ip, string);

        if(isEmail){
            System.out.println("Hasil Inputan adalah pattern Email");
        }else if(isDate1){
            System.out.println("Hasil Inputan adalah pattern dd-MM-yyyy");
        }else if(isDate2){
            System.out.println("Hasil Inputan adalah pattern dddd, MMMM yy");
        }else if(isIp){
            System.out.println("Hasil Inputan adalah pattern IP");
        }else{
            System.out.println("Tidak termasuk dalam pattern");
        }
    }
}
