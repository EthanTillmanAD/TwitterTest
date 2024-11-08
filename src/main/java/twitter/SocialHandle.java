package twitter;

import java.util.HashSet;

public class SocialHandle  {

    HashSet<String> listOfHandles = new HashSet<>();

    public String createHandle(String yourSocialHandle) {
        char[] check = yourSocialHandle.toCharArray();

        if (yourSocialHandle.isEmpty()) {
            try {
                throw new EmptyException("Cannot be empty");
            } catch (EmptyException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

        if (check[0] == '@') {
            if (yourSocialHandle.length() <= 10) {
                String socialHandle = yourSocialHandle.toLowerCase();
                return socialHandle;
            }else{
                StringBuilder stringBuilder = new StringBuilder();
                char[] x = yourSocialHandle.toCharArray();

                for (int i = 0; i < 9; i++) {
                    stringBuilder.append(x[i]);
                }
                String endResult = stringBuilder.toString();

                return endResult.toLowerCase();
            }
        } else if (yourSocialHandle.length() <= 9) {
            String socialHandle = "@" + yourSocialHandle.toLowerCase();
            return socialHandle;

        } else {

            StringBuilder stringBuilder = new StringBuilder();
            char[] x = yourSocialHandle.toCharArray();

            for (int i = 0; i < 9; i++) {
                stringBuilder.append(x[i]);
            }
            String endResult = "@" + stringBuilder.toString();

            return endResult.toLowerCase();
        }
        //return null;
    }

    public void addHandle(String yourSocialHandle){
      try {
          String newHandleMade = createHandle(yourSocialHandle);
          listOfHandles.add(newHandleMade);
      }catch (ArrayIndexOutOfBoundsException e){
          try {
              throw new EmptyException("Cant be empty");
          } catch (EmptyException ex) {
              System.out.println("Enter a new handle that isn't empty you want to add");
          }
      }



    }

    public void removeHandle(String yourSocialHandle){

        try {
            String newHandleMade = createHandle(yourSocialHandle);
            listOfHandles.remove(newHandleMade);
        }catch (ArrayIndexOutOfBoundsException e) {
            try {
                throw new EmptyException("Cant be empty");
            } catch (EmptyException ex) {
                System.out.println("Enter a new handle that isn't empty you want to remove");
            }
        }



    }

    public HashSet<String> getHandles() {
        return listOfHandles;
    }

}
