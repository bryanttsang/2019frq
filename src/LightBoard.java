public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCol) {
        lights = new boolean[numRows][numCol];
        int chance;
        for (int a = 0; a < numRows; a++) {
            for (int b = 0; b < numCol; b++) {
                chance = (int) (Math.random() * 100 + 0.1);
                if (chance <= 40) {
                    lights[a][b] = true;
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col) {
        int count = 0;
        for (int i = 0; i < lights.length; i++) {
            if (lights[i][col] == true) {
                count++;
            }
        }
        if (lights[row][col] == true && count % 2 == 0) {
            return false;
        }
        if (lights[row][col] == false && count % 3 == 0) {
            return true;
        }
        return lights[row][col];
    }

    public void printLightBoard() {
        String board = "";
        for (int a = 0; a < lights.length; a++) {
            for (int b = 0; b < lights[0].length; b++) {
                if (lights[a][b] == true) {
                    board += "true ";
                } else {
                    board += "false ";
                }
            }
            board += "\n";
        }
        System.out.println(board);
    }

    public static void main(String[] args) {
        LightBoard sim = new LightBoard(5, 5);
        sim.printLightBoard();
        System.out.println(sim.evaluateLight(3,3));
    }
}

