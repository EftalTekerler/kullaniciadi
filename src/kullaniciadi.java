import java.util.Scanner ;
public class kullaniciadi {
    public static void main(String[] args) {
        String username,password,change,newpass  ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı giriniz");
        username = inp.nextLine();
        System.out.println("Password Giriniz");
        password = inp.nextLine();

        if (username.equals ("patika") && password.equals("java123"))
        {
            System.out.println("Giriş yaptınız");
        }
        else {
            System.out.println("Hatalı Giriş Yaptınız" );
        System.out.println("Yeni bir şifre oluşturmak istermisiniz");
        System.out.println("1-Evet\n2-Hayır");
        change = inp.nextLine();
        if (change.equals("1")){
System.out.println("Yeni şifre eski şifre ile aynı olamaz");
System.out.print("Yeni şifre giriniz");
newpass = inp.nextLine();
        if (newpass.equals("abs") == newpass.equals("java123")) {
System.out.println("Yeni şifre eski girilen şifre ile aynı olamaz");
return;

            }

        }

    }} }




