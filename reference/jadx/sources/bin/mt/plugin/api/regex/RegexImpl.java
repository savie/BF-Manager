package bin.mt.plugin.api.regex;

import bin.mt.plugin.api.util.ServiceLoader;
import l.C18415;
import l.C7974;
import l.InterfaceC3210;

/* JADX INFO: loaded from: classes.dex */
public class RegexImpl implements InterfaceC3210 {
    public static void register() {
        ServiceLoader.register(InterfaceC3210.class, new RegexImpl());
    }

    @Override // l.InterfaceC3210
    public Pattern compileImpl(String str) {
        return C18415.m42925(str);
    }

    @Override // l.InterfaceC3210
    public Pattern compileImpl(String str, int i) {
        return C18415.m42924(i, str);
    }

    @Override // l.InterfaceC3210
    public void checkReplacementTemplateImpl(Pattern pattern, String str) {
        C7974.m21762((C18415) pattern, str);
    }
}
