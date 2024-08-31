package uni.prog2.model;

public class Preguntas {

    private int id;
    private double idPreguntas;
    private long telegramid;
    private String respuesta;
    private String seccion;

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getId() {
        return id;
    }

    public double getIdPreguntas() {
        return idPreguntas;
    }

    public void setIdPreguntas(double idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTelegramid() {
        return telegramid;
    }

    public void setTelegramid(long telegramid) {
        this.telegramid = telegramid;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
