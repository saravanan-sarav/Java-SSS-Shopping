package MainPackage.controller;

import MainPackage.App;
import MainPackage.controller.impl.IAuthController;
import MainPackage.utils.AppException;
import MainPackage.utils.AppInput;
import MainPackage.utils.StringUtils;
import MainPackage.view.WelcomeView;

import static MainPackage.utils.AppInput.*;
import static MainPackage.utils.Utils.println;

public class AuthController implements IAuthController {
    private final AppController appController;

    public AuthController(AppController appController) {
        this.appController = appController;

    }

    public void authDestination() {
        appController.printDestinationMenu();
        int choice;
        try {
            choice = enterInt(StringUtils.CHOICE_SELECT);
            if(choice == 1){
                login();
            }else if(choice == 2){
                register();
            } else {
                Thread.sleep(500);
                invalid(new AppException(StringUtils.ERROR_MESSAGE));
            }
        } catch (AppException appException){
            invalid(appException);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    private void invalid(AppException e) {
        println(e.getMessage());
        authDestination();

    }

    @Override
    public void login() {
        println("Login Came");

    }

    @Override
    public void register() {
        println("Register Came");
    }

    @Override
    public void logout() {

    }
}
