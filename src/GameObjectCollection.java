import java.util.ArrayList;

/**
 * Holds a collection of GameObjects and provides a method to return an Iterator().
 * @author Tyler Thomas
 *
 */
class GameObjectCollection {

	private ArrayList<GameObject> theCollection;

	GameObjectCollection() {
		theCollection = new ArrayList<GameObject>();
	}

	public void add(GameObject gObj) {
		theCollection.add(gObj);
	}

	public Iterator getIterator() {
		return new GameObjectIterator();
	}

	public void remove(GameObject gObj) {
		theCollection.remove(gObj);	
	}
	
	/**
	 * Provides standard Iterator Methods for the GameObjectCollection class.
	 * @author Tyler Thomas
	 *
	 */
	private class GameObjectIterator implements Iterator {
		private int currElementIndex;

		GameObjectIterator(){
			currElementIndex = 0;
		}

		@Override
		public boolean hasNext() {
			return !(currElementIndex >= theCollection.size());
		}

		@Override
		public GameObject getNext() {
			GameObject gObj = theCollection.get(currElementIndex);
			currElementIndex++;
			return gObj;
		}
	}
}
