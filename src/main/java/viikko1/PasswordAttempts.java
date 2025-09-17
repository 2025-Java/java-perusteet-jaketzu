package viikko1;

public class PasswordAttempts {
  public static String login(String[] tries) {
    String result = "Liian monta virheellistä yritystä.";

    for (int i = 0; i < tries.length; i++) {
      if (i >= 3) {
        break;
      }

      if (tries[i].equals("java123")) {
        result = "Tervetuloa!";
        break;
      }
    }

    return result;
  }
}
