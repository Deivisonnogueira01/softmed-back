package com.ifms.softmed.domain.enums;

public enum Patologia {

    GOTA("GOTA"),
    MIASTENIA("MIASTENIA"),
    OBESIDADE("OBESIDADE"),
    TEP("TEP");

    private String patologia;

    private Patologia(String patologia) {
        this.patologia = patologia;
    }

    public String getPatologia() {
        return patologia;
    }
}
