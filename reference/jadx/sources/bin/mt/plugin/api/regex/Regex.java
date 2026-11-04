package bin.mt.plugin.api.regex;

import bin.mt.plugin.api.util.ServiceLoader;
import l.InterfaceC3210;

/* JADX INFO: loaded from: classes.dex */
public final class Regex {
    public static Pattern compile(String str) {
        return ((InterfaceC3210) ServiceLoader.get(InterfaceC3210.class)).compileImpl(str);
    }

    public static Pattern compile(String str, int i) {
        return ((InterfaceC3210) ServiceLoader.get(InterfaceC3210.class)).compileImpl(str, i);
    }

    public static void checkReplacementTemplate(Pattern pattern, String str) {
        ((InterfaceC3210) ServiceLoader.get(InterfaceC3210.class)).checkReplacementTemplateImpl(pattern, str);
    }
}
