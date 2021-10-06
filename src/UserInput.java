public class UserInput {
    /** process input while viewing map **/
    public static void Input(String userInput, Map map, Player player) {
        // switch statement to call functions if x,y,etc inputs are inputted
        switch (userInput) {
            case "a":
            case "d":
            case "s":
            case "w":
                player.TryMove(userInput, map);
                break;
            default:
                System.out.println("default value");
        }
        map.render();
    }
}
