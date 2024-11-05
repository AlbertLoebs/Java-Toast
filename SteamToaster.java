public class SteamToaster implements IToaster {
    @Override
       public void toast(Toast toast){
            System.out.println("Start toasting and steaming...");
            toast.setDarknessLevel(8);
            System.out.println("Done toasting and steaming...");
        }
    }