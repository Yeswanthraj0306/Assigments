package week6.Day1Assignment;

public class Automation extends MultipleLangauge implements Language,TestTool {

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium");
	}

	@Override
	public void Java() {
		System.out.println("Java");
	}
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.ruby();
		obj.Selenium();
		obj.Java();
		obj.python();
	}

}
