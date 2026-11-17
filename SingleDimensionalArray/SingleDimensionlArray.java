
package chapter2.SingleDimensionalArray;


import java.util.Scanner;


public class SingleDimensionlArray {
    public static void main(String[] args) {
        int numbers[]=new int[10];
        int size=0;  // حجم العناصر الممتلئة 
        Scanner in = new Scanner(System.in);
        boolean userselect=true;
        while(userselect){
            System.out.println("-----Array operation-----");
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Delete");
            System.out.println("4.Update");
            System.out.println("5.Exit");
            System.out.print("Enter Selected Value : ");
            int userselectlist = in.nextInt();
            switch(userselectlist){
                case 1: // عشان اضيف عناصر 
                    if(size<numbers.length){  // مينفعش اضيف حجم  اكبر من طول المصفوفة // مثال ذلك باص يسع فقط لعشر ركاب لايمكن ان يسع راكب اضافي 
                        System.out.println("Enter Number To ADD");
                        int number = in.nextInt();
                        numbers[size]=number; // في المكان صفر اعطيته قيمة  //[i = size]
                        size++; // هيك انتقل من المكان  صفر الى واحد 
                        System.out.println("Number Added Succesfuly...");
                    }else {  // لوكان الحجم اكبر من طول المصفوفة 
                                                System.out.println("Array Is Full...");

                    }
                    break;
                case 2 : // عشان اعرض العناصر 
                    System.out.println("Numbers in Array");
                    for(int i=0; i<size ; i++){  // هيبقى يلف حتى يوصل لأخر سايز وصلته مع كل اضافة تتم اضافتهاعشان هيك مطبعش باقي طول المصفوفة وما اعطاها اصفار 
                        System.out.println("nmbers "+i+"= "+numbers[i]); // لاحظ (i)تعامل معاملت السايز //[i = size] طبعا فوق في الاضافة تعتبر الاي هي نفسها السايز واحنا خليناها تساوي نمبرز
                    }
                   
                    break;
                case 3 : // عشان احذف عنصر 
                     System.out.println("Enter deleteindex Of Element:");// دخل مكان العنصر المراد الحذف عليه 
                    int deleteindex = in.nextInt();
                    if(deleteindex<size && deleteindex>=0){ // عشان اتأكد انو العنصر موجود وانه مش سالب في حال ادخل لمستخدم رقم سالب 
                        for(int i =deleteindex; i<size;i++){
                            numbers[deleteindex]= numbers[deleteindex+1];
                        }
                        size--; // عشان يتم الحذف 
                        
                        System.out.println("Deleted Succesfuly...");
                    }else{
                        System.out.println("Invalid Index !!");
                    }
                    break;
                case 4 : // عملية تعديل لعنصر محدد داخل المصفوفة
                    System.out.println("Enter UpdatedIndex Of Element:");// دخل مكان العنصر المراد التعديل عليه 
                    int UpdatedIndex = in.nextInt();
                    if(UpdatedIndex<size && UpdatedIndex>=0){ // عشان اتأكد انو العنصر موجود وانه مش سالب في حال ادخل لمستخدم رقم سالب 
                        System.out.println("Enter NewValue Of Element : ");
                        int NewValue = in.nextInt();
                        numbers[UpdatedIndex]=NewValue;
                        System.out.println("Update Succesfuly...");
                    }else{
                        System.out.println("Invalid Index !!");
                    
                    }
                    
                    break;
                case 5 :
                    userselect=false;
                    break;
            
            }





        
        }
    }
    
}
