public class LightBoard {
    private boolean[][] lights;

    public LightBoard (int numRows, int numCol){
        this.lights = new boolean[numRows][numCol];
        int chance;
        for (int a = 0; a < numRows; a++){
            for (int b = 0; b < numCol; b++){
                chance = (int)(Math.random() * 100 +0.1);
                if (chance <= 40){
                    lights[a][b] = true;
                }
            }
        }
    }

    public boolean evaluateLight (int row, int col){
        int count = 0;
        for (int i = 0; i < lights.length; i ++){
            if (lights[i][col] == true){
                count++;
            }
        }
        if (lights[row][col] == true && count%2 == 0){
            return false;
        }
        if (lights[row][col] == false && count%3 == 0){
            return true;
        }
        return lights[row][col];
    }
}


