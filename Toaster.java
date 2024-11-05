public class Toaster implements IToaster {
    @Override
      public void toast(Toast toast){
        System.out.println("Start toasting...");
        toast.setDarknessLevel(5);
        System.out.println("Done toasting...");
        }
    }
