package bin.mt.plugin.api.regex;

import bin.mt.plugin.api.util.ServiceLoader;
import l.InterfaceC6340;

/* JADX INFO: loaded from: classes.dex */
public final class Regex {
    public static Pattern compile(String str) {
        return ((InterfaceC6340) ServiceLoader.get(InterfaceC6340.class)).compileImpl(str);
    }

    public static Pattern compile(String str, int i) {
        return ((InterfaceC6340) ServiceLoader.get(InterfaceC6340.class)).compileImpl(str, i);
    }

    public static void checkReplacementTemplate(Pattern pattern, String str) {
        ((InterfaceC6340) ServiceLoader.get(InterfaceC6340.class)).checkReplacementTemplateImpl(pattern, str);
    }
}
