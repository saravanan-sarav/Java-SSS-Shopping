package MainPackage.view;

import MainPackage.utils.StringUtils;

import static MainPackage.utils.Utils.println;

public class WelcomeView {
    public void welcomeMsg(){
        println(StringUtils.WELCOME_MESSAGE);
    }

    public void options() {
        println(StringUtils.AUTH_CHOICE);
    }

}
