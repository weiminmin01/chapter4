import com.company.UncleOne;
import com.company.UncleTowSon;
import com.company.UncleTwo;

public class Demo {
    public static void main(String[] args) {
        UncleOne  uncleOne=new UncleOne();
        uncleOne.faHongbao();//继承的方法
        uncleOne.chouyan();


        UncleTwo uncleTwo=new UncleTwo();
        uncleTwo.faHongbao();//覆写之后的方法
        uncleTwo.hejiu();


        UncleTowSon uncleTowSon=new UncleTowSon();
        uncleTowSon.faHongbao();
        uncleTowSon.songche();
    }
}
