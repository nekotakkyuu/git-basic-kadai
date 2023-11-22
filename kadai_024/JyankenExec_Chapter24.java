package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String my = jyanken.getMyChoice();
		String you = jyanken.getRandom();
		
		jyanken.playGame(my, you);

	}

}
