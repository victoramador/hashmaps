package hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class SeguridadSocialHashMap{

    private HashMap<String, Persona> personasMapSS;
    private HashMap<String, Persona> personasMapDNI;

    public SeguridadSocialHashMap() {

        personasMapSS = new HashMap <String, Persona>();
        personasMapDNI = new HashMap <String, Persona>();

    }

    public void altaPersona(Persona persona) {
        if (!personasMapDNI.containsKey(persona.getNumSS()) && !personasMapSS.containsKey(persona.getNumSS())){

            personasMapDNI.put(persona.getDni(), persona);
            personasMapSS.put(persona.getNumSS(), persona);

        }

        else{
            System.out.println("Esta persona ya existia");
        }
    }

    public void bajaPersona(String dni) {
        if (personasMapDNI.containsKey(dni)){

            personasMapSS.remove(obtenerPersonaPorDNI(dni));
            personasMapDNI.remove(dni);

        }

        else{
            System.out.println("No existe dni");
        }
    }

    public Persona obtenerPersonaPorDNI(String dni) {
        return personasMapDNI.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        return personasMapSS.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        return personasMapSS.values().stream().filter(persona -> persona.getSalario() >= min && persona.getSalario() < max).collect(Collectors.toList());
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        return personasMapSS.values().stream().filter(persona -> persona.getEdad() >= edad).collect(Collectors.toList());
    }

    public HashMap<String,Persona> obtenerTodas(){
        return personasMapSS;
    }



    public Optional<Persona> obtenerPersonaPorSalarioMinimo(){
        return personasMapDNI.values().stream().min(Comparator.comparing(Persona::getSalario));
    }

    public Optional<Persona> obtenerPersonaPorSalarioMaximo(){
        return personasMapDNI.values().stream().max(Comparator.comparing(Persona::getSalario));
    }
    

    @Override
    public String toString() {
        return "SeguridadSocial HashMap{" +
                "personasSS=" + personasMapSS +
                "personasDni" + personasMapDNI+
                '}';
    }

}