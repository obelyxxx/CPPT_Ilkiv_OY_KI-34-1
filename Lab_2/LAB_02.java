package Lab_2;

import java.io.*;
import java.util.*;
    /**
     * Клас Lab2 реалізує приклад програми до лабораторної роботи №2
     *
     * @author Ostap Ilkiv
     * @version 1.0
     * @since version 1.0
     *
     */
    public class LAB_02
    {
        /**
         * Статичний метод main є точкою входу в програму
         * <p>
         *
         *
         */
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            PrintWriter writer = new PrintWriter("MyFile.txt");
            System.out.print("Enter the matrix size: ");
            int size = scanner.nextInt();
            System.out.print("Enter the placeholder character: ");
            char character = getPlaceholderCharacter().charAt(0);
            int half = size;
            char[][] arr = new char[size][half];
            int n = size - 2;

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < size; i++) {

                for (int j = 0; j < size; j++) {
                    if((i<j&&i+j>n+1 )|| (i>j&&i+j<n+1 ) ||i==j || i+j == size -1){
                     arr[i][j] = character;
                        builder.append(String.format("%c\t", character));}

                    else
                        builder.append(" \t");
                }
                builder.append("\n");
            }

            writer.write(builder.toString());
            System.out.println(builder);

            writer.flush();
            writer.close();
            scanner.close();
        }

        private static String getPlaceholderCharacter() {
            Scanner scanner = new Scanner(System.in);
            String character = scanner.nextLine();
            if (character.length() != 1) {
                throw new IllegalArgumentException("Only one character must be entered");
            }
            return character;
        }
    }