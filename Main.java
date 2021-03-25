import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите пример ");
        String task = input.nextLine();
        try {
            GetNums.GetNums(task);

            try {
                GetResult.GetResult(GetNums.getX1(), GetNums.getY1(), GetNums.getSign());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                ;
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Некорректно введены данные");
            ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }

    }


}

