public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int actualMins){
        if(actualMins>40){
            return 0;
        }
        return 40-actualMins;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layers){
        return 2*layers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layers, int inOvenMins){
        return (layers*2) + inOvenMins;
    }
}
