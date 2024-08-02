package LE1.ex4;

public class DadosAluno {

        private int id;
        private double cr;

        public DadosAluno(double cr, int id) {
            this.cr = cr;
            this.id = id;
        }

        public double getCr() {
            return cr;
        }

        public void setCr(double cr) {
            this.cr = cr;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
        this.id = id;
        }
}
