package MainPackage.controller;

import MainPackage.controller.impl.IAuthController;
import MainPackage.models.User;
import MainPackage.utils.AppException;
import MainPackage.utils.FileUtils;
import MainPackage.utils.IdUtil;
import MainPackage.utils.StringUtils;
import MainPackage.view.HomeView;
import MainPackage.view.LoginView;
import MainPackage.view.RegistrationView;

import java.util.Scanner;

import static MainPackage.utils.AppInput.enterInt;
import static MainPackage.utils.AppInput.enterString;
import static MainPackage.utils.AppScanner.getFileScanner;
import static MainPackage.utils.Utils.println;

public class AuthController implements IAuthController {
    private final AppController appController;
    private LoginView loginView;
    private RegistrationView registrationView;
    private HomeView homeView;

    public AuthController(AppController appController) {
        this.appController = appController;

    }

    public void authDestination() {
        appController.printDestinationMenu();
        int choice;
        try {
            choice = enterInt(StringUtils.CHOICE_SELECT);
            if (choice == 1) {
                login();
            } else if (choice == 2) {
                register();
            } else {
                Thread.sleep(500);
                invalid(new AppException(StringUtils.ERROR_MESSAGE));
            }
        } catch (AppException appException) {
            try {
                Thread.sleep(500);
                invalid(appException);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

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
        this.loginView = new LoginView();
        loginView.loginMenu();
        String email = enterString(StringUtils.ENTER_EMAIL);
        String password = enterString(StringUtils.ENTER_PASSWORD);

        User validUser = isValidUser(email, password);
        if (validUser!=null) {
            homeView = new HomeView();
            homeView.homeMenu();
        } else {
            authDestination();
        }


    }

    public User isValidUser(String email, String password) {
        Scanner fileData = getFileScanner(FileUtils.getCredentials());
        while (fileData.hasNext()) {
            String value = fileData.next();
            if (!value.startsWith("id")) {
                String[] tempLogin = value.split(",");
                if (tempLogin[2].equalsIgnoreCase(email) && tempLogin[3].equalsIgnoreCase(password)) {
                    User user = new User();
                    user.setId(IdUtil.IdGenerator());
                    user.setEmail(email);
                    user.setPassword(password);
                    user.setUserName(tempLogin[1]);
                    return user;
                }
            }
        }
        return null;
    }

    @Override
    public void register() {
        println("Register Came");
        registrationView = new RegistrationView();


    }

    @Override
    public void logout() {

    }
}
