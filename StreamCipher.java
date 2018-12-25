/******************************************************************************
Pradnya Borkar
Stream Cipher Algorithm (Original idea)
7682
CSS
*******************************************************************************/
import java.util.*;
public class Main
{
    
  static void encrypt(){
  Scanner sc=new Scanner(System.in);
  char alpha[]=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  System.out.println("enter a plain text:");
  String plainText=sc.nextLine();
  System.out.println("enter length of key(Multiple of 16)");
  int n=sc.nextInt();
  System.out.println("enter key(Multiple of 16)");
  int row=n/16;
  int arr[][]=new int[row][16];
  for(int i=0;i<row;i++){
      for(int j=0;j<16;j++){
            arr[i][j]=sc.nextInt();
                           }
                         }
   int count=0;
   for(int i=0;i<16;i++){
      for(int j=0;j<row-1;j++){
          if((arr[j][i]==1 && arr[j+1][i]==0)||(arr[j][i]==0     && arr[j+1][i]==1))
          count=count+1;
            }
            
        }
      
   count+=3;
   System.out.println("The encrypted Text:");
   //converting char to Number
   for(int i=0;i<plainText.length();i++){
       char a=plainText.charAt(i);
       int t=a-'a';
       t+=count;
       t=t%26;
       System.out.print(alpha[t]);
            
            
     }
        
       
        
}
static void decrypt(){
  Scanner sc=new Scanner(System.in);
  char alpha[]=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  System.out.println("enter a cipher text:");
  String cipherText=sc.nextLine();
  System.out.println("enter length of key(Multiple of 16)");
  int n=sc.nextInt();
  System.out.println("enter key(Multiple of 16)");
  int row=n/16;
  int arr[][]=new int[row][16];
  for(int i=0;i<row;i++){
      for(int j=0;j<16;j++){
          arr[i][j]=sc.nextInt();
            }
        }
  int count=0;
  for(int i=0;i<16;i++){
     for(int j=0;j<row-1;j++){
        if((arr[j][i]==1 && arr[j+1][i]==0)||(arr[j][i]==0 && arr[j+1][i]==1))
        count=count+1;
            }
            
        }
  count+=3;
  System.out.println("The Decrypted Text:");
  //converting char to Number
  for(int i=0;i<cipherText.length();i++){
    char a=cipherText.charAt(i);
    int t=a-'a';
    t-=count;
    if(t>=0)
       t=t%26;
    else
       t=26+t;
                        
    System.out.print(alpha[t]);
            
        
    }
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for encryption and 2 for 							Decryption");
	int choice=sc.nextInt();
	switch(choice){
		case 1: encrypt();
		        break;
		case 2: decrypt();
		        break;
		default: System.out.println("error in input");
		}
	}
}
/* output:
********************Encryption*************************
Enter 1 for encryption and 2 for Decryption
1
enter a plain text:
wemeettoday
enter length of key(Multiple of 16)
32
enter key(Multiple of 16)
1 1 0 1 0 1 1 1 0 1 0 1 0 0 0 0 1 1 0 0  1 1 1 0 0 1 0 1 1 0 1 0 0
The encrypted Text:
gowooddynki
*********************Decryption*****************************
Enter 1 for encryption and 2 for Decryption
2
enter a cipher text:
gowooddynki
enter length of key(Multiple of 16)
32
enter key(Multiple of 16)
1 1 0 1 0 1 1 1 0 1 0 1 0 0 0 0 1 1 0 0 1 1 1 0 1 0 1 1 0 1 0 0 0
The Decrypted Text:
wemeettoday


*/
