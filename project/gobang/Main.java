package project.gobang;

/**
 * 目标: 使用Java语言实现五子棋
 *
 * 五子棋介绍:
 * 五子棋起源于中国，是一种两人对弈的纯策略型棋类游戏。
 * 双方分别使用黑白两色的棋子，下在棋盘直线与横线的交叉点上，先形成五子连珠者获胜。
 * 五子棋能增强思维能力，提高智力，而且富含哲理，有助于修身养性。
 *
 * 程序功能:
 * 双人博弈，有黑方和白方。白方先下子，黑方次之，
 * 下在棋盘直线与横线的交叉点上，先形成五子连珠者获胜。
 *
 * 类结构如下:
 * 1.Main（主类） -> 调用其他类，程序的入口
 * 2.
 *
 * 项目创建时间：2022/7/19
 * 项目最后一次修改时间：2022/7/19
 * @author 李孔庆
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/

    }
}

/**
 * 创建棋盘类，五子棋棋子的落脚点
 *
 * 五子棋盘是方形的，由纵横各15条线组成。15X15形成了225个交叉点。
 *
 * 类最后一次修改时间：2022/7/19
 */
final class Chessboard {
    static int[][] chessboard() {
        //定义AxisX和AxisY两个坐标变量，然后添加入二维数组chessboard，并初始化数组作为棋盘
        int AxisX = 15;
        int AxisY = 15;

        int[][] chessboard = new int[AxisX][AxisY];
        //创建二维数组chessboard

        for (int x = 0; x < AxisX; x++) {
            for (int y = 0; y < AxisY; y++) {
                chessboard[x][y] = 0;
                //添加到chessboard数组里
            }
        }
    return chessboard;
    }
}

/**
 * 定义枚举类棋子（Chessman），
 *
 * 五子棋的棋子分为黑白两色，黑子113枚，白子112枚，黑白子加起来是225枚
 */
enum Chessman {
    /*白色和黑色方*/
    WHILE, BLACK
}

/**
 * 下棋，程序的逻辑
 */
class PlayChess {

}