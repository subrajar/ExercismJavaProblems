import java.util.*;
class RnaTranscription {
    
    String transcribe(String dnaStrand) {
        String rnaStrand="";
        if(dnaStrand==null){
            throw new IllegalArgumentException();
        }
        for(int i=0; i<dnaStrand.length(); i++){
            switch(dnaStrand.charAt(i)){
                case 'G':
                    rnaStrand+="C";
                    break;
                case 'C':
                    rnaStrand+="G";
                    break;
                case 'T':
                    rnaStrand+="A";
                    break;
                case 'A':
                    rnaStrand+="U";
                    break;
            }
        }
        return rnaStrand;
    }

}
