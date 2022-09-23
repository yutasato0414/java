public class GenderSpeaker{

        public static void main(String[] args){
                doSpeak(new Man());

                doSpeak(new Woman());
        }

        public static void doSpeak(AbstractPerson person){
               person.speak();
        }
}