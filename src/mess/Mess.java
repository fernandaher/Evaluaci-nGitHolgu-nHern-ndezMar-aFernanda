package mess;

public enum Mess {

    MENSAJE_NOMBRE("Su nombre es: ");

        private String messs;

Mess(String m){this.messs = m; }

public String getMess(){return messs;}
}
