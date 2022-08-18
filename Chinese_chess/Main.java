package Chinese_chess;

/**
 * 象棋是中国的古老游戏之一，在中国有着悠久的历史，属于二人对抗性游戏的一种。
 *
 * 由于用具简单，趣味性强，成为流行极为广泛的棋艺活动。中国象棋是中国棋文化也是中华民族的文化瑰宝。
 * 象棋的“象”是一个人，相传象是舜的弟弟，他喜欢打打杀杀，他发明了一种用来模拟战争的游戏，
 * 因为是他发明的，很自然也把这种游戏叫做“象棋”。
 * 到了秦朝末年西汉开国，韩信把象棋进行一番大改，有了楚河汉界，有了王不见王（即白脸将），名字还叫作“象棋”，
 * 然后经过后世的不断修正，一直到宋朝（宋朝人用词不喜欢重复），把红棋原来的“卒”改为“兵”：黑棋的“仕”改为“士”，
 * “相”改为“象”，象棋的样子基本完善。棋盘里的河界，又名“楚河汉界”。
 *
 * 我将利用java语言来模拟中国象棋的基本玩法（没有GUI界面）
 * 类的布局如下:
 * Main（主类）
 * ChessBoard类（棋盘）
 * Gamer类（玩家）
 * ChessNan类（棋子）
 *
 * @author 李孔庆
 * time 2022.7.1
 */
public class Main {
    //主类
    public static void main(String[] args) {

    }
}

class ChessBoard {
    public void chessBoard() {
        /*定义AxisX和AxisY两个坐标变量，然后添加入二维数组chessboard，并初始化数组作为棋盘
         *
         * 象棋的棋局布局为10行9列（中间有一条楚河汉界）
         */
        byte AxisX = 10;
        byte AxisY = 9;
        //棋盘
        int[][] chessboard = new int[AxisX][AxisY];

        //循环向数组添加元素
        for (int x = 0; x < AxisX; x++) {
            for (int y = 0; y < AxisY; y++) {
                chessboard[x][y] = 0;
            }
        }
    }
}

/**
 * 定义玩家类（Gamer），有红方和黑方阵营玩家在开局前自由选择游戏阵营
 *
 * 对局时，双方轮流各走一招，直至分出胜、负、和，对局即终了。
 * 轮到走棋的一方，将某个棋子从一个交叉点走到另一个交叉点，
 * 或者吃掉对方的棋子而占领其交叉点，都算走了一着。
 * 双方各走一着，称为一个回合。
 */
enum Gamer {
    //红方和蓝方阵营
    RED_SQUARE, BLACK
}

/**
 * 定义抽象父类棋子类，由子类chessman继承重写
 *
 * 共有32个棋子，分红方、黑方，每方各16个，各有七个品种。
 * 定义象棋的棋子，棋子分为红方和黑方，
 * 黑方有：将一个，车、马、炮、象、士各两个，卒五个
 * 红方有：帅一个，车、马、炮、相、仕各两个，兵五个
 */
abstract class AbstractChessMan {
    /*棋子的属性*/
    //每个棋子都有名字
    public final String chessName;
    //每个棋子都有颜色
    public final String chessColor;

    AbstractChessMan(String chessName, String chessColor) {
        //定义构造器
        this.chessName = chessName;
        this.chessColor = chessColor;
    }
    void setChessName(String chessName) {

    }
    void setChessColor(String chessColor) {

    }

    /*不同种类棋子的实现*/
    abstract void PersonalityPieces();

}

/**
 * 子类继承父类AbstractChessMan
 *
 * 实现棋子将军类
 */
class CheckMate extends AbstractChessMan {
    CheckMate(String chessName, String chessColor) {
        super(chessName, chessColor);
    }

    @Override
    void setChessName(String chessName) {
        //设置棋子名字
        super.setChessName(chessName);
    }

    @Override
    void setChessColor(String chessColor) {
        //设置棋子颜色
        super.setChessName(chessColor);
    }

    String getChessName() {
            //返回棋子名字
            return super.chessName;
    }

    void PersonalityPieces() {
        //重写父类PersonalityPieces方法
        
    }
}
