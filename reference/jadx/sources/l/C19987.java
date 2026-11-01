package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩶ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19987 extends EnumC21210 {
    public /* synthetic */ C19987() {
        this("RcdataLessthanSign", 10);
    }

    public C19987(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        if (c12931.m32035('/')) {
            c20692.m46543();
            c20692.m46538(EnumC21210.f69034);
            return;
        }
        if (c12931.m32038() && c20692.m46533() != null) {
            String str = "</" + c20692.m46533();
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (c12931.m32029(lowerCase) <= -1 && c12931.m32029(upperCase) <= -1) {
                AbstractC8698 abstractC8698M46534 = c20692.m46534(false);
                String strM46533 = c20692.m46533();
                abstractC8698M46534.f29923 = strM46533;
                abstractC8698M46534.f29922 = strM46533 != null ? strM46533.toLowerCase(locale) : "";
                c20692.f67307 = abstractC8698M46534;
                c20692.m46540();
                c12931.m32040();
                c20692.m46532(EnumC21210.f69077);
                return;
            }
        }
        c20692.m46536("<");
        c20692.m46532(EnumC21210.f69045);
    }
}
