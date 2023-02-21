import java.util.*;

public class Nomor2 {
    public static void main(String[] args) {
        ArrayList<Object> foods = new ArrayList<Object>();
        foods.add("Fried rice");
        foods.add("Fried chicken");
        foods.add("Beef burger");
        foods.add("Pizza");
        foods.add("Sushi");
        foods.add("Spaghetti ");
        foods.add("Fish and chips");
        foods.add("Omelette ");
        foods.add("Fried noodles");
        foods.add("Meatball ");
        
        ArrayList<Object> FWC = new ArrayList<Object>();
        FWC.add(1998);
        FWC.add(2010);
        FWC.add(2022);

        ArrayList<String> provinsi = new ArrayList<>();
        provinsi.add("Jawa Barat");
        provinsi.add("Jawa Timur");
        provinsi.add("Banten");
        provinsi.add("Bengkulu ");
        provinsi.add("Jawa Tengah");
        provinsi.add("Gorontalo ");
        provinsi.add("Aceh");
        provinsi.add("Jambi ");
        provinsi.add("Bali ");
        provinsi.add("Jakarta ");
        Collections.sort(provinsi);

        ArrayList<String> sortProvinsi = new ArrayList<String>();
        
        for (int i = provinsi.size()-1; i >= 0; i--) {
            sortProvinsi.add(provinsi.get(i));
        }

        ArrayList<Object> code = new ArrayList<Object>();
        code.add("Python");
        code.add("Java");
        code.add("JavaScript");
        code.add("C#");
        code.add("C++");
        code.add("Ruby");
        code.add("Swift");
        code.add("PHP");
        code.add("Objective-C");
        code.add("Kotlin");
        code.add("TypeScript");
        code.add("Go");

        code.remove(2);
        code.remove(5);
        code.remove(4);
        code.remove(1);
        code.remove(3);


        System.out.println(foods);
        System.out.println(FWC);
        System.out.println(sortProvinsi);
        System.out.println(code);
        
    }
}
