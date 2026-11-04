package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ᩳۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O546 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18880 extends AbstractC3964 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C21118 f61285;

    public C18880(C11421 c11421) {
        mo6095(c11421);
        C11421 c11422 = new C11421("WINDOWS", "MM-dd-yy kk:mm", null);
        c11422.m28768("MM-dd-yy kk:mm");
        C21118 c21118 = new C21118();
        this.f61285 = c21118;
        c21118.mo6095(c11422);
    }

    @Override // l.AbstractC3964
    /* JADX INFO: renamed from: ۙ */
    public final C11421 mo1714() {
        return new C11421("WINDOWS", "MM-dd-yy hh:mma", null);
    }

    @Override // l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ */
    public final C17388 mo1715(String str) {
        if (!m12703(str)) {
            return null;
        }
        C17388 c17388 = new C17388();
        c17388.m40844(str);
        String str2 = m12701(1) + " " + m12701(2);
        String strM12701 = m12701(3);
        String strM12702 = m12701(4);
        String strM12703 = m12701(5);
        if (strM12703 == null || strM12703.equals(".") || strM12703.equals("..")) {
            return null;
        }
        try {
            try {
                c17388.m40831(m12702(str2));
            } catch (ParseException unused) {
            }
        } catch (ParseException unused2) {
            c17388.m40831(this.f61285.m48214(str2));
        }
        c17388.m40835(strM12703);
        if ("<DIR>".equals(strM12701)) {
            c17388.m40827(1);
            c17388.m40829(0L);
        } else {
            c17388.m40827(0);
            if (strM12702 != null) {
                c17388.m40829(Long.parseLong(strM12702));
            }
        }
        return c17388;
    }
}
