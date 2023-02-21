package codigo_telescopio_clase;

public class AdaptadorActualesAMesonesias extends LocalizadorAcutal implements LocalizadorMesonesio {

    @Override
    public void ubicarPlanares() {
        ajustarGammas();
        System.out.println("Localizador Mesonesio: Ajustes de los parámetros gammas ajustados para completar las planares con alfas");
        ajustarAlfas();
        System.out.println("<========= Localizador Mesonesio: fin de la ubiación de planares");
    }

    @Override
    public void ubicarGranulos() {
        ajustarAlfas();
        System.out.println("Localizador Mesonesio: Ajustes de los parámetros alfas ajustados para completar los granulos");
        System.out.println("<========= Localizador Mesonesio: fin de la ubicación de granulos");
    }

    @Override
    public void ubicarSemicuantos() {
        ajustarGammas();
        System.out.println("Localizador Mesonesio: Ajustes de los parámetros gammas ajustados para completar los semicuantos");
        System.out.println("<========= Localizador Mesonesio: fin de la ubicación de semicuantos");
    }
}
