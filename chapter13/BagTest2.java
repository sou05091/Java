package chapter13;

class Bag2 {
	private Object thing;

	public Bag2(Object thing) {
		this.thing = thing;
	}

	public Object getThing() {
		return thing;
	}

	public void setThing(Object thing) {

	}

	void showType() {
		System.out.println(thing.getClass().getName());
	}
}

class Book2 {}

class PencilCase2 {}

class NoteBook2 {}

public class BagTest2 {
	public static void main(String[] args) {
//		Bag2<Book2> bag = new Bag2<Book2>(new Book2());
//		Bag2<PencilCase2> bag2 = new Bag2<PencilCase2>(new PencilCase2());
//		Bag2<NoteBook2> bag3 = new Bag2<NoteBook2>(new NoteBook2());
//
//		Book2 book =  bag.getThing();
//		PencilCase2 pc = bag2.getThing();
//		NoteBook2 nb = bag3.getThing();

		// bag = bag2; -> 오류가 발생하지 않음 하지만 제네릭으로 할경우 오류가 발생 즉 타입검사를 엄격하게 하여 타입의 안정성을 보장
	}
}
