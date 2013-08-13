import main.Animal;




public class ImportJavadocMethodCheckExtended
{
    public abstract class Graphics
    {
        public abstract boolean drawImage(Image img, int x, int y,
                ImageObserver observer);

        /**
         * Graphics objects which are provided as arguments to the paint and
         * update methods of Components are automatically disposed by the system
         * when those methods return. Programmers should, for efficiency, call
         * the dispose method when finished using a Graphics object only if it
         * was created directly from a Component or another Graphics object.
         */
        public abstract void dispose();

        /**
         * Disposes of this graphics context once it is no longer referenced.
         * @see #dispose()
         * @since 1.0
         */
        public void finalize()
        {
            dispose();
        }
    }

    public class Animal
    {

        public void speak()
        {
        }
    }

    public class Cat extends Animal
    {

        @Override
        public void speak()
        {
            System.out.println("Meow.");
        }
    }

    public class dog extends Animal
    {

        public void speak() { // fail
                System.out.println("WooF.");
            }
    }

        public final class MaClass {
            public final double PI = 3.14159; 
            public final double[] tailles = {50.2, 60.8};
         
            public void uneMethode() {
                tailles[0] = 99; 
            }
        }
}
