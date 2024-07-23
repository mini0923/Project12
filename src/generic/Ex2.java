package generic;

public class Ex2 {

	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder();	//Powder를 재료로 선택
		
		printer.setMaterial(p1);	// Object material = new Powder() 는 가능
		
		Object object = printer.getMaterial();
		
		Powder p2 = (Powder)object;	// 재료를 꺼낼때는 직접 형변환을 해야함(자식이 갖고있는 클래스를 사용하기 위해 다운캐스팅한다)
		
		p2.doPrinting();
		
		System.out.println(p2.toString());

	}

}

class ThreeDPrinter3 {
	
	private Object material;		// 자료형을 Object로 선언하면 파우더와 플라스틱을 모두 저장할 수 있음

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}
	
	
}
