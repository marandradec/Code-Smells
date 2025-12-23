package Couplers;

public class IncompleteLibraryClass {
    // No podemos modificar ArrayList, así que la extendemos
    class CustomList extends java.util.ArrayList<String> {

        public String getFirstElement() {
            // Método que NO existe en la clase original
            if (this.isEmpty()) {
                return null;
            }
            return this.get(0);
        }
    }
}
