package com.ifms.softmed.domain.enums;

public enum Patologia {

    /* RELAÇÃO DE DOENÇAS PLATAFORMA SOFTMED
    */
    ACIDOSE("ACIDOSE"),
    ALBINISMO("ALBINISMO"),
    ALCALOSE("ALCALOSE"),
    AMEBIASE("AMEBIASE"),
    AMIGDALITE_AGUDA("AMIGDALITE_AGUDA"),
    AMILOIDOSE("AMILOIDOSE"),
    ANEMIA_APLASTICA("ANEMIA_APLASTICA"),
    ANEMIA_FALCIFORME("ANEMIA_FALCIFORME"),
    ANEMIA_HEMOLITICA("ANEMIA_HEMOLITICA"),
    ANEMIA_NUTRICIONAL("ANEMIA_NUTRICIONAL"),
    ANGINA_PECTORIS("ANGINA_PECTORIS"),
    ATEROSCLEROSE("ATEROSCLEROSE"),
    BRONQUITE("BRONQUITE"),
    COLERA("COLERA"),
    DESNUTRICAO("DESNUTRICAO"),
    DIABETES_MELLITUS("DIABETES_MELLITUS"),
    DISPEPSIA("DISPEPSIA"),
    DOENCA_ALZHEIMER("DOENCA_ALZHEIMER"),
    DOENCA_CHAGAS("DOENCA_CHAGAS"),
    DOENCA_CROHN("DOENCA_CROHN"),
    DOENCA_REFLUXO_GASTROESOFAGICO("DOENCA_REFLUXO_GASTROESOFAGICO"),
    DOENCA_DE_VON_WILLEBRAND("DOENCA_DE_VON_WILLEBRAND"),
    EMBOLIA_TROMBOSE_ARTERIAIS("EMBOLIA_TROMBOSE_ARTERIAIS"),
    EMBOLIA_PULMONAR("EMBOLIA_PULMONAR"),
    ENCEFALOPATIA_TOXICA("ENCEFALOPATIA_TOXICA"),
    ESCLEROSE_MULTIPLA("ESCLEROSE_MULTIPLA"),
    ESPLENOMEGALIA_CONGESTIVA_CRONICA("ESPLENOMEGALIA_CONGESTIVA_CRONICA"),
    FARINGITE_AGUDA("FARINGITE_AGUDA"),
    FEBRE_REUMATICA_AGUDA("FEBRE_REUMATICA_AGUDA"),
    FEBRE_TIFOIDE("FEBRE_TIFOIDE"),
    FENILCETONURIA("FENILCETONURIA"),
    FIBROSE_CISTICA("FIBROSE_CISTICA"),
    HELMINTIASE("HELMINTIASE"),
    HEMOFILIA("HEMOFILIA"),
    HEPATITE_VIRAL("HEPATITE_VIRAL"),
    HIPERTENSAO("HIPERTENSAO"),
    HIPERTIREODISMO("HIPERTIREODISMO"),
    HIPERURICEMIA("HIPERURICEMIA"),
    HIPOTIROIDISMO("HIPOTIROIDISMO"),
    IMUNODEFICIENCIA("IMUNODEFICIENCIA"),
    INFARTO_AGUDO_DO_MIOCARDIO("INFARTO_AGUDO_DO_MIOCARDIO"),
    INFLUENZA("INFLUENZA"),
    INSUFICIENCIA_RENAL("INSUFICIENCIA_RENAL"),
    INTOLERANCIA_LACTOSE("INTOLERANCIA_LACTOSE"),
    LEISHMANIOSE("LEISHMANIOSE"),
    LIPODISTROFIA("LIPODISTROFIA"),
    MALARIA("MALARIA"),
    METEMOGLOBINEMIA("METEMOGLOBINEMIA"),
    MICOSE("MICOSE"),
    MUCOPOLISSACARIDOSE("MUCOPOLISSACARIDOSE"),
    NEOPLASIAS("NEOPLASIAS"),
    OBESIDADE("OBESIDADE"),
    PERICARDITE_AGUDA("PERICARDITE_AGUDA"),
    PIELONEFRITE("PIELONEFRITE"),
    PNEUMONIA("PNEUMONIA"),
    PORFIRIA_CUTANEA("PORFIRIA_CUTANEA"),
    PURPURA_ALERGICA("PURPURA_ALERGICA"),
    SINDROME_GILBERT("SINDROME_GILBERT"),
    SINDROME_LESCH_NYHAN("SINDROME_LESCH_NYHAN"),
    SINUSITE_AGUDA("SINUSITE_AGUDA"),
    TALASSENIA("TALASSENIA"),
    TUBERCULOSE("TUBERCULOSE"),
    ULCERA("ULCERA"),
    GOTA("GOTA"),
    MIASTENIA("MIASTENIA"),
    
    TEP("TEP");

    private String patologia;

    private Patologia(String patologia) {
        this.patologia = patologia;
    }

    public String getPatologia() {
        return patologia;
    }
}
