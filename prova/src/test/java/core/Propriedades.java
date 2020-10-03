package core;

public class Propriedades {
    public static boolean FECHAR_BROWSER = false;
    public static Propriedades.Browsers browser;

    static {
        browser = Browsers.CHROME;
    }

    public Propriedades() {
    }

    public static enum Browsers {
        CHROME,
        FIREFOX;

        private Browsers() {
        }
    }
}
