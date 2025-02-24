package Comparables;

public class NinosBuenos {
    static class Nino implements Comparable<Nino> {
        private int bondad;
        private int pesoRegalos;

        public Nino(int bondad, int pesoRegalos) {
            this.bondad = bondad;
            this.pesoRegalos = pesoRegalos;
        }

        public int getBondad() {
            return bondad;
        }

        public int getPesoRegalos() {
            return pesoRegalos;
        }

        @Override
        public int compareTo(Nino otro) {
           if (this.bondad == otro.bondad) {
               return Integer.compare(this.pesoRegalos, otro.pesoRegalos);
           }
           return Integer.compare(this.bondad, otro.bondad);
        }

        @Override
        public String toString() {
            return "Bondad: " + bondad + " " + "PesoRegalos: " + pesoRegalos;
        }
    }
}