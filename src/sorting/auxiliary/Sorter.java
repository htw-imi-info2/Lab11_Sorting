package sorting.auxiliary;

public interface Sorter<E extends Comparable<E>> {
	public abstract void sort(E[] arrayToBeSortedInPlace);
}

