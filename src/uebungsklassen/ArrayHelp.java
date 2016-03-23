package uebungsklassen;

public class ArrayHelp {
	
	/* Liefert die Anzahl an "echten" Elementen im Array */
	public static int getElementCount(Object[] a) {
		int count = 0;
		for (Object s : a) {
			if (s != null) {
				count++;
			}
		}
		return count;
	}

	/* Liefert die Anzahl der "freien" Fächer im Array */
	public static int getFreeSlotCount(Object[] a) {
		int count = a.length - getElementCount(a);
		
		return count;
	}

	/*
	 * Liefert den Index des ersten "freien" Fachs im Array, -1 falls kein
	 * freies Fach mehr vorhanden.
	 */
	public static int getNextFreeSlot(Object[] a) {
		int freeSlot = -1;
		boolean continueSearch = true;
		for (int i = 0; i < a.length; i++) {
			if (continueSearch) {
				if (a[i] == null) {
					freeSlot = i;
					continueSearch = false;
				}
			}
		}
		return freeSlot;
	}
}
