package com.example.aqpgo;

public class Restaraunte {
    private int imgRes;
    private String NombreRes;
    private int calificacion;
    private String estado;
    private String tipoRes;
    private String pedMin;
    private String timeEntre;

    public Restaraunte(int imgRes, String nombreRes, int calificacion, String estado, String tipoRes, String pedMin, String timeEntre) {
        this.imgRes = imgRes;
        NombreRes = nombreRes;
        this.calificacion = calificacion;
        this.estado = estado;
        this.tipoRes = tipoRes;
        this.pedMin = pedMin;
        this.timeEntre = timeEntre;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getNombreRes() {
        return NombreRes;
    }

    public void setNombreRes(String nombreRes) {
        NombreRes = nombreRes;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoRes() {
        return tipoRes;
    }

    public void setTipoRes(String tipoRes) {
        this.tipoRes = tipoRes;
    }

    public String getPedMin() {
        return pedMin;
    }

    public void setPedMin(String pedMin) {
        this.pedMin = pedMin;
    }

    public String getTimeEntre() {
        return timeEntre;
    }

    public void setTimeEntre(String timeEntre) {
        this.timeEntre = timeEntre;
    }
}
