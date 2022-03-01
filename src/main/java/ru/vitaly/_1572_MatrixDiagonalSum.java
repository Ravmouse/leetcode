package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 01.03.2022
 */
public class _1572_MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int i = 0, j = mat.length - 1;
        int cnt = 0;
        int k = 0;
        if (i == j) cnt += mat[k++][i];
        while (i != j) {
            cnt += (mat[k][i++] + mat[k][j--]);
            k++;
            if (j - i == 1) {
                int z = 2;
                while (z > 0) {
                    cnt += mat[k][i] + mat[k][j];
                    k++;
                    z--;
                }
                break;
            }
            if (i == j) {
                cnt += mat[k++][i];
            }
        }
        i--;
        j++;
        while (k < mat.length) {
            cnt += (mat[k][i--] + mat[k][j++]);
            k++;
        }
        return cnt;
    }
}