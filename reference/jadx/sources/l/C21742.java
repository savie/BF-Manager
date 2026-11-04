package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩷֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C21742 extends EnumC13820 {
    public /* synthetic */ C21742() {
        this("RcdataLessthanSign", 10);
    }

    public C21742(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        if (c3952.m12691('/')) {
            c13646.m33398();
            c13646.m33391(EnumC13820.f43843);
            return;
        }
        if (c3952.m12684() && c13646.m33386() != null) {
            String str = "</" + c13646.m33386();
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (c3952.m12678(lowerCase) <= -1 && c3952.m12678(upperCase) <= -1) {
                AbstractC2460 abstractC2460M33387 = c13646.m33387(false);
                String strM33386 = c13646.m33386();
                abstractC2460M33387.f7901 = strM33386;
                abstractC2460M33387.f7904 = strM33386 != null ? strM33386.toLowerCase(locale) : "";
                c13646.f43330 = abstractC2460M33387;
                c13646.m33397();
                c3952.m12688();
                c13646.m33401(EnumC13820.f43874);
                return;
            }
        }
        c13646.m33389("<");
        c13646.m33401(EnumC13820.f43834);
    }
}
