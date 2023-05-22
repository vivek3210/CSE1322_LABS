public class Lab1 {
    public static char[][] make_forward() {
        char[][] pixel = new char[4][13];
        pixel[0][0] = ' ';
        pixel[0][1] = ' ';
        pixel[0][2] = '_';
        pixel[0][3] = '_';
        pixel[0][4] = '_';
        pixel[0][5] = '_';
        pixel[0][6] = '_';
        pixel[0][7] = '_';
        pixel[0][8] = ' ';
        pixel[0][9] = ' ';
        pixel[0][10] = ' ';
        pixel[0][11] = ' ';
        pixel[0][12] = ' ';
        pixel[1][0] = ' ';
        pixel[1][1] = '/';
        pixel[1][2] = '|';
        pixel[1][3] = '_';
        pixel[1][4] = '|';
        pixel[1][5] = '|';
        pixel[1][6] = '_';
        pixel[1][7] = '\\';
        pixel[1][8] = '\'';
        pixel[1][9] = '.';
        pixel[1][10] = '_';
        pixel[1][11] = '_';
        pixel[1][12] = ' ';
        pixel[2][0] = '(';
        pixel[2][1] = ' ';
        pixel[2][2] = ' ';
        pixel[2][3] = ' ';
        pixel[2][4] = '_';
        pixel[2][5] = ' ';
        pixel[2][6] = ' ';
        pixel[2][7] = ' ';
        pixel[2][8] = ' ';
        pixel[2][9] = '_';
        pixel[2][10] = ' ';
        pixel[2][11] = '_';
        pixel[2][12] = '\\';
        pixel[3][0] = '=';
        pixel[3][1] = '\'';
        pixel[3][2] = '-';
        pixel[3][3] = '(';
        pixel[3][4] = '_';
        pixel[3][5] = ')';
        pixel[3][6] = '-';
        pixel[3][7] = '-';
        pixel[3][8] = '(';
        pixel[3][9] = '_';
        pixel[3][10] = ')';
        pixel[3][11] = '-';
        pixel[3][12] = '\'';
        return pixel;
    }

    public static char[][] make_mirror() {
        char[][] mirroredPixel = new char[4][13];
        mirroredPixel[0][0] = ' ';
        mirroredPixel[0][1] = ' ';
        mirroredPixel[0][2] = '_';
        mirroredPixel[0][3] = '_';
        mirroredPixel[0][4] = '_';
        mirroredPixel[0][5] = '_';
        mirroredPixel[0][6] = '_';
        mirroredPixel[0][7] = '_';
        mirroredPixel[0][8] = ' ';
        mirroredPixel[0][9] = ' ';
        mirroredPixel[0][10] = ' ';
        mirroredPixel[0][11] = ' ';
        mirroredPixel[0][12] = ' ';
        mirroredPixel[1][0] = ' ';
        mirroredPixel[1][1] = '\\';
        mirroredPixel[1][2] = '|';
        mirroredPixel[1][3] = '_';
        mirroredPixel[1][4] = '|';
        mirroredPixel[1][5] = '|';
        mirroredPixel[1][6] = '_';
        mirroredPixel[1][7] = '/';
        mirroredPixel[1][8] = '\'';
        mirroredPixel[1][9] = '.';
        mirroredPixel[1][10] = '_';
        mirroredPixel[1][11] = '_';
        mirroredPixel[1][12] = ' ';
        mirroredPixel[2][0] = ')';
        mirroredPixel[2][1] = ' ';
        mirroredPixel[2][2] = ' ';
        mirroredPixel[2][3] = ' ';
        mirroredPixel[2][4] = '_';
        mirroredPixel[2][5] = ' ';
        mirroredPixel[2][6] = ' ';
        mirroredPixel[2][7] = ' ';
        mirroredPixel[2][8] = ' ';
        mirroredPixel[2][9] = '_';
        mirroredPixel[2][10] = ' ';
        mirroredPixel[2][11] = '_';
        mirroredPixel[2][12] = '/';
        mirroredPixel[3][0] = '=';
        mirroredPixel[3][1] = '\'';
        mirroredPixel[3][2] = '-';
        mirroredPixel[3][3] = ')';
        mirroredPixel[3][4] = '_';
        mirroredPixel[3][5] = '(';
        mirroredPixel[3][6] = '-';
        mirroredPixel[3][7] = '-';
        mirroredPixel[3][8] = ')';
        mirroredPixel[3][9] = '_';
        mirroredPixel[3][10] = '(';
        mirroredPixel[3][11] = '-';
        mirroredPixel[3][12] = '\'';
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 12; j++) {
                int x = 0;
                int y = 12;
                while (x < y) {
                    char temp = mirroredPixel[i][x];
                    mirroredPixel[i][x] = mirroredPixel[i][y];
                    mirroredPixel[i][y] = temp;
                    x++;
                    y--;
                }
            }
        }
        return mirroredPixel;
    }

    public static void main(String[] args) {
        char[][] arr1 = new char[4][13];
        arr1 = make_forward();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        char[][] arr2 = new char[4][13];
        arr2 = make_mirror();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i <= 3; i++) {
            System.out.println("");
            for (int j = 0; j <= 12; j++) {
                System.out.print(arr1[i][j]);
            }
            for (int j = 0; j <= 12; j++) {
                System.out.print(arr2[i][j]);
            }
        }
    }
}
