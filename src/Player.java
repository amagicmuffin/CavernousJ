public class Player {
    private char player;
    private int iPos;
    private int jPos;

    public Player(char p, int i, int j) {
        player = p;
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
                MoveLeft(map);
                break;
            case "d":
                MoveRight(map);
                break;
//            case "s":
//                MoveDown();
//                break;
//            case "w":
//                MoveUp();
//                break;
            default:
                throw new Error("Invalid movement command");
        }
    }

    private void MoveLeft(Map map) {
        map.Move(iPos, jPos, iPos, jPos-1);
        jPos--;
    }

    private void MoveRight(Map map) {
        map.Move(iPos, jPos, iPos, jPos+1);
        jPos++;
    }

    private void MoveDown(Map map) {
        map.Move(iPos, jPos, iPos+1, jPos);
        iPos++;
    }

    private void MoveUp(Map map) {
        map.Move(iPos, jPos, iPos-1, jPos);
        iPos--;
    }
}
