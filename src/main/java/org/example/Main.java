package org.example;

import org.example.controller.UserController;
import org.example.model.*;
import org.example.views.ViewUser;
import org.example.utils.Validate;



public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}