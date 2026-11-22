import java.util.Scanner;

        void main(){
            Scanner s = new Scanner(System.in);
            IO.print("Enter the number of integers (n):");
            int n = s.nextInt();

            if (n < 0) {
                IO.println("n must be a nonnegative integer.");
                return;
            }

            int[] nums = new int[n];

            for(int i=0; i<n; i++){
                IO.print("Enter integer #" + (i + 1) + ":");
                nums[i] = s.nextInt();
            }

            sortArray(nums);

            IO.println("Sorted numbers :");
            for(int i=0; i<n; i++){
                System.out.println(nums[i]);
            }
            s.close();
        }

        void sortArray(int[] arr){
            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j< arr.length; j++){
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
