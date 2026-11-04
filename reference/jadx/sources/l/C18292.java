package l;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܿۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18292 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19038 f59638;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16800 f59639;

    public C18292(C19038 c19038, C16800 c16800) {
        this.f59638 = c19038;
        this.f59639 = c16800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42618() {
        return this.f59638.f61666;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16800 m42619(String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        boolean zStartsWith = lowerCase.startsWith(".");
        C19038 c19038 = this.f59638;
        C16800 c16800 = this.f59639;
        if (zStartsWith) {
            Iterator it = c16800.m39687().iterator();
            while (it.hasNext()) {
                if (lowerCase.equals(((String) it.next()).toLowerCase(Locale.ROOT))) {
                    return c16800;
                }
            }
            return C19038.m44125(c19038, lowerCase);
        }
        String strM39683 = c16800.m39683();
        return (strM39683 == null || !lowerCase.equals(strM39683.toLowerCase(locale))) ? C19038.m44133(c19038, lowerCase) : c16800;
    }
}
