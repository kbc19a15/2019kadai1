/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecafe;
import java.util.Scanner;
/**
 *
 * @author kbc19a15
 */
public class ITECafe {

     private static Object Scan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item coffee = new Item(1, "コーヒー", 200);
        Item icetea = new Item(2, "紅茶", 200);
        Item cake = new Item(3, "ケーキ", 400);
        Item frenchtoast = new Item(4, "フレンチトースト", 500);
        Item pancake = new Item(5,"パンケーキ",500);
        Item sandwich = new Item(6,"サンドイッチ",400);
        Item pasta = new Item(7, "パスタ", 600);
        
        Item[] items = new Item[20];
        items[0] = coffee;
        items[1] = icetea;
        items[2] = cake;
        items[3] = frenchtoast;
        items[4] = pancake;
        items[5] = sandwich;
        items[6] = pasta;
        Scanner scan = new Scanner(System.in);

        //メニューを表示する
        int inputNum;
        int inputMum;
        int goukei = 0;

        while (true) {
            while (true) {
                System.out.println("■■■ITECafeシステム■■■");
                System.out.println(coffee.getNo() + ":" + coffee.getName()+":"+coffee.getPrice()+"円");
                System.out.println(icetea.getNo() + ":" + icetea.getName()+":"+icetea.getPrice()+"円");
                System.out.println(cake.getNo() + ":" + cake.getName()+":"+cake.getPrice()+"円");
                System.out.println(frenchtoast.getNo() + ":" + frenchtoast.getName()+":"+frenchtoast.getPrice()+"円");
                System.out.println(pancake.getNo() + ":" + pancake.getName()+":"+pancake.getPrice()+"円");
                System.out.println(sandwich.getNo() + ":" + sandwich.getName()+":"+sandwich.getPrice()+"円");
                System.out.println(pasta.getNo() + ":" + pasta.getName()+":"+pasta.getPrice()+"円");
                System.out.println("商品番号を入力してください");
                 
                
                
                try {

                    String inputStr;
                    inputStr = scan.next();
                    inputNum = Integer.parseInt(inputStr);
                    
                    System.out.println(inputNum);
                    System.out.println(items[inputNum - 1].getNo() + ":" + items[inputNum - 1].getName()
                            + "" + items[inputNum - 1].getPrice() + "円が入力されました");
                    break;
                    
                    

                } catch (NumberFormatException e) {
                    System.out.println("入力エラー:数値を入力してください");

                    // TODO code application logic here
                }

            }
            
            
            System.out.println("数を入力してください");
            String inputStr;
            String inputMtr;
            inputMtr = scan.next();
            inputMum = Integer.parseInt(inputMtr);
            
            
            goukei = (int)(goukei+(items[inputNum -1].getPrice()*inputMum * 1.08));
            System.out.println( goukei );
            
            System.out.println("合計金額は" + goukei + "円です");
       
           
            
            System.out.println("ご注文は以上ですか？");
            System.out.println("1:終了");
            System.out.println("2:追加注文");
            inputStr = scan.next();
            inputNum = Integer.parseInt(inputStr);
            if( inputNum == 1 ){
                break;
            }else if(inputNum == 2){
                
            }
             
        }
        
         System.out.println("お支払い金額はいくらにしますか");
         while(true){
              String inputStr;
            inputStr = scan.next();
            int osiharai = Integer.parseInt(inputStr);
             if(osiharai>=goukei){
                int oturi=osiharai-goukei;
                System.out.println("お釣りは"+oturi+"円です");
                System.out.println("ご利用ありがとうございました");
                break;
             }else if(osiharai<=goukei){
                 int tarinai=goukei-osiharai;
                 System.out.println(tarinai+"円足りません");
             }
         }
         
             }
    }
  
        
          

