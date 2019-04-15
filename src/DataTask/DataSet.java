package DataTask;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSet {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\473060\\IdeaProjects\\ДЗ4\\src\\DataTask\\DataUSACart.csv");
        try {
            ArrayList<String> line = new ArrayList<>(Files.readAllLines(path));
            ArrayList<String[]> data = new ArrayList<>();

            line.forEach(x->data.add(x.replaceAll("\"","").split(",")));
            data.remove(0);

            int first_dif;
            int second_dif;
            int third_dif;
            int[] predict = new int[data.size()];

            for (int i = 0 ; i < data.size()-1; i++) {
                first_dif = Integer.parseInt(data.get(i)[5])-Integer.parseInt(data.get(i)[4]);
                second_dif = Integer.parseInt(data.get(i)[6])-Integer.parseInt(data.get(i)[5]);
                third_dif = Integer.parseInt(data.get(i)[7])-Integer.parseInt(data.get(i)[6]);
                predict[i] = (third_dif + second_dif + first_dif) / 3;
            }

            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество регинов в топе: ");
            int topN = in.nextInt();
            int[] top_index = new int[topN];
            int[] top = new int[topN];
            for (int i = 0; i < data.size(); i++) {
                for (int j = 0; j < topN; j++) {
                    if(predict[i] > top[j]) {
                        top_index[j] = i;
                        top[j] = predict[i];
                        break;
                    }
                }
            }

            for(int i:top_index){
                System.out.println(data.get(i)[0] + ": " + predict[i]);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
