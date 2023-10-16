package com.ifms.softmed.domain.enums;

public enum Patologia {

    /* RELAÇÃO DE DOENÇAS PLATAFORMA SOFTMED
    */
    ACIDOSE("Acidose"),
    ALBINISMO("Albinismo"),
    ALCALOSE("Alcalose"),
    AMEBIASE("Amebíase"),
    AMIGDALITE_AGUDA("Amigdalite aguda"),
    AMILOIDOSE("Amiloidose"),
    ANEMIA_APLASTICA("Anemia aplástica"),
    ANEMIA_FALCIFORME("Anemia falciforme"),
    ANEMIA_HEMOLITICA("Anemia hemolítica"),
    ANEMIA_NUTRICIONAL("Anemia nutricional"),
    ANGINA_PECTORIS("Angina pectoris"),
    ATEROSCLEROSE("Aterosclerose"),
    BRONQUITE("Bronquite"),
    COLERA("Cólera"),
    DESNUTRICAO("Desnutrição"),
    DIABETES_MELLITUS("Diabetes mellitus"),
    DISPEPSIA("Dispepsia"),
    DOENCA_ALZHEIMER("Doença de Alzheimer"),
    DOENCA_CHAGAS("Doença de Chagas"),
    DOENCA_CROHN("Doença de Crohn"),
    DOENCA_REFLUXO_GASTROESOFAGICO("Doença de Refluxo Gastroesofágico"),
    DOENCA_DE_VON_WILLEBRAND("Doença de Von Willebrand"),
    EMBOLIA_TROMBOSE_ARTERIAIS("Embolia e trombose arteriais"),
    EMBOLIA_PULMONAR("Embolia pulmonar"),
    ENCEFALOPATIA_TOXICA("Encefalopatia tóxica"),
    ENSCLEROSE_MULTIPLA("Esclerose múltipla"),
    ESPLENOMEGALIA_CONGESTIVA_CRONICA("Esplenomegalia congestiva crônica"),
    FARINGITE_AGUDA("Faringite aguda"),
    FEBRE_REUMATICA_AGUDA("Febre reumática aguda"),
    FEBRE_TIFOIDE("Febre Tifóide"),
    FENILCETONURIA("Fenilcetonúria"),
    FIBROSE_CISTICA("Fibrose cística"),
    HELMINTIASE("Helmintíase"),
    HEMOFILIA("Hemofilia"),
    HEPATITE_VIRAL("Hepatite viral"),
    HIPERTENSAO("Hipertensão"),
    HIPERTIREODISMO("Hipertireoidismo"),
    HIPERURICEMIA("Hiperuricemia"),
    HIPOTIROIDISMO("Hipotiroidismo"),
    IMUNODEFICIENCIA("Imunodeficiência"),
    INFARTO_AGUDO_DO_MIOCARDIO("Infarto agudo do miocárdio"),
    INFLUENZA("Influenza"),
    INSUFICIENCIA_RENAL("Insuficiência renal"),
    INTOLERANCIA_LACTOSE("Intolerância à lactose"),
    LEISHMANIOSE("Leishmaniose"),
    LIPODISTROFIA("Lipodistrofia"),
    MALARIA("Malária"),
    METEMOGLOBINEMIA("Metemoglobinemia"),
    MICOSE("Micose"),
    MUCOPOLISSACARIDOSE("Mucopolissacaridose"),
    NEOPLASIAS("Neoplasias"),
    OBESIDADE("Obesidade"),   ///
    PERICARDITE_AGUDA("Pericardite aguda"),
    PIELONEFRITE("Pielonefrite"),
    PNEUMONIA("Pneumonia"),
    PORFIRIA_CUTANEA("Porfiria cutânea"),
    PURPURA_ALERGICA("Púrpura alérgica"),
    SINDROME_GILBERT("Síndrome de Gilbert"),
    SINDROME_LESCH_NYHAN("Síndrome de Lesch-Nyhan"),
    SINUSITE_AGUDA("Sinusite aguda"),
    TALASSENIA("Talassemia"),
    TUBERCULOSE("Tuberculose"),
    ULCERA("Úlcera"),
    GOTA("GOTA"),
    MIASTENIA("MIASTENIA_GRAVIS"),
    
    TEP("Tromboembolismo pulmonar");

    private String patologia;

    private Patologia(String patologia) {
        this.patologia = patologia;
    }

    public String getPatologia() {
        return patologia;
    }
}
