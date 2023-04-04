package javaprogrammes;

public class Programme_3_ReverseAnArray {

        public static void main(String[] args) {
            Programme_3_ReverseAnArray obj = new Programme_3_ReverseAnArray();
            obj.reverseArray();
        }

        public void reverseArray(){
            int[] intArray = {2019,2020,2021,2022,2023};

            //print array starting from first element
            System.out.println("Original Array:");
            for(int i=0;i<intArray.length;i++)
                System.out.print(intArray[i] + "  ");

            System.out.println();

            //print array starting from last element
            System.out.println("Original Array printed in reverse order:");
            for(int i=intArray.length-1;i>=0;i--)
                System.out.print(intArray[i] + "  ");
        }

    }
