import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayDivision div = new ArrayDivision();
        int[] tab = {1, 2, 3, 4, 5, 6, 7,8,9,10};
        int n = 5;
        System.out.println("Przed zmianą: " + Arrays.toString(tab));
        try {
//           tab = null;
//            n = 8;
//            n=tab.length;
//             n = -1;

            div.division(tab, n);
            System.out.println("Po zmianie: " + Arrays.toString(div.division(tab, n)));
        } catch (NullPointerException e) {
            System.out.println("Pusta tabela;");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Liczba n jest większa od długości tablicy");
        } catch (NegativeArraySizeException e) {
            System.out.println("Nie można podzielić na ujemne części");;
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie na 0");
        } catch (LargeNException e) {
            System.out.println("Zbyt duże n");
        }

    }
}
