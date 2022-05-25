package syrupableinterface;

interface Syrupable {
    void getSugary();
}
abstract class Pancake implements Syrupable{

}
class BlueBerryPancake extends Pancake {
    public void getSugary(){;}
}
class SourdoughBlueBerryPancake extends BlueBerryPancake {
    void getSugary(int s)
    {
        ;
    }
}
/*This is alsoacomment//More comments*/
///*This isa// // comment*/



