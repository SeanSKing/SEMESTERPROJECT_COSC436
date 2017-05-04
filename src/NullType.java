/**
 * Created by JamieReed207 on 5/4/17.
 */
public class NullType extends AbstractType {
        private String name = "User does not exist";
        private Boolean Prime = false;


        public String getName(){return name;}

        public Boolean isPrime() {
            return Prime;
        }

}
