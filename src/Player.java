public class Player {
    private char player;
    private String facing;
    private int iPos;
    private int jPos;

    public Player(char p, int i, int j) {
        player = p;
        facing = "right";
        iPos = i;
        jPos = j;
    }

    public char getPlayer() {
        return player;
    }

    public int getiPos() {
        return iPos;
    }

    public int getjPos() {
        return jPos;
    }

    public void setiPos(int iPos) {
        this.iPos = iPos;
    }

    public void setjPos(int jPos) {
        this.jPos = jPos;
    }

    public void TryMove(String direction, Map map) {
        // TODO: don't let Player move into walls lmao
        switch (direction) {
            case "a":
                if (Moveable(direction, map)) {
                    MoveLeft(map);
                }
                break;
            case "d":
                if (Moveable(direction, map)) {
                    MoveRight(map);
                }
                break;
            case "s":
                if (Moveable(direction, map)) {
                    MoveDown(map);
                }
                break;
            case "w":
                if (Moveable(direction, map)) {
                    MoveUp(map);
                }
                break;
            default:
                throw new Error("Invalid movement command");
        }
    }

    private boolean Moveable(String direction, Map map) {
        switch (direction) {
            case "a":
                return (map.getTile(iPos, jPos-1) == '.');
            case "d":
                return (map.getTile(iPos, jPos+1) == '.');
            case "s":
                return (map.getTile(iPos+1, jPos) == '.');
            case "w":
                return (map.getTile(iPos-1, jPos) == '.');
            default:
                throw new Error("Something went wrong.");
        }
    }

    private void MoveLeft(Map map) {
        map.Move(iPos, jPos, iPos, jPos-1);
        jPos--;
        facing = "left";
    }

    private void MoveRight(Map map) {
        map.Move(iPos, jPos, iPos, jPos+1);
        jPos++;
        facing = "right";
    }

    private void MoveDown(Map map) {
        map.Move(iPos, jPos, iPos+1, jPos);
        iPos++;
        facing = "down";
    }

    private void MoveUp(Map map) {
        map.Move(iPos, jPos, iPos-1, jPos);
        iPos--;
        facing = "up";
    }
}
