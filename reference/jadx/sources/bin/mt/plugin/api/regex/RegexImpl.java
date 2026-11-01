package bin.mt.plugin.api.regex;

import bin.mt.plugin.api.util.ServiceLoader;
import l.C14690;
import l.C9751;
import l.InterfaceC6340;

/* JADX INFO: loaded from: classes.dex */
public class RegexImpl implements InterfaceC6340 {
    public static void register() {
        ServiceLoader.register(InterfaceC6340.class, new RegexImpl());
    }

    @Override // l.InterfaceC6340
    public Pattern compileImpl(String str) {
        return C14690.m35219(str);
    }

    @Override // l.InterfaceC6340
    public Pattern compileImpl(String str, int i) {
        return C14690.m35218(i, str);
    }

    @Override // l.InterfaceC6340
    public void checkReplacementTemplateImpl(Pattern pattern, String str) {
        C9751.m24733((C14690) pattern, str);
    }
}
