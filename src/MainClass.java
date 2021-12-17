public class MainClass
{

    public static void main(String[] args)
    {
        System.out.println("Hi! This is main");

        TestTwo();

    }

   public static void TestTwo(){
       System.out.println("TestTwo!");
   }


   public static void PrintLetter(){
        for(char a = 'a'; a < 'i'; a++)
        {
            System.out.println(a + ' ');
        }
   }
}
