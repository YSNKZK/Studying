package all_exe;
import algorithm.Bobble;
import learn.Basic;
import learn.LearnClassAndMethod;
import learn.LearnInt;
import learn.LearnString;


public class All_exe {

	public static void main(String[] args) {

		Basic.main(args);
		System.out.println("Test,ここまで--------------------------------------------------------------------------");

		LearnString.main(args);
		System.out.println("Test2,ここまで-----------------------------------------------------------------------");

		LearnInt test3=new LearnInt();
		test3.main();
		System.out.println("Test3,ここまで----------------------------------------------------------------------");

		LearnClassAndMethod.main(args);
		System.out.println("Test4,ここまで------------------------------------------------------------------");

		Bobble.main(args);
		System.out.println("Bobble,ここまで------------------------------------------------------------------");


	}

}
