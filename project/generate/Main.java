package project.generate;

/**
 * 项目目标: 生成“李孔庆”三个大字
 *
 * @author 李孔庆
 * time: 2022/7/30
 */
public class Main {
    public static void main(String[] args) {
        /*main函数*/
        GenerateLi generateLi = new GenerateLi();
        generateLi.printTheInitialsWood();
    }
}

/**
 * 定义接口Generate
 *
 * 规范:除了Main类之外都要实现这个接口,
 * 实现生成名字，满足项目需求
 * 接口方法: generate
 *
 * @author 李孔庆
 * Generate接口定义时间:2022/7/30
 */
interface Generate {
    //定义generate()抽象方法
    abstract public void generate();
}

/**
 * 定义类GenerateLi
 *
 * 实现打印”李“字
 */
final class GenerateLi implements Generate {

    @Override
    public void generate() {

    }

    public void printTheInitialsWood() {
        /*打印部首“木”*/
        for (int x = 0; x <= 5; x++) {
            System.out.print("*");
            for (int y = 0; y <= x; y++) {
                System.out.print("*\n");
            }
        }
    }
}