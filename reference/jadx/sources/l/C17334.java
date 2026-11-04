package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܽۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17334 extends AbstractC13228 {
    @Override // l.AbstractC13228
    /* JADX INFO: renamed from: ۙ */
    public final C8995 mo31020(String str) {
        C0496 c0496 = new C0496();
        c0496.m2394(C23302.f75464);
        c0496.m2397(str);
        try {
            C9444 c9444Execute = C23302.f75465.m54450(c0496.m2389()).execute();
            AbstractC8699 abstractC8699M24818 = c9444Execute.m24818();
            String strSubstring = null;
            InputStream inputStreamM23391 = abstractC8699M24818 != null ? abstractC8699M24818.m23391() : null;
            if (inputStreamM23391 == null) {
                throw new IllegalStateException("Response does not contain body: ".concat(str));
            }
            String strM24817 = c9444Execute.m24817("Content-Type");
            if (strM24817 != null) {
                int iIndexOf = strM24817.indexOf(59);
                strSubstring = iIndexOf > -1 ? strM24817.substring(0, iIndexOf) : strM24817;
            }
            return AbstractC7504.m20557(inputStreamM23391, strSubstring);
        } catch (Throwable th) {
            throw new IllegalStateException("Exception obtaining network resource: ".concat(str), th);
        }
    }

    @Override // l.AbstractC13228
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo31019() {
        return Arrays.asList(a.s, b.a);
    }
}
