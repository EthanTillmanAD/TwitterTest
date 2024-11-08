package twitter;

public class Main {
    public static void main(String[] args) {


        SocialHandle socialHandle = new SocialHandle();

            //socialHandle.createHandle("Pinkdounut5567");



            //socialHandle.addHandle("");
           socialHandle.addHandle("@pinkdounut");

            //
         socialHandle.removeHandle("@pinkdounut");

       System.out.println(socialHandle.getHandles());
    }
}
