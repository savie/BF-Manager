package l;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܰۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13565 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5097 f44751;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20889 f44752;

    public C13565(C5097 c5097, C20889 c20889) {
        this.f44751 = c5097;
        this.f44752 = c20889;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33158() {
        return this.f44751.f17761;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20889 m33159(String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        boolean zStartsWith = lowerCase.startsWith(".");
        C5097 c5097 = this.f44751;
        C20889 c20889 = this.f44752;
        if (zStartsWith) {
            Iterator it = c20889.m46965().iterator();
            while (it.hasNext()) {
                if (lowerCase.equals(((String) it.next()).toLowerCase(Locale.ROOT))) {
                    return c20889;
                }
            }
            return C5097.m14192(c5097, lowerCase);
        }
        String strM46958 = c20889.m46958();
        return (strM46958 == null || !lowerCase.equals(strM46958.toLowerCase(locale))) ? C5097.m14198(c5097, lowerCase) : c20889;
    }
}
