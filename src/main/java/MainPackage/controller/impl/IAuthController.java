package MainPackage.controller.impl;

public interface IAuthController {
    void login();
    void register();
    void logout();
    void authDestination() throws InterruptedException;
}
