public class Program {
    public static void main(String[] args) {
        IToaster toaster1 = new Toaster();
        toaster1.toast(new Toast());

        IToaster toaster2 = new SteamToaster();
        toaster2.toast(new Toast());

        IToaster toaster3 = new Toaster(); 
        toaster3.toast(new Toast());
    }
}