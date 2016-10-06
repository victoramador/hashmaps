package hashmap;

public class main {
        public static void main(String[] args) {

            SeguridadSocialHashMap seguridadSocialHashMap = new SeguridadSocialHashMap();

            Persona larry = new Persona("23847625J", "3456456347", "larry", "bets", 23, 45000.00);
            Persona sergio =  new Persona("32412456G", "345734677", "sergio", "diaz", 34, 76000.00);
            Persona alfredo = new Persona("765845674H", "4375345734", "alfredo", "aranda", 45, 33333.00);
            Persona fernando = new Persona("342462365G", "347467463", "fernando", "banjo", 65, 34563.34);

            seguridadSocialHashMap.altaPersona(larry);
            seguridadSocialHashMap.altaPersona(sergio);
            seguridadSocialHashMap.altaPersona(alfredo);
            seguridadSocialHashMap.altaPersona(fernando);

            System.out.println("Altas a la seguridad social: " + seguridadSocialHashMap.obtenerTodas());
            System.out.println("Baja a la seuridad social: " + larry);
            seguridadSocialHashMap.bajaPersona(alfredo.getDni());
            System.out.println("Lista de afiliados a la S.S.: " + seguridadSocialHashMap.obtenerTodas());
            System.out.println("obtenerPersonaPorDNI: " + seguridadSocialHashMap.obtenerPersonaPorDNI(fernando.getDni()));
            System.out.println("obtenerPersonaPorNumSS: " + seguridadSocialHashMap.obtenerPersonaPorNumSS(sergio.getNumSS()));

            System.out.println("obtenerPersonasRangoSalarial: " + seguridadSocialHashMap.obtenerPersonasRangoSalarial(23.00, 450000.00));
            System.out.println("obtenerPersonasMayoresQue: " + seguridadSocialHashMap.obtenerPersonasMayoresQue(25));

            System.out.println("obtenerSalarioMinimo: "+ seguridadSocialHashMap.obtenerPersonaPorSalarioMinimo());
            System.out.println("obtenerSalarioMaximo: "+seguridadSocialHashMap.obtenerPersonaPorSalarioMaximo());


            System.out.println("Ordenar por salario"+seguridadSocialHashMap.ordenarPorSalario());
            System.out.println("Ordenar por edad"+seguridadSocialHashMap.ordenarPorEdad());
            System.out.println("Ordenar por DNI"+seguridadSocialHashMap.ordenarPorDNI());
            System.out.println("Ordenar por SS"+seguridadSocialHashMap.ordenarPorSS());

        }
