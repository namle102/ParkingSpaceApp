package yorku.eecs3311.gui.list;

public class ListElement<T>{

	private String _name;
	private T _obj;
	public ListElement(String name, T obj) {
		this._name = name;
		this._obj = obj;
	}
	
	public T getObj() {
		return _obj;
	}
	
	@Override
	public String toString() {
		return _name;
	}

}
