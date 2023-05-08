package chapter13;
class Bag<T extends Solid>{
	private T thing;
	public Bag(T thing) {
		this.thing = thing;
	}
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	void showType() {
		System.out.println(thing.getClass().getName());
	}
}
class Solid{}
class Liquid{}

class Book extends Solid{}
class PencilCase extends Solid{}
class NoteBook extends Solid{}

class Water extends Liquid{}
class Coffee extends Liquid{}
public class BagText04 {
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<> (new PencilCase());
		Bag<NoteBook> bag3 = new Bag<>(new NoteBook());
//		Bag<Coffee> bag5 = new Bag<>(new Coffee());
	}

}
