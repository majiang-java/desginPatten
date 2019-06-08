package menento;

public class Main {

    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.getInitStatus();
        gameRole.stateDisplay();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemonto(gameRole.saveStatus());
        gameRole.fight();
        gameRole.stateDisplay();

        gameRole.recoveryState(roleStateCaretaker.getRoleStateMemonto());
        gameRole.stateDisplay();
    }
}
