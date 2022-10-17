package structural.facade.solution;

public class Main {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.start();
    }
}

/* Use Case:
    1. Suppose if DB was to be a monolithic architecture, we know that Auto Provisioning  we need to do a lot of steps.
        APITokenGenerator genToken = new APITokenGenerator();
        ...
        Authentication auth = new Authentication(genToken);
        ..
        CreateUserAccount userAccount = new CreateUserAccount(auth, genToken);
        ...

    So instead of calling all these whenever autoprovisioning is required,
    we can create a class, which will generate all those object and execute all steps.

        AutoProvisioning provisioning = new AutoProvisioning();
        provisioning.do();

 */